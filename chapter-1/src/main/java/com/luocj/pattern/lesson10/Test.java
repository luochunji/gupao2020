package com.luocj.pattern.lesson10;

/**
 * @auth cj.luo
 * @date 2020/3/18
 */
public class Test {

    public static void main(String[] args) {
        //客户端初始化
        FTP ftp = new FTP();
        ftp.addCommand(new HelpCommand("help"));
        ftp.addCommand(new ConnectCommand("connect"));
        ftp.addCommand(new DownloadCommand("download"));
        ftp.addCommand(new UploadCommand("upload"));
        ftp.addCommand(new QuitCommand("quit"));


        ftp.execute("help");
        ftp.execute("connect");
        ftp.execute("upload");
        ftp.execute("download");
        ftp.execute("quit");

    }
}
