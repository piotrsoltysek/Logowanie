package pl.camp.it.database;

import pl.camp.it.model.Sex;
import pl.camp.it.model.User;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private final List<User> users = new ArrayList<>();
    private static final Repository repository = new Repository();

    private Repository() {
        this.users.add(new User(1, "Janusz", "77f869401de682f60e0e749493ab793d", Sex.MAN));
    }

    public List<User> getUsers() {
        return this.users;
    }

    public static Repository getRepository() {
        return repository;
    }
}
