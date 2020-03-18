package com.luocj.pattern.lesson10;

/**
 * @auth cj.luo
 * @date 2020/3/18
 */
public abstract class AbstractCommand implements Command {

    private String command;

    public AbstractCommand(String command) {
        this.command = command;
    }

    @Override
    public String getCommand() {
        return command;
    }
}
