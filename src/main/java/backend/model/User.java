package backend.model;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="userID", nullable = false, updatable = false)
    private Long id;
    private String username;
    private String firstname;
    private String lastname;
    private String password;
    private String salt;
    private String role;
    private String eMail;
    private boolean editable;
    @OneToOne
    @JoinColumn(name = "securitycodeID")
    private Securitycode securityID;





    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String geteMail() {
        return eMail;
    }

    public boolean isEditable() {
        return editable;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", passWd='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", role='" + role + '\'' +
                ", eMail='" + eMail + '\'' +
                ", editable=" + editable +
                ", securityID=" + securityID +
                '}';
    }
}
