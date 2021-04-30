package inheritance3;

public class UserManager {

    public void add(User user) {
        System.out.println(user.getUserName() + "kaydedildi");
    }

    public void delete(User user) {
        System.out.println(user.getUserName() + "Silindi");
    }

}
