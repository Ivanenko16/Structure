package com.company.infrastructure.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StdTestLogger extends TestLogger {

    int step = 1;

    @Override
    public void log(String msg){

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        String time = sdf.format(new Date());

        String formattedMsg = step + ") " + time + "[" + Thread.currentThread().getName() + "]" + msg;

        System.out.println(formattedMsg);
        step++;
    }
}
