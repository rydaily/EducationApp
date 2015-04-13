package com.example.ryan.testapplications;

import java.util.ArrayList;

public class instructor {

    private String name;
    private String password;
    private ArrayList courses = new ArrayList<course>();

    public instructor(String instructName, String pass, ArrayList courseList) {
        name = instructName;
        password = pass;
        courses = courseList;
    }

    public String getName(){
        return name;
    }

    public String getPass(){
        return password;
    }

    public ArrayList getCourseList(){
        return courses;
    }

    public void addCourse(course c){
        courses.add(c);
    }

}
