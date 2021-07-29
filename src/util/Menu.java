package util;

import service.MenuLoginService;
import service.MenuRegisterService;
import inter.MenuService;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add student", null),
    ADD_TEACHER(4, "Add teacher", null),
    SHOW_ALL_STUDENT(5, "Show all student", null),
    SHOW_ALL_TEACHER(6, "Show all teacher", null),
    UNKNOWN;

    private int number;
    private String label;
    private MenuService service;

    Menu() {

    }

    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
    }

    public int getNumber() {
        return this.number;
    }

    public String getLabel() {
        return label;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                System.out.println(menus[i]);
            }
        }
    }
}