package mainApp;

import domain.Student;
import domain.Student_info;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainApp2 {
    public static void main(String[] args) {
        Configuration cfg=null;
        SessionFactory factory=null;
        Session ses=null;

        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Student.class);
        cfg=cfg.addAnnotatedClass(Student_info.class);
        factory=cfg.buildSessionFactory();

        ses=factory.openSession();

        org.hibernate.query.Query query=ses.createQuery("select P from Student P");
        List<Student> p1 =query.list();
        for (Student p:p1){
            System.out.println(p);
        }
    }
}
