package mainApp;

import domain.Student;
import domain.Student_info;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=sc.next();
        System.out.println("Enter EMAIL");
        String email= sc.next();
        System.out.println("Enter 10th percantage");
        double per1=sc.nextDouble();
        System.out.println("Entre 12th percantagw");
        double per2=sc.nextDouble();
        System.out.println("Enter degree percnatge");
        double per3=sc.nextDouble();
        System.out.println("Enter stream");
        String stream=sc.next();
        Configuration cfg=null;
        SessionFactory factory=null;
        Session ses=null;
        Transaction tx;
        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Student_info.class);
        cfg=cfg.addAnnotatedClass(Student.class);
        factory=cfg.buildSessionFactory();
        ses=factory.openSession();
        Student_info d1=new Student_info();


        d1.setTenPer(per1);
        d1.setTwelvePer(per2);
        d1.setDegreePer(per3);
        d1.setStream(stream);

        Student s1=new Student();
        s1.setStudentName(name);
        s1.setStudentEmail(email);
        s1.setStudentRefernce(d1);

        tx=ses.beginTransaction();
        ses.save(s1);
        tx.commit();
        System.out.println("Data insrted..");


    }
}
