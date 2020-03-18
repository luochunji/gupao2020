package com.luocj.pattern.lesson10;

/**
 * @auth cj.luo
 * @date 2020/3/18
 */
public class UploadCommand extends AbstractCommand implements Command {
    public UploadCommand(String command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("文件上传中。。。");
    }
}
