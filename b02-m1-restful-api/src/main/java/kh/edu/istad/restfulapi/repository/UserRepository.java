package kh.edu.istad.restfulapi.repository;

import kh.edu.istad.restfulapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository {

    private List<User> users;

    public UserRepository() {

                User user1 = new User (UUID.randomUUID(), "admin", "qwer", "Administrator", true);
                User user2 = new User (UUID.randomUUID(), "editor", "qwer", "Editor", true);
                User user3 = new User (UUID.randomUUID(), "customer", "qwer", "RIthlywin", true);
        users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);



    }
    public boolean checkById(UUID id) {
        return users.stream()
                .anyMatch(user -> user.getId().equals(id));
    }



    public List<User> selectAll() {
        return users;
    }

    public void insertOne(User user) {
        users.add(user);
    }
    public void deleteOne(UUID id){
        users.removeIf(user -> user.getId().equals(id));
    }

}