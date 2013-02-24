package com.comsysto.ubercharts.ui.model.types;

/**
 * Created with IntelliJ IDEA.
 * User: alentolj
 * Date: 22.02.13
 * Time: 10:29
 * To change this template use File | Settings | File Templates.
 */
public enum MusikGenre {
    ELECTRONIC("Electronic"),
    URBAN("Urban"),
    POP("Pop"),
    ROCK("Rock"),
    BLUES("Blues");

    private String name;
    private static Number downloads;

    private MusikGenre(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public enum Pop implements IMusikTypeGenre{
        INDIE_POP("Indie Pop"),
        BALLADS("Ballads"),
        ACOUSTIC("Acoustic"),
        NEW_WAVE("New Wave");

        private String name;

        private Pop(String name){

            this.name = name;
        }

        public String getName(){
            return name;
        }
    }
    public enum Rock implements IMusikTypeGenre{
        HARD_ROCK("Hard Rock"),
        CLASSIC_ROCK("Classic Rock"),
        ROCK_N_ROLL("Rock & Roll"),
        PUNK("Punk");

        private String name;

        private Rock(String name){

            this.name = name;
        }

        public String getName(){
            return name;
        }
    }
    public enum BluesJazz implements IMusikTypeGenre{
        JAZZ("Jazz"),
        LATIN_JAZZ("Latin Jazz"),
        BLUE_ROCK("Blues Rock"),
        BLUES("Blues");

        private String name;

        private BluesJazz(String name){

            this.name = name;
        }

        public String getName(){
            return name;
        }
    }

    public enum Electronic implements IMusikTypeGenre{
        HOUSE("House"),
        MINIMAL("Minimal"),
        DRUM_N_BASS("Brum & Bass"),
        TECHNO("Techno");

        private String name;

        private Electronic(String name){

            this.name = name;
        }

        public String getName(){
            return name;
        }
    }
    public enum Urban implements IMusikTypeGenre{
        R_N_B("R&B"),
        RAP("Rap"),
        SOUL("Soul"),
        HIP_HOP("Hip Hop");

        private String name;

        private Urban(String name){

            this.name = name;
        }

        public String getName(){
            return name;
        }
    }
}
