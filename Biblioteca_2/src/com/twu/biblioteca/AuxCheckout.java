package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class AuxCheckout {

    ArrayList<Checkout> listC = this.fakeListCheckouts();

    public ArrayList<Checkout> fakeListCheckouts(){
        ArrayList<Checkout> list = new ArrayList<Checkout>();

        Checkout checkout = new Checkout(1,1,0);
        list.add(checkout);

        Checkout checkout2 = new Checkout(2, 0, 1);
        list.add(checkout2);

        Checkout checkout3 = new Checkout(3,0,2);
        list.add(checkout3);

        return list;
    }

    public void checkoutMovie(int user_id, int movie_id){
        Checkout checkout = new Checkout();
        checkout.setMovie_id(movie_id);
        checkout.setUser_id(user_id);
    }

    public void checkoutBook(int user_id, int book_id){
        Checkout checkout = new Checkout();
        checkout.setBook_id(book_id);
        checkout.setUser_id(user_id);
    }

    public void returnBook(int user_id, int book_id){
        listC.forEach(c -> {
            if(c.getBook_id() == book_id && c.getUser_id() == user_id){
                listC.remove(c);
            }
        });
    }

    public void returnMovie(int user_id, int movie_id){
        listC.forEach(m -> {
            if(m.getMovie_id() == movie_id && m.getUser_id() == user_id){
                listC.remove(m);
            }
        });
    }
}
