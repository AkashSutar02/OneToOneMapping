package domain;

import javax.persistence.*;

@Entity
@Table(name = "student_details")

public class Student_info {
    @Id
    @Column(name = "st_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    @Column(name = "10_per")
    private double tenPer;
    @Column(name = "12_per")
    private double twelvePer;
    @Column(name = "degree_per")
    private double degreePer;
    @Column(name = "stream")
    private String stream;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getTenPer() {
        return tenPer;
    }

    public void setTenPer(double tenPer) {
        this.tenPer = tenPer;
    }

    public double getTwelvePer() {
        return twelvePer;
    }

    public void setTwelvePer(double twelvePer) {
        this.twelvePer = twelvePer;
    }

    public double getDegreePer() {
        return degreePer;
    }

    public void setDegreePer(double degreePer) {
        this.degreePer = degreePer;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
