package com.company;

/**
 * Created by glendex on 10/12/15.
 */

public class CD extends Album{

    public CD(String artist, String title, double price) {
        this.artist = artist;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Format = CD, Artist = " + this.artist + ", Title = " + title + ", Price $" + this.price;

    }
}