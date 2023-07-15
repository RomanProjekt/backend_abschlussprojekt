package backend.model;

import jakarta.persistence.*;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="schoolID", nullable = false, updatable = false)
    private Long id;
    private String name;

    public School(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public School() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
