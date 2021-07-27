package util;

import java.util.Scanner;

public class MenuUtil {
    public static Menu showMenu() {
        Menu[] menus = Menu.values();

        for (int i = 0; i < menus.length; i++) {
            System.out.println(menus[i]);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please select menu");
        int selectedMenu = scan.nextInt();

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == selectedMenu) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}
