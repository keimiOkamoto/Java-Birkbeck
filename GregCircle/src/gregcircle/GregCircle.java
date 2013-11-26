/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gregcircle;

/**
 *
 * @author keimiokamoto
 */
public class GregCircle {

 public static void main(String[] args) {
        QueueNode head = new QueueNode();
        Student student1 = new Student();
        student1.setName("Spiderman");
        Student student2 = new Student();
        student2.setName("Hulk");
        Student student3 = new Student();
        student3.setName("Thor");
        Student student4 = new Student();
        student4.setName("Cat woman");
        head.addStudent(student1, head);
        head.addStudent(student2, head);
        head.addStudent(student3, head);
        head.addStudent(student4, head);
        head.deleteStudentByName("Hulk", head);
        //head.deleteStudentByName("Spiderman", head);
        head.nextNode.printData();
        
       /* 
       for (int i = 1; i <= 20; i++) {
         Student student = new Student();
         student.setName("student " + i);
         head.addStudent(student, head);

        }
        head.nextNode.printData();
        head.deleteStudentByName("student 10", head);
        head.deleteStudentByName("student 12", head);
        head.deleteStudentByName("student 1", head);
        head.deleteStudentByName("student 2", head);
        head.deleteStudentByName("student 13", head);
        head.deleteStudentByName("student 5", head);
        System.out.println("___________________");
        head.nextNode.printData();
        */
    }
}