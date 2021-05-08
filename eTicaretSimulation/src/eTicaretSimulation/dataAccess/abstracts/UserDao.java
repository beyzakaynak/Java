package eTicaretSimulation.dataAccess.abstracts;

import eTicaretSimulation.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void update(User user);
    void delete(User user);
    User get(int id);
    List<User> getAll();

}
