package com.luocj.pattern.lesson4;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @auth cj.luo
 * @date 2020/3/3
 */
public class CustomerProxy {

    //硬编码代理对象名称
    private static final String proxyClassName = "$Proxy0";

    public static Object newProxyInstance(CustomerClassLoader loader,
                                          Class<?>[] interfaces,
                                          CustomerInvocationHandler h) {

        try {
            //1、生成代理类java文件
            File f = generatorProxy(interfaces);
            //2、编译代理类java为class
            compilerJava(f);
            //3、自定义加载器加载class
            Class clazz = loader.findClass(proxyClassName);
            //4、生成代理对象并返回
            Constructor c = clazz.getConstructor(CustomerInvocationHandler.class);
            return c.newInstance(h);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 生成代理类java文件
     *
     * @param interfaces
     * @return
     */
    private static File generatorProxy(Class<?>[] interfaces) {
        //接口名
        Class clazz = interfaces[0];
        String interfaceName = clazz.getName();

        //换行
        String newLine = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append("package " + clazz.getPackage().getName() + ";").append(newLine);
        sb.append("import java.lang.reflect.Method;").append(newLine);
        sb.append("public class " + proxyClassName + " implements " + interfaceName + "{").append(newLine);
        sb.append("protected CustomerInvocationHandler h;").append(newLine);
        sb.append("public " + proxyClassName + "(CustomerInvocationHandler h){").append(newLine);
        sb.append(" this.h = h; ").append(newLine);
        sb.append("}").append(newLine);
        for (Method m : clazz.getMethods()) {
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(");
            //这里输出参数
            for (int i = 0; i < m.getParameterTypes().length; i++) {
                sb.append(m.getParameterTypes()[i].getName() + " a" + i);
                if (i != m.getParameterTypes().length - 1) {
                    sb.append(",");
                }
            }
            sb.append("){").append(newLine);
            sb.append("try{").append(newLine);
            sb.append("Method m = " + interfaceName + ".class.getMethod(\"" + m.getName() + "\",new Class[]{");
            for (int i = 0; i < m.getParameterTypes().length; i++) {
                sb.append(m.getParameterTypes()[i].getName()+".class");
                if (i != m.getParameterTypes().length - 1) {
                    sb.append(",");
                }
            }
            sb.append("});").append(newLine);
            sb.append("this.h.invoke(this,m,new Object[]{");
            for (int i = 0; i < m.getParameterTypes().length; i++) {
                sb.append("a" + i);
                if (i != m.getParameterTypes().length - 1) {
                    sb.append(",");
                }
            }
            sb.append("});").append(newLine);
            sb.append("}catch(Throwable e){").append(newLine);
            sb.append("}").append(newLine);
            sb.append("}").append(newLine);

        }
        sb.append("}").append(newLine);
        String src = sb.toString();
        File file = new File(CustomerProxy.class.getResource("").getPath() + "/" + proxyClassName + ".java");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    /**
     * 编译代理类
     *
     * @param f
     */
    private static void compilerJava(File f) {
        //java编译器
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manager.getJavaFileObjects(f);
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
        task.call();
        try {
            manager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //删除Java文件
            f.delete();
        }
    }
}
