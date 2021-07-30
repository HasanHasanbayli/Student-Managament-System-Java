package service;

import bean.Config;
import inter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {


    @Override
    public void processLogic() {
        Scanner scan = new Scanner(System.in);
        System.out.println("username");
        String username = scan.nextLine();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("password");
        String password = scan.nextLine();

        if (!(username.equals("user") && password.equals("12345"))) {
            throw new IllegalArgumentException("user or password is invalid");
        }
        Config.setLoggedIn(true);
    }
}
