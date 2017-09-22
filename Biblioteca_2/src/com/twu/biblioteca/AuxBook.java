package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class AuxBook {

    ArrayList<Book> listB = this.fakeListBooks();
    Book book = new Book();
    AuxBiblio auxBiblio = new AuxBiblio();
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

    public void printMenu(){
        System.out.println();
        System.out.println("********* -- Menu - Books -- *********");
        System.out.println("1 - List Books");
        System.out.println("2 - Checkout a Book");
        System.out.println("3 - Return a Book");
        System.out.println("4 - Menu Principal");
        System.out.println("99 - Quit");

        int option = scanner.nextInt();
        this.optionsValidateMenuPrincipal(option, this.listB);
    }

    public void optionsValidateMenuPrincipal(int option, ArrayList<Book> list){
        if(option == 1) {
            this.book.printListBook(list);
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
        this.book.printListBook(this.listB);
        System.out.println("********* -- ID to checkout -- *********");

        int option = scanner.nextInt();
        this.optionsValidateCheckout(option, this.listB);
    }

    public void optionsValidateCheckout(int idBook, ArrayList<Book> list){
        AuxCheckout auxCheckout = new AuxCheckout();
        list.forEach(b -> {
            if(b.getId() == idBook){
                b.checkout(b);
                auxCheckout.checkoutBook(1, b.getId());
            }
        });
        this.book.printListBook(this.listB);
        this.printMenu();
    }

    public void printReturnOptions(){
        System.out.println();
        System.out.println("********* -- Return options -- *********");
        this.book.printListBookToReturn(this.listB);
        System.out.println("********* -- ID to checkout -- *********");

        int option = scanner.nextInt();
        this.optionsValidateReturn(option, this.listB);
    }

    public void optionsValidateReturn(int idBook, ArrayList<Book> list){
        AuxCheckout auxCheckout = new AuxCheckout();
        list.forEach(b -> {
            if(b.getId() == idBook){
                b.returnBook(b);
                auxCheckout.checkoutBook(1, b.getId());
            }
        });
        this.book.printListBook(this.listB);
        this.printMenu();
    }

}
