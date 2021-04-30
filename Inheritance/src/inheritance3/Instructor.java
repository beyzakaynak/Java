package inheritance3;

public class Instructor extends User {

    public Instructor() {

    }
//Buralar geliştirilecek-eklenecek
    private String courseName;

    public Instructor(int id, String userName, String courseName) {
        super(id, userName);
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}
