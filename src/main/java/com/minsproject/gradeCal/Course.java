package com.minsproject.gradeCal;

public class Course {
    private final String subject;
    private final int credit;
    private final String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return this.credit;
    }

    public double getGradeToNumber() {
        double number = 0;
        switch (this.grade) {
            case "A+":
                number = 4.5;
                break;
            case "A":
                number = 4.0;
                break;
            case "B+":
                number = 3.5;
                break;
            case "B":
                number = 3.0;
                break;
            case "C+":
                number = 2.5;
                break;
            case "C":
                number = 2.0;
                break;
        }
        return number;
    }
}
