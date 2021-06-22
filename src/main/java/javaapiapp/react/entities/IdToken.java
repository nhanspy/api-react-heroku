package javaapiapp.react.entities;

import javax.persistence.*;

@Entity
@Table
public class IdToken {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String token;

    public IdToken() {
    }

    public IdToken(String token) {
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
