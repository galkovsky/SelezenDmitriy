package com.company;

/**
 * Created by Дмитрий on 02.03.2015.
 */
public class Announcement extends Publication{
    String headline = "----- Announcement -----";

    Announcement(String text){
        super(text);
    }

    public void publish() {
        System.out.println(headline);
        super.publish();
    }
}
