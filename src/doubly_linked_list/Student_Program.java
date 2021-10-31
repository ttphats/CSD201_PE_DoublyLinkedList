/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubly_linked_list;

import com.Menu;

/**
 *
 * @author SE150968 - Thai Thanh Phat
 */
public class Student_Program {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add a new student list");
        menu.add("Count the number of a student in a class");
        menu.add("Add rank for students by average grade");
        menu.add("Sort ascendening by average grade");
        menu.add("Print student list by class");
        menu.add("Print all student list");
        menu.add("Quit");
        StudentList stuList = new StudentList();
        int userChoice;
        do {
            userChoice = menu.getUserChoice();
            switch(userChoice) {
            case 1:
                stuList.addStudentList();
                break;
            case 2:
                stuList.countStudentOfClass();
                break;
            case 3: 
                stuList.addRankOfStudent();
                break;
            case 4:
                stuList.sortStudentListByAvgGrade();
                break;
            case 5:
                stuList.displayStudentByClass();
                break;
            case 6:
                stuList.display();
                break;
            default:
                break;
        }
        } while (userChoice > 0 && userChoice < 8);
    }
}
