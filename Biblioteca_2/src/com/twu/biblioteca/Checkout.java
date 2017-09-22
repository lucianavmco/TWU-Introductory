package com.twu.biblioteca;

import java.util.ArrayList;

public class Checkout {
    private int user_id;
    private int book_id;
    private int movie_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public Checkout(int user_id, int book_id, int movie_id) {
        this.user_id = user_id;
        this.book_id = book_id;
        this.movie_id = movie_id;
    }

    public Checkout() {
    }



}
