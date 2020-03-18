package com.luocj.pattern.lesson10;

/**
 * @auth cj.luo
 * @date 2020/3/18
 */
public class HelpCommand extends AbstractCommand implements Command {

    public HelpCommand(String command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("connect  连接");
        System.out.println("upload   上传");
        System.out.println("download 下载");
        System.out.println("quit     退出");
    }
}
