package com.company;

/**
 * Created by Дмитрий on 02.03.2015.
 */
public class News extends Publication{
    String headline = "----- NEWS -----";

    News(String text){
        super(text);
    }

    public void publish() {
        System.out.println(headline);
        super.publish();
    }
}
