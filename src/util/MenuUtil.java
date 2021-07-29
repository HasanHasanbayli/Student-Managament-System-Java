package util;

import java.util.Scanner;

public class MenuUtil {
    public static Menu showMenu() {
        System.out.println("Please select menu");
        Menu.showAllMenu();
        Scanner scan = new Scanner(System.in);
        int selectedMenu = scan.nextInt();
        return Menu.find(selectedMenu);
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}
