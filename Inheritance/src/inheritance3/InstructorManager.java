package inheritance3;

public class InstructorManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.println(user.getUserName() + "  kaydedildi");
    }
    @Override
    public void delete(User user) {
        System.out.println(user.getUserName() + "  Silindi");
    }




}

