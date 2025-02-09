package pl.coderslab.entity;

public class User {
    private int id;
    private String userName;
    private String email;
    private String password;

    // Konstruktor pusty, domyślny
    public User() {}

    // Konstruktor pełny
    public User(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    // Ustawienia i pobierania parametrów
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Nadpisanie toString() dla lepszej czytelności
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
