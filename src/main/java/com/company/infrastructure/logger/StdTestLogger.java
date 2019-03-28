package com.company.infrastructure.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StdTestLogger implements TestLogger{

    int count = 1;

    @Override
    public void logger(String message) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SS");
        String time = dateFormat.format(new Date());

        String formattedMessage = count++ +") " + time + "[" + Thread.currentThread().getName() + "]:" + message;

        System.out.println(formattedMessage);
    }
}