package Java8;

import java.util.List;

public class Student {
    private String name;
    private int gradeLevel;
    private double cgpa;
    private String gender;
    private int noteBooks;
    List<String> activities;

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public int getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    }

    public Student(String name, int gradeLevel, double cgpa, String gender, int noteBooks, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.cgpa = cgpa;
        this.gender = gender;
        this.activities = activities;
        this.noteBooks = noteBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student : " +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", cgpa=" + cgpa +
                ", gender='" + gender + '\'' +
                ", noteBooks=" + noteBooks + '\'' +
                ", activities=" + activities;
    }
}
