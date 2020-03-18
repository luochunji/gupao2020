package com.luocj.pattern.lesson10;

/**
 * @auth cj.luo
 * @date 2020/3/18
 */
public class ConnectCommand extends AbstractCommand implements Command {
    public ConnectCommand(String command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("连接中。。。");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("连接成功。。。");
    }
}
