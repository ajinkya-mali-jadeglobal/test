package assignement;

import java.util.*;

class Student {
	  
    // Class data members
    private String name,address;
    private int rollno;
    private int DOB;
    
  
    // Constructor
    public Student(int rollno, String name,String address,
                   int DOB) {
        // this keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.DOB = DOB;
        this.address=address;
    }
  
    // Getters and Setters method
  
    public String getname() { return name; }
    public void setname(String name) {
        this.name = name;
    }
    
    public String getaddress() { return address; }
    public void setaddress(String address) {
    	this.address=address;
    }
    
    public int getRollno() { return rollno; }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
  
    public int getDOB() { return DOB; }
    public void setDOB(int DOB) {
        this.DOB = DOB;
    }
  
    // Comparator for sorting the list by roll no
    public static Comparator<Student> StuRollno = new Comparator<Student>() {
  
        // Method
        public int compare(Student s1, Student s2) {
  
            int rollno1 = s1.getRollno();
            int rollno2 = s2.getRollno();
  
            return rollno1 - rollno2;
  
           
        }
    };
  
    // Overriding toString() method to list out student details
    @Override public String toString() {
  
        return " rollno=" + rollno + ", name="
               + name + ", address="+address+ ", age=" + DOB ;
    }
}
public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty ArrayList of Student type
        ArrayList<Student> arraylist
            = new ArrayList<Student>();
  
        // Adding elements to ArrayList
        arraylist.add(new Student(101, "Zues","Pune", 26));
        arraylist.add(new Student(505, "Abey","Mumbai", 24));
        arraylist.add(new Student(809, "Vignesh","Nashik", 32));
  
  
        // Now, sorting on Rollno property
        System.out.println("\nRollNum Sorting:\n");
  
        Collections.sort(arraylist, Student.StuRollno);
  
        // Iterating over list via for each and
        // printing the elements
        for (Student str : arraylist) {
            System.out.println(str);
        }
	}

}
