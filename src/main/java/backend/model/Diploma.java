package backend.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Diploma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="diplomaID", nullable = false, updatable = false)
    private Long id;
    private String title;
    private String textname;
    @OneToOne
    @JoinColumn(name = "schoolID")
    private School school;
    private String pdf;
    @OneToOne
    @JoinColumn(name = "userID")
    private User user;
    private Date date;
    private String picture;
    private int download_count;
    private int click_count;

    public Diploma() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextname() {
        return textname;
    }

    public void setTextname(String textname) {
        this.textname = textname;
    }



    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getDownload_count() {
        return download_count;
    }

    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }

    public int getClick_count() {
        return click_count;
    }

    public void setClick_count(int click_count) {
        this.click_count = click_count;
    }
}
