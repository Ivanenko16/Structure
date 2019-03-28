package com.company.infrastructure.logger;

import java.io.FileWriter;
import java.io.IOException;

public class FileTestLogger implements TestLogger {


    @Override
    public void logger(String msg) {

        try {
            FileWriter writer = new FileWriter("log");
            writer.append(msg);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}