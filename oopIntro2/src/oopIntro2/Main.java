package oopIntro2;

public class Main {

    public static void main(String[] args) {

        Courses course1 = new Courses(1,"Java+React");
        Courses course2 = new Courses(2,"C#+Angular");
        Courses course3 = new Courses(3,"Temel Kurs");
        Courses[] course = {course1, course2, course3};

        Instructor instructor1 = new Instructor(1, "Birinci Egitmen");
        Instructor instructor2 = new Instructor(2, "İkinci Egitmen");
        Instructor instructor3 = new Instructor(3, "Üçüncü Egitmen");
        Instructor[] instructor = {instructor1,instructor2,instructor3};

        Register register = new Register();
        register.addToCourse(course1);
        register.addToInstructor(instructor1);
        register.addToCourse(course2);
        register.addToInstructor(instructor2);
        register.addToCourse(course3);
        register.addToInstructor(instructor3);


    }
}

