package inheritance3;

public class Main {

    public static void main(String[] args) {
        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setCourseName("kurs1");
        instructor1.setUserName("eğitmen1");

        Student student1 = new Student();
        student1.setId(1);
        student1.setUserName("öğrenci1");
        student1.setChooseCourse("kurs1");

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.delete(instructor1);


    }
}

