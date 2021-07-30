package service;

import bean.Config;
import bean.Teacher;
import inter.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void processLogic() {
        System.out.println("Enter name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Enter surname");
        Scanner scan2 = new Scanner(System.in);
        String surname = scan2.nextLine();

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurName(surname);

        Config.intance().appendTeacher(teacher);
        System.out.println("Teacher added");
    }
}
