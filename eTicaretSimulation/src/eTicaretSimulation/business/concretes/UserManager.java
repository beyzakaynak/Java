package eTicaretSimulation.business.concretes;

import eTicaretSimulation.business.abstracts.UserService;
import eTicaretSimulation.dataAccess.abstracts.UserDao;
import eTicaretSimulation.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private UserDao userDao;
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {

        this.userDao.add(user);

    }




    @Override
    public List<User> getAll() {
        return null;
    }
}
