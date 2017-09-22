package com.twu.biblioteca;

import java.util.ArrayList;

public class Book {

    private int id;
    private String name;
    private String autor;
    private int yearPublished;
    private boolean isCheckedout;

    public Book(int id, String name, String autor, int yearPublished, Boolean isCheckedout) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.yearPublished = yearPublished;
        this.isCheckedout = isCheckedout;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    private void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    private void setCheckedout(boolean checkedout) {
        this.isCheckedout = checkedout;
    }

    public void printListBook(ArrayList<Book> list){
        list.forEach(b -> {
            if(!b.isCheckedout()) {
                System.out.print("ID: " + b.getId() + " - Name: " + b.getName() + " - Autor: " + b.getAutor() + " - Year: " + b.getYearPublished());
                System.out.println();
            }
        });
    }

    public void printListBookToReturn(ArrayList<Book> list){
        list.forEach(b -> {
            if(b.isCheckedout()) {
                System.out.print("ID: " + b.getId() + " - Name: " + b.getName() + " - Autor: " + b.getAutor() + " - Year: " + b.getYearPublished());
                System.out.println();
            }
        });
    }

    public void checkout (Book book){
        if(!book.isCheckedout()){
            book.setCheckedout(true);
            System.out.println("Thank you! Enjoy the book.");
        }else{
            System.out.println("That book is not available.");
        }
        System.out.println();
    }

    public void returnBook (Book book){
        if(book.isCheckedout()){
            book.setCheckedout(false);
            System.out.println("Thank you for returning the book.");
        }else{
            System.out.println("That is not a valid book to return.");
        }
        System.out.println();
    }
}
