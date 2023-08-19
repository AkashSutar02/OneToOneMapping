package mainApp;

import domain.Student;
import domain.Student_info;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id:");
        int id=sc.nextInt();
        Configuration cfg=null;
        SessionFactory factory=null;
        Session ses=null;

        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Student.class);
        cfg=cfg.addAnnotatedClass(Student_info.class);
        factory=cfg.buildSessionFactory();

        ses=factory.openSession();
       Student s1= ses.get(Student.class,id);
        System.out.println(s1.getStudentId());
        System.out.println(s1.getStudentName());
        System.out.println(s1.getStudentEmail());
        System.out.println(s1.getStudentRefernce().getTenPer());
        System.out.println(s1.getStudentRefernce().getTwelvePer());
        System.out.println(s1.getStudentRefernce().getDegreePer());
        System.out.println(s1.getStudentRefernce().getStream());



    }
}
