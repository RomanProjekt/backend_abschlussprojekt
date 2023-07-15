package backend.model;

import jakarta.persistence.*;

@Entity
public class Keyword {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="keywordID", nullable = false, updatable = false)
    private Long id;
    private String word;

    public Keyword(Long id, String word) {
        this.id = id;
        this.word = word;
    }

    public Keyword() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
