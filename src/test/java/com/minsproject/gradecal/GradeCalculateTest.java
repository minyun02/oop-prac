package com.minsproject.gradecal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GradeCalculateTest {

    // 이수한 과목을 전달하여 평균학점 계산을 요청 -> 학점 계산기 -> (학점수*교과목 평점)의 합계 -> 과목(코스)
    //                                               -> 수강신청 총학점 수 -> 과목(코스
    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculate gradeCalculate = new GradeCalculate(courses);
        double gradeResult = gradeCalculate.calculateGrade();


        assertThat(gradeResult).isEqualTo(4.5);
    }
}