package service;

import inter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {


    @Override
    public void process() {
        Scanner scan = new Scanner(System.in);
        System.out.println("username");
        String username = scan.nextLine();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("password");
        String password = scan.nextLine();

        if (!(username.equals("user") && password.equals("12345"))) {
            throw new IllegalArgumentException("user or password is invalid");
        }
    }
}
