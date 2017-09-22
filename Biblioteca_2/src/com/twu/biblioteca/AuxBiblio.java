package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class AuxBiblio {

    ArrayList<Book> listB = this.fakeListBooks();
    Book book = new Book();
    ArrayList<Movie> listM = this.fakeListMovies();
    Movie movie = new Movie();
    Scanner scanner = new Scanner(System.in);


    public ArrayList<Book> fakeListBooks(){
        ArrayList<Book> list = new ArrayList<Book>();

        Book book = new Book(1,"Book1","Autor1", 1991, false);
        list.add(book);

        Book book2 = new Book(2, "Book2","Autor2", 1992, false);
        list.add(book2);

        Book book3 = new Book(3,"Book3","Autor3", 1993, false);
        list.add(book3);

        return list;
    }

    public ArrayList<Movie> fakeListMovies(){
        ArrayList<Movie> list = new ArrayList<Movie>();

        Movie movie = new Movie(1,"Book1","Autor1", 1991, 5, false);
        list.add(movie);

        Movie movie2 = new Movie(2, "Book2","Autor2", 1992, 6, false);
        list.add(movie2);

        Movie movie3 = new Movie(3,"Book3","Autor3", 1993, 7, false);
        list.add(movie3);

        return list;
    }

    public void printMenu(){

        System.out.println("********* -- Biblioteca -- *********");
        System.out.println("1 - Books");
        System.out.println("2 - Movies");
        System.out.println("99 - Quit");

        int option = scanner.nextInt();
        this.optionsValidateMenuPrincipal(option, this.listB, this.listM);
    }

    public void optionsValidateMenuPrincipal(int option, ArrayList<Book> listB, ArrayList<Movie> listM){
        if(option == 1) {

            AuxBook aux = new AuxBook();
            ArrayList<Book> list = aux.fakeListBooks();
            Book book = new Book();
            book.printListBook(list);

            System.out.println();
            aux.printMenu();

        }else if(option == 2){
            AuxMovie auxM = new AuxMovie();
            ArrayList<Movie> list = auxM.fakeListMovies();
            Movie movie = new Movie();
            movie.printListMovie(list);

            System.out.println();
            auxM.printMenu();
        }else if(option == 99){
            //quiting
        }else{
            System.out.println();
            System.out.println("Select a valid option!");
            this.printMenu();
        }
    }
}
