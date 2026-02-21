package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cId;

    private String name;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private List<Student> students;

    // Default constructor (MANDATORY)
    public College() {
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
