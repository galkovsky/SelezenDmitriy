package com.company;

import java.util.Objects;

/**
 * Created by Дмитрий on 02.03.2015.
 */
public class Bookshelf {
    int width;
    int height;

    public Bookshelf(int width, int height){
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;

        if(obj == null) return false;

        if(getClass() != obj.getClass()) return false;

        Bookshelf tmp = (Bookshelf) obj;
        if(width != tmp.width) return false;
        if(height != tmp.height) return false;

        return true;
    }

    public int hashCode(){
        int m = 31;
        int result = 1;
        result = result * m + width;
        result = result * m + height;

        return result;
    }


}
