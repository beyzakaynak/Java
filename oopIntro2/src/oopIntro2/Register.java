package oopIntro2;

public class Register {
    public void addToCourse(Courses course) {
        System.out.println("Kursa Kayıt Olundu: " + course.courseName);
    }

    public void addToInstructor(Instructor instructor) {
        System.out.println("Eğitmeniniz: " + instructor.name);
        System.out.println("------");
    }
}

