package eTicaretSimulation.dataAccess.concretes;

import eTicaretSimulation.dataAccess.abstracts.UserDao;
import eTicaretSimulation.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Hibernate ile eklendi: " + user.getFirstName() + user.getLastName());
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
