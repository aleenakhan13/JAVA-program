
import java.util.*;
class Student implements Comparable<Student>{  
    int rollno;  
    String name;  
    int age;  
    Student(int rollno,String name,int age){  
    this.rollno=rollno;  
    this.name=name;  
    this.age=age;  
    }  
    public int compareTo(Student st){  
        if(rollno==st.rollno)  
        return 0;  
        else if(rollno>st.rollno)  
        return 1;  
        else  
        return -1;  
        }  
        }  
        public class TestSort1{  
            public static void main(String args[]){  
            ArrayList<Student> al=new ArrayList<Student>();  
            al.add(new Student(101,"aleena",23));  
            al.add(new Student(106,"kaif",27));  
            al.add(new Student(105,"aayat",21));  
              
            Collections.sort(al);  
            for(Student st:al){  
            System.out.println(st.rollno+" "+st.name+" "+st.age);  
            }  
            }  
            }     
