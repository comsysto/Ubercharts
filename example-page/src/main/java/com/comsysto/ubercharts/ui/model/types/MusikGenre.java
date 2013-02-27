package com.comsysto.ubercharts.ui.model.types;

/**
 * User: alentolj
 * Date: 22.02.13
 */
public enum MusikGenre {
    ELECTRONIC("Electronic"),
    URBAN("Urban"),
    POP("Pop"),
    ROCK("Rock"),
    BLUES("Blues");

    private String name;

    private MusikGenre(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
