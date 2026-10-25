//wap to create a class student with fields like ID name and marks implement the comparable interface to sort student by marks create a list of object
// of students and add 5 object to the list
import java.util.*;
class Student implements Comparable<Student> {
     int id;
     String name;
     int marks;
     Student(int i, String j, int k) {
        id = i;
        name = j;
        marks = k;
    }
    void print(){
        System.out.println("name" +name);
        System.out.println("id"+id);
        System.out.println("marks"+marks);
    }
   
    public int compareTo(Student other) {
         return this.marks - other.marks;
       // return Integer.compare(this.marks, other.marks);
    }
   
}

public class aex {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "shubham", 85));
        students.add(new Student(102, "rajan", 72));
        students.add(new Student(103, "honey", 90));
        students.add(new Student(104, "shreshtha", 65));
        students.add(new Student(105, "yashvi", 78));
        Collections.sort(students);
        System.out.println("Students sorted by marks:");
        for (Student s : students) {
            s.print();
        }
    }
}
