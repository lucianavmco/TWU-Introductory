package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class AuxUser {

    ArrayList<User> listU = this.fakeListUsers();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<User> fakeListUsers(){
        ArrayList<User> list = new ArrayList<User>();

        User user = new User(1, "User1", "user1@email.com", "1111-1111", "111-1111", "pass1");
        list.add(user);

        User user2 = new User(2, "User2", "user2@email.com", "2222-2222", "222-2222", "pass2");
        list.add(user2);

        User user3 = new User(3, "User3", "user3@email.com", "3333-3333", "333-3333", "pass3");
        list.add(user3);

        return list;
    }

    public void printMenu(){
        System.out.println();
        System.out.println("********* -- LOGIN -- *********");

        System.out.println("Your login:");
        String login = scanner.next();

        System.out.println("Your password:");
        String password = scanner.next();

        this.loginUser(login, password);
    }

    public User optionsValidateLogin(String login, String password, ArrayList<User> list){
        boolean ret = false;
        User user;
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            user = list.get(i);
            if(user.getLogin().equals(login) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public void printUserLogin(User user){
        System.out.println();
        System.out.println("Name: "+ user.getName()+ " - Email: "+user.getEmail()+ " - Phone: "+user.getPhone());
        System.out.println();
    }

    public void loginUser(String login, String pwd){
        User user = this.optionsValidateLogin(login, pwd, this.listU);
        if(user != null){
            System.out.println("Login Success!");
            AuxBiblio biblio = new AuxBiblio();
            this.printUserLogin(user);
            biblio.printMenu();
        }else{
            System.out.println("Login ERROR! Try again!");
            this.printMenu();
        }
    }
}
