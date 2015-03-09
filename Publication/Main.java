package com.company;

public class Main {

    public static void main(String[] args) {
        String txt = "There are many variations of\n" +
                "passages of Lorem Ipsum available\n" +
                "but the majority have suffered alteration";

        Publication[] pub = {new News(txt), new Article(txt), new Announcement(txt)};
        for (int i = 0; i < pub.length; i++){
            pub[i].publish();
        }
    }
}
