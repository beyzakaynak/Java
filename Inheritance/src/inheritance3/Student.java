package inheritance3;

public class Student extends User {

    public Student() {

    }

    //Buralar geliştirilecek-eklenecek
    private String chooseCourse;

    public Student(int id, String userName, String chooseCourse) {
        super(id, userName);
        this.chooseCourse = chooseCourse;
    }

    public String getChooseCourse() {
        return chooseCourse;
    }

    public void setChooseCourse(String chooseCourse) {
        this.chooseCourse = chooseCourse;
    }

}
