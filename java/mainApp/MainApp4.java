package mainApp;

import domain.Student;
import domain.Student_info;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class MainApp4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id:");
        int id=sc.nextInt();
        Configuration cfg=null;
        SessionFactory factory=null;
        Session ses=null;
        Transaction tx;
        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Student.class);
        cfg=cfg.addAnnotatedClass(Student_info.class);
        factory=cfg.buildSessionFactory();

        ses=factory.openSession();
        Student s1= ses.get(Student.class,id);
        tx= ses.beginTransaction();
        ses.delete(s1);
        tx.commit();
        System.out.println("deleted succuss..");

    }
}
