package service;


import bean.Config;
import bean.Student;
import inter.MenuAddStudentServiceInter;
import inter.SevableProcess;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void processLogic() {
        System.out.println("Enter name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Enter surname");
        Scanner scan2 = new Scanner(System.in);
        String surname = scan2.nextLine();

        Student student = new Student();
        student.setName(name);
        student.setSurName(surname);

        Config.intance().appendStudent(student);
        System.out.println("Student added");
    }
}
