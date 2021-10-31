/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubly_linked_list;

import com.Student;
import java.util.Scanner;
import util.MyToys;

/**
 *
 * @author SE150968 - Thai Thanh Phat
 */
public class StudentList extends DLL {

    Scanner sc = null;

    public StudentList() {
        super();
        sc = new Scanner(System.in);
    }

    public void addStudentList() {
        String studentName;
        String studentClass;
        Double avgGrade;
        String studentRank;
        int count = 0;
        int subCount = 1;
        System.out.print("Enter the number of students that you want to add: ");
        count = Integer.parseInt(sc.nextLine());
        while (count > 0) {
            System.out.println("You are preparing to add a student #" + subCount);
            studentName = MyToys.getString("Enter the name of student: ", "The name of student is required");
            studentClass = MyToys.getString("Enter the class of student: ", "The class of student is required");
            avgGrade = MyToys.getADouble("Enter the average  of student: ", "Wrong format! Try again");
            studentRank = MyToys.getString("Enter the rank of student: ", "The rank of student is required");
            Student stu = new Student(studentName, studentClass, avgGrade, studentRank);
            this.add(stu);
            subCount++;
            count--;
        }
    }

    public int countStudentOfClass(String studentClass) {
        DLLNode<Student> ref;
        int count = 0;
        for (ref = this.getHead(); ref != null; ref = ref.next) {
            if (ref.info.studentClass.equalsIgnoreCase(studentClass)) {
                count++;
            }
        }
        return count;
    }

    public void countStudentOfClass() {
        String studentClass = MyToys.getString("Enter the class of student: ", "The class of student is required");
        int count = countStudentOfClass(studentClass);
        System.out.println("Number of student in class " + studentClass + " is : " + count);
    }

    public void addRankOfStudent() {
        DLLNode<Student> current;
        for (current = this.getHead(); current != null; current = current.next) {
            if (current.info.avgGrade < 5) {
                current.info.studentRank = "Yeu";
            } else if (current.info.avgGrade >= 5 && current.info.avgGrade <= 6) {
                current.info.studentRank = "TB";
            } else if (current.info.avgGrade > 6 && current.info.avgGrade < 8) {
                current.info.studentRank = "Kha";
            } else {
                current.info.studentRank = "Gioi";
            }
        }
    }

    public void sortStudentListByAvgGrade() {
        DLLNode<Student> current = null;
        DLLNode<Student> index = null;
        Student temp;
        //Check whether list is empty  
        if (head == null) {
            return;
        } else {
            //Current will point to head  
            for (current = head; current.next != null; current = current.next) {
                //Index will point to node next to current  
                for (index = current.next; index != null; index = index.next) {
                    //If current's data is greater than index's data, swap the data of current and index  
                    if (current.info.avgGrade > index.info.avgGrade) {
                        temp = current.info;
                        current.info = index.info;
                        index.info = temp;
                    }
                }
            }
        }
    }

    public void display() {
        //Node current will point to head  
        DLLNode<Student> current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            //Prints each node by incrementing the pointer.  

            System.out.println(current.info.toString() + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayStudentByClass() {
        DLLNode<Student> current = head;
        String studentClass;
        studentClass = MyToys.getString("Enter the class of student that you want to show student list: ", "The class of student is required");
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        else if (current.info.studentClass.equalsIgnoreCase(studentClass)) {
            System.out.println("The student list of class " + studentClass + ":");
            while (current != null) {
                System.out.println(current.info.toString() + " ");
                current = current.next;
            }
        }
        System.out.println();
    }
}
