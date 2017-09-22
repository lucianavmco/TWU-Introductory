package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class AuxMovie {

    ArrayList<Movie> listM = this.fakeListMovies();
    Movie movie = new Movie();
    AuxBiblio auxBiblio = new AuxBiblio();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Movie> fakeListMovies(){
        ArrayList<Movie> list = new ArrayList<Movie>();

        Movie movie = new Movie(1,"Movie1","Director1", 2010, 5, false);
        list.add(movie);

        Movie movie2 = new Movie(2, "Movie2","Director2", 2011, 6, false);
        list.add(movie2);

        Movie movie3 = new Movie(3,"Movie3","Director3", 2012, 7, false);
        list.add(movie3);

        return list;
    }

    public void printMenu(){
        System.out.println();
        System.out.println("********* -- Menu - Movies -- *********");
        System.out.println("1 - List Movies");
        System.out.println("2 - Checkout a Movie");
        System.out.println("3 - Return a Movie");
        System.out.println("4 - Menu Principal");
        System.out.println("99 - Quit");

        int option = scanner.nextInt();
        this.optionsValidateMenuPrincipal(option, this.listM);
    }

    public void optionsValidateMenuPrincipal(int option, ArrayList<Movie> list){
        if(option == 1) {
            this.movie.printListMovie(list);
            this.printMenu();

        }else if(option == 2){
            printCheckoutOptions();
        }else if(option == 3){
            printReturnOptions();
        }else if(option == 4){
            auxBiblio.printMenu();
        }else if(option == 99){
            //quiting
        }else{
            System.out.println();
            System.out.println("Select a valid option!");
            this.printMenu();
        }
    }

    public void printCheckoutOptions(){
        System.out.println();
        System.out.println("********* -- Checkout options -- *********");
        this.movie.printListMovie(this.listM);
        System.out.println("********* -- ID to checkout -- *********");

        int option = scanner.nextInt();
        this.optionsValidateCheckout(option, this.listM);
    }

    public void optionsValidateCheckout(int idMovie, ArrayList<Movie> list){
        AuxCheckout auxCheckout = new AuxCheckout();
        list.forEach(m -> {
            if(m.getId() == idMovie){
                m.checkout(m);
                auxCheckout.checkoutMovie(1, m.getId());
            }
        });
        this.movie.printListMovie(this.listM);
        this.printMenu();
    }

    public void printReturnOptions(){
        System.out.println();
        System.out.println("********* -- Return options -- *********");
        this.movie.printListMovieToReturn(this.listM);
        System.out.println("********* -- ID to checkout -- *********");

        int option = scanner.nextInt();
        this.optionsValidateReturn(option, this.listM);
    }

    public void optionsValidateReturn(int idMovie, ArrayList<Movie> list){
        AuxCheckout auxCheckout = new AuxCheckout();
        list.forEach(m -> {
            if(m.getId() == idMovie){
                m.returnMovie(m);
                auxCheckout.checkoutBook(1, m.getId());
            }
        });
        this.movie.printListMovie(this.listM);
        this.printMenu();
    }

}
