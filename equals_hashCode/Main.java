package com.company;

public class Main {

    public static void main(String[] args) {
        Bookshelf bs1 = new Bookshelf(100, 12);
        Bookshelf bs2 = bs1;
        Bookshelf bs3 = new Bookshelf(100, 12);
        Bookshelf bs4 = new Bookshelf(120, 30);

        System.out.println(bs1 == bs2);
        System.out.println(bs1.equals(bs2));
        System.out.println(bs1 == bs3);
        System.out.println(bs1.equals(bs3));
        System.out.println(bs1.hashCode() == bs3.hashCode());
        System.out.println(bs1.hashCode() == bs4.hashCode());
    }
}
