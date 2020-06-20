package pl.camp.it.model;

public class User {
    private int id;
    private String login;
    private String pass;
    private Sex sex;

    public User(int id, String login, String pass, Sex sex) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.sex = sex;
    }

    public int getId() {
        return this.id;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPass() {
        return this.pass;
    }

    public Sex getSex() {
        return this.sex;
    }
}
