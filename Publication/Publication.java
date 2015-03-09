package com.company;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Дмитрий on 02.03.2015.
 */
public class Publication {
    String text;
    Date d = new Date();
    Calendar c = Calendar.getInstance();
    int h, m, s;

    public Publication(String text){
        this.text = text;
        h = c.get(c.HOUR_OF_DAY);
        m = c.get(c.MINUTE);
        s = c.get(c.SECOND);
    }

    public void publish(){
        System.out.println(text);
        System.out.println("\n" + "Date: " +  h + ":" + m + ":" + s + "\n");
    }
}
