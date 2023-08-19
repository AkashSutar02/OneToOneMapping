package domain;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "s_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    @Column(name = "s_name")
    private String studentName;
    @Column(name = "s_email")
    private String studentEmail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "s_ref")
    private Student_info studentRefernce;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Student_info getStudentRefernce() {
        return studentRefernce;
    }

    public void setStudentRefernce(Student_info studentRefernce) {
        this.studentRefernce = studentRefernce;
    }

    @Override
    public String toString() {
       return  studentId+" "+studentName+" "+ studentEmail+"  "  +getStudentRefernce().getTenPer()+" "+getStudentRefernce().getTwelvePer()+" "+getStudentRefernce().getDegreePer()+" "+getStudentRefernce().getStream();
    }
}
