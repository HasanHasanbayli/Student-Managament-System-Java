package util;

import service.MenuLoginService;
import service.MenuRegisterService;
import service.MenuService;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add student", null),
    ADD_TEACHER(4, "Add teacher", null),
    SHOW_ALL_STUDENT(5, "Show all student", null),
    SHOW_ALL_TEACHER(6, "Show all teacher", null),
    UNKNOWN;

    private String label;
    private MenuService service;
    private int number;

    Menu() {

    }


    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    @Override
    public String toString() {
        return label;
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
}
