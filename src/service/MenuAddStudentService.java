package service;


import bean.Config;
import bean.Student;
import inter.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void process() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        Scanner scan2 = new Scanner(System.in);
        String surname = scan.nextLine();

        Student student = new Student();
        student.setName(name);
        student.setSurName(surname);

        Config.intance().appendStudent(student);

    }
}
