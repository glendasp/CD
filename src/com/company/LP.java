package com.company;

/**
 * Created by glendex on 10/12/15.
 */
public class LP extends Album {

    private int condition;   //1 = barely playable, 5 = mint

    public LP(String artist, String title, int condition, double price) {
        this.artist = artist;
        this.title = title;
        this.condition = condition;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Format = LP, Artist = " + this.artist + ", Title = " + title + ", Condition = " + this.condition  + ", Price $" + this.price;
    }


}
