package backend.model;

import jakarta.persistence.*;

@Entity
public class Favorite {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="favoriteID", nullable = false, updatable = false)
    private Long id;
    @OneToOne
    @JoinColumn(name = "diplomaID")
    private Diploma daID;

    public Favorite() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
