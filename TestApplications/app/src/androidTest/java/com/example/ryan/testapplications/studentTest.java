package com.example.ryan.testapplications;

import junit.framework.TestCase;

import java.util.ArrayList;

public class studentTest extends TestCase {
    public SchoolInfo school = SchoolInfo.getInstance();
    public ArrayList sections = new ArrayList<section>();
    public ArrayList students = new ArrayList<student>();

    // EP1
    public void testValidName() throws Exception{
        student st = new student("Name", 001, "A", sections);
        assertEquals("output", "Name", st.getName());
    }
    // EP2
    public void testEmptyName() throws Exception{
        student st = new student("", 001, "A", sections);
        assertEquals("output", "", st.getName());
    }
    // EP3
    public void testNegID() throws Exception{
        student st = new student("A", -50, "A", sections);
        assertEquals("output", 50, st.getID());
    }
    // EP4
    public void testValidID() throws Exception{
        student st = new student("A", 001, "A", sections);
        assertEquals("output", 001, st.getID());
    }
    // EP5
    public void testNumberName() throws Exception{
        student st = new student("123", 001, "A", sections);
        assertEquals("output", "123", st.getName());
    }

//    // EVA1
//    public void testTooLargeID() throws Exception{
//        student st = new student("A", 220000000 * 10, "A", sections);
//        assertSame("output", 220000000 * 10, st.getID());
//    }
//    // EVA2
//    public void testLargeNegID() throws Exception{
//        student st = new student("A", -220000000 * 10, "A", sections);
//        assertSame("output", 220000000 * 10, st.getID());
//    }
    // EVA3
    public void testUnusualNameS() throws Exception{
        student st = new student("*!&#^%", 001, "A", sections);
        assertEquals("output", "*!&#^%", st.getName());
    }

    // BVA1
    public void testZeroID() throws Exception{
        student st = new student("A", 0, "A", sections);
        assertEquals("output", 0, st.getID());
    }
    // BVA2
    public void test1ElSectionList() throws Exception{
        section s1 = new section(101, 4, school.FindInstructor("Perez"), students);
        sections.add(s1);
        student st = new student("A", 123, "A", sections);
        assertEquals("output", 1, st.getCourseList().size());
    }
    // BVA3
    public void testEmptySectionList() throws Exception{
        student st = new student("A", 123, "A", sections);
        assertEquals("output", 0, st.getCourseList().size());
    }
    // BVA4
    public void testNullSectionList() throws Exception{
        student st = new student("A", 123, "A", null);
        assertNull("output", st.getCourseList());
    }

    // EG1
    public void testNullStudentInfo() throws Exception{
        student st = school.FindStudent("Ryan");
        assertNull(st);
    }
    // EG2
    public void testStudentInfo() throws Exception{
        student s2 = new student("JRAN", 2015, "technical", sections);
        school.addStudent(s2);
        student s1 = school.FindStudent("JRAN");
        assertNotNull(s1);
    }
    // EG3
    public void testNullStudent() throws Exception{
        student st = null;
        assertNull(st);
    }
}