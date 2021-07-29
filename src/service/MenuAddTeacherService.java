package service;

import bean.Config;
import bean.Student;
import bean.Teacher;
import inter.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void process() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        Scanner scan2 = new Scanner(System.in);
        String surname = scan.nextLine();

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurName(surname);

        Config.intance().appendTeacher(teacher);
    }
}
