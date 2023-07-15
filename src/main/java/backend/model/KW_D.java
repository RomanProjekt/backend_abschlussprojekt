package backend.model;

import jakarta.persistence.*;

@Entity
public class KW_D {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="kwdID", nullable = false, updatable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "keywordID")
    private Keyword keyword;

    @OneToOne
    @JoinColumn(name = "diplomaID")
    private Diploma daID;

    public KW_D() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
