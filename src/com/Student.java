/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author SE150968 - Thai Thanh Phat
 */
public class Student {
    public String studentName;
    public String studentClass;
    public Double avgGrade;
    public String studentRank;
    

    public Student() {
        
    }

    public Student(String studentName, String studentClass, Double avgGrade, String studentRank) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.avgGrade = avgGrade;
        this.studentRank = studentRank;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public Double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(Double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getStudentRank() {
        return studentRank;
    }

    public void setStudentRank(String studentRank) {
        this.studentRank = studentRank;
    }

    @Override
    public String toString() {
        return "studentName=" + studentName + ", studentClass=" + studentClass + ", avgGrade=" + avgGrade + ", studentRank=" + studentRank;
    }
    
}
