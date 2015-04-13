package com.example.ryan.testapplications;

import junit.framework.TestCase;

import java.util.ArrayList;

public class instructorTest extends TestCase {
    public SchoolInfo school = SchoolInfo.getInstance();
    public ArrayList courses = new ArrayList<course>();

    // EVA4
    public void testLongName() throws Exception{
        instructor inst = new instructor("ThisStringIsATestToSeeHowLongTheNameFieldIsAllowedToBe", "123ABC", courses);
        assertEquals("output", "ThisStringIsATestToSeeHowLongTheNameFieldIsAllowedToBe", inst.getName());
    }
    // EVA5
    public void testUnusualNameI() throws Exception{
        instructor inst = new instructor("*!&#^%", "123ABC", courses);
        assertNotSame("output", "", inst.getName());
    }

    // BVA5
    public void testCourseList() throws Exception{
        course c1 = school.FindCourse(4331);
        courses.add(c1);
        instructor inst = new instructor("Namin", "123ABC", courses);
        assertEquals("output", 1, inst.getCourseList().size());
    }
    // BVA6
    public void testEmptyCourseList() throws Exception{
        instructor inst = new instructor("Namin", "123ABC", courses);
        assertEquals("output", 0, inst.getCourseList().size());
    }
    // BVA7
    public void testNullCourseList() throws Exception{
        instructor inst = new instructor("Namin", "123ABC", null);
        assertNull("output", inst.getCourseList());
    }

    // EG4
    public void testNullInstructorInfo() throws Exception{
        instructor inst = school.FindInstructor("Ryan");
        assertNull(inst);
    }
    // EG5
    public void testInstructorInfo() throws Exception{
        instructor i2 = new instructor("JRAN", "technical", courses);
        school.addInstructor(i2);
        instructor i1 = school.FindInstructor("JRAN");
        assertNotNull(i1);
    }
    // EG6
    public void testNullInstructor() throws Exception{
        instructor inst = null;
        assertNull(inst);
    }
}