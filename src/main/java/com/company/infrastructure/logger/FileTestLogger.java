package com.company.infrastructure.logger;

import java.io.FileWriter;

public class FileTestLogger extends TestLogger {

    @Override
    public void log(String msg) {
        try {
            FileWriter fw = new FileWriter("log.txt", true);
            fw.append(msg + "\n");
            fw.close();
        } catch (Exception ex) {
    }
}
}
