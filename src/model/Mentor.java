package model;

public class Mentor extends User{
    private double experience;
    private double salaryForLesson;

    public double getSalaryForLesson() {
        return salaryForLesson;
    }

    public void setSalaryForLesson(double salaryForLesson) {
        this.salaryForLesson = salaryForLesson;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
