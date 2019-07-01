package com.topsoutherncoders.moviecatalogservice.models;

public class Movie {
    public Movie(String movieID, String name) {
        this.movieID = movieID;
        this.name = name;
    }

    private String movieID;
    private String name;

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
