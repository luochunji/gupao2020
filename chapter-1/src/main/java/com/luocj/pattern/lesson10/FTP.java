package com.luocj.pattern.lesson10;

import java.util.HashMap;
import java.util.Map;

/**
 * @auth cj.luo
 * @date 2020/3/18
 */
public class FTP {

    private Map<String,Command> commandMap;

    public FTP() {
        this.commandMap = new HashMap<>();
    }

    public void addCommand(Command command){
        commandMap.put(command.getCommand(),command);
    }

    public void execute(String c){
        System.out.println("当前命令："+c);
        Command command = commandMap.get(c);
        if(null == command){
            System.out.println("无此命令");
            return;
        }
        command.execute();
        System.out.println("***********************");
    }
}
