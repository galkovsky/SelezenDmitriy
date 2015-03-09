package com.company;

/**
 * Created by Дмитрий on 02.03.2015.
 */
public class Article extends Publication{
    String headline = "----- Article -----";

    Article(String text){
        super(text);
    }

    public void publish() {
        System.out.println(headline);
        super.publish();
    }
}
