package backend.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="authorID", nullable = false, updatable = false)
    private Long id;

    private String fullName;
    @OneToOne
    @JoinColumn(name = "diplomaID")
    private Diploma daID;


    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
