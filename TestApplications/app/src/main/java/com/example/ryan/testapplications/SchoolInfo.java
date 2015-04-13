package com.example.ryan.testapplications;

import java.util.ArrayList;

public class SchoolInfo {

    private ArrayList StudentList = new ArrayList<student>();
    private ArrayList InstructorList = new ArrayList<instructor>();
    private ArrayList CourseList = new ArrayList<course>();

    private student curUser;

    private static SchoolInfo instance = null;

    private SchoolInfo() {
        // Here to prevent direct instantiation
    }

    // Singleton Pattern for School Info Class
    public static SchoolInfo getInstance() {
        if(instance == null) {
            instance = new SchoolInfo();
        }
        return instance;
    }

    //Test initialization -- remove later, before release

    public void setAccounts(){

        // Initial values to use for testing
        ArrayList AL = new ArrayList();

        instructor i1 = new instructor("Perez", "hpcc", AL);
        instructor i2 = new instructor("Watson", "ASP", AL);
        instructor i3 = new instructor("Mengel", "java", AL);
        instructor i4 = new instructor("Gelfond", "AI", AL);

        section s1 = new section(1, 1, i1, AL);
        section s2 = new section(1, 2, i2, AL);
        section s3 = new section(1, 3, i3, AL);
        section s4 = new section(1, 4, i4, AL);

        course c1 = new course(4331, "VGD", AL);
        course c2 = new course(3365, "Algos", AL);
        course c3 = new course(3364, "SE1", AL);
        course c4 = new course(1411, "Princ1", AL);

        // Add values into School Info
        c1.addSection(s1);
        addCourse(c1);

        c1.addSection(s2);
        addCourse(c2);

        c1.addSection(s3);
        addCourse(c3);

        c1.addSection(s4);
        addCourse(c4);

        // Testing login
        student nStudent = new student("A", 1, "A", AL);
        addStudent(nStudent);
        nStudent = new student("Andy", 2, "Pass", AL);
        addStudent(nStudent);
        nStudent = new student("B", 3, "", AL);
        addStudent(nStudent);

    }

    // Get and Add methods for each List in School Info

    public ArrayList getStudents(){
        return StudentList;
    }

    public void addStudent(student s){
        StudentList.add(s);
    }

    public ArrayList getInstructors(){
        return InstructorList;
    }

    public void addInstructor(instructor inst){
        InstructorList.add(inst);
    }

    public ArrayList getCourses(){
        return CourseList;
    }

    public void addCourse(course c){
        CourseList.add(c);
    }

    public student getCurUser(){
        return this.curUser;
    }

    public void setCurUser(student s){
        this.curUser = s;
    }

    // List Search methods for each data type in School Info

    public student FindStudent(String name){
        int i;
        student s;
        if (StudentList.size() != 0){
            for(i = 0; i < StudentList.size(); i++){
                s = (student) StudentList.get(i);
                if(name.equals(s.getName())){
                    return s;
                }
            }
        }
        return null;
    }

    public instructor FindInstructor(String name){
        int i;
        instructor inst;
        if (InstructorList.size() != 0){
            for(i = 0; i < InstructorList.size(); i++){
                inst = (instructor) InstructorList.get(i);
                if(name.equals(inst.getName())){
                    return inst;
                }
            }
        }
        return null;
    }

    public course FindCourse(int code){
        int i;
        course c;
        if (CourseList.size() != 0){
            for(i = 0; i < CourseList.size(); i++){
                c = (course) CourseList.get(i);
                if(code == c.getCode()){
                    return c;
                }
            }
        }
        return null;
    }

    public int FindCourseIndex(int code){
        int i;
        course c;
        if (CourseList.size() != 0){
            for(i = 0; i < CourseList.size(); i++){
                c = (course) CourseList.get(i);
                if(code == c.getCode()){
                    return i;
                }
            }
        }
        return -1;
    }
}