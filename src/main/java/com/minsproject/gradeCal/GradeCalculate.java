package com.minsproject.gradeCal;

import java.util.List;

public class GradeCalculate {
    private final List<Course> courses;

    public GradeCalculate(List<Course> courses) {
        this.courses = courses;
    }

    /*
    요구사항
    평균학점 계산 방법 = (학점수*교과목 평점)의 합계 / 수강신청 총 학점 수
    일급 컬렉션 사용
     */
    public double calculateGrade() {
        // (학점수*교과목 평점)의 합계
        double mulitpliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            mulitpliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }

        // 수강신청 총학점 수
        int totalCompletedCredit = courses.stream().mapToInt(Course::getCredit).sum();

        return mulitpliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
