package com.luocj.pattern.lesson10;

/**
 * @auth cj.luo
 * @date 2020/3/18
 */
public class QuitCommand extends AbstractCommand implements Command {
    public QuitCommand(String command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("已退出。。。");
    }
}
