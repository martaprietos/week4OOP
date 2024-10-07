package ie.atu.week4;

public class Student {
    private String name;
    private String email;
    private String course;

    public Student() { //set default constructor
        this.name = null;
        this.email = null;
        this.course = null;
    }

    public Student(String name) { //accepts only student name
        this.name = name;
        this.email = null;
        this.course = null;
    }

    public Student(String name, String email, String course) { //accepts all 3 parameters
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getName() { //get student name
        return name;
    }

    public void setName(String name) { //set student name
        this.name = name;
    }

    public String getEmail() { //get student email
        return email;
    }

    public void setEmail(String email) { //set student email
        this.email = email;
    }

    public String getCourse() { //get student course
        return course;
    }

    public void setCourse(String course) { //set student course
        this.course = course;
    }
}
