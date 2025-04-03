package org.jmc.mydomain.videostreaming;

public class Movie extends Video {
    private double rating;

    public Movie(double rating) {
        setRating(rating);
    }

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
