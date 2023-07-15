package backend.model;

import jakarta.persistence.*;

@Entity
public class Securitycode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="securitycodeID", nullable = false, updatable = false)
    private Long id;
    @OneToOne
    @JoinColumn(name = "userID")
    private User userID;
    private String securityanswer;
    private String sa_salt;
    private String compareCodeSalt;
    private String restCodeSalt;
    private String additiveCodeSalt;


    public Securitycode() {
    }

    public Long getId() {
        return id;
    }

    public String getSecurityanswer() {
        return securityanswer;
    }

    public void setSecurityanswer(String securityanswer) {
        this.securityanswer = securityanswer;
    }

    public String getSa_salt() {
        return sa_salt;
    }

    public void setSa_salt(String sa_salt) {
        this.sa_salt = sa_salt;
    }

    public String getCompareCodeSalt() {
        return compareCodeSalt;
    }

    public void setCompareCodeSalt(String compareCodeSalt) {
        this.compareCodeSalt = compareCodeSalt;
    }

    public String getRestCodeSalt() {
        return restCodeSalt;
    }

    public void setRestCodeSalt(String restCodeSalt) {
        this.restCodeSalt = restCodeSalt;
    }

    public String getAdditiveCodeSalt() {
        return additiveCodeSalt;
    }

    public void setAdditiveCodeSalt(String additiveCodeSalt) {
        this.additiveCodeSalt = additiveCodeSalt;
    }
}
