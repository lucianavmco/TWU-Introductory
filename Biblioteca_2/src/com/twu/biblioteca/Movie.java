package com.twu.biblioteca;

import java.util.ArrayList;

public class Movie {

    private int id;
    private String name;
    private int year;
    private String director;
    private int rating = 0;
    private boolean isCheckedout;

    public Movie(int id, String name, String director, int yearPublished, int year, Boolean isCheckedout) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.year = year;
        this.isCheckedout = isCheckedout;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    private void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    public void setCheckedout(boolean checkedout) {
        isCheckedout = checkedout;
    }

    public void printListMovie(ArrayList<Movie> list){
        list.forEach(m -> {
            if(!m.isCheckedout()) {
                System.out.print("ID: " + m.getId() + " - Name: " + m.getName() + " - Director: " + m.getDirector() + " - Year: " + m.getYear());
                System.out.println();
            }
        });
    }

    public void printListMovieToReturn(ArrayList<Movie> list){
        list.forEach(m -> {
            if(m.isCheckedout()) {
                System.out.print("ID: " + m.getId() + " - Name: " + m.getName() + " - Director: " + m.getDirector() + " - Year: " + m.getYear());
                System.out.println();
            }
        });
    }

    public void checkout (Movie movie){
        if(!movie.isCheckedout()){
            movie.setCheckedout(true);
            System.out.println("Thank you! Enjoy the movie.");
        }else{
            System.out.println("That movie is not available.");
        }
        System.out.println();
    }

    public void returnMovie (Movie movie){
        if(movie.isCheckedout()){
            movie.setCheckedout(false);
            System.out.println("Thank you for returning the movie.");
        }else{
            System.out.println("That is not a valid movie to return.");
        }
        System.out.println();
    }
}
