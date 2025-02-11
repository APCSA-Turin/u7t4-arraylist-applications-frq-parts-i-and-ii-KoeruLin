package com.example.project.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Utility 
{
    public static ArrayList<Student> sortStudents(ArrayList<Student> list)
    {
        for (int i = 0; i < list.size()-1; i++)
        {
            for (int j = 0; j < list.size()-i-1; j++)
            {
                Student one = list.get(j);
                Student two = list.get(j + 1);
              
                int compareLast = one.getLastName().compareTo(two.getLastName());
   
   
                if (compareLast == 0)
                {
                  int compareFirst = one.getFirstName().compareTo(two.getFirstName());
                  
                  if (compareFirst == 0)
                  {
   
                      if (one.getGpa() < (two.getGpa()))
                      {
                          list.set(j, two);
                          list.set(j + 1, one);
                      }
                  }
                  else if (compareFirst > 0)
                  {
                      list.set(j, two);
                      list.set(j + 1, one);
                  }
                }
                else if (compareLast > 0)
                {
                  list.set(j, two);
                  list.set(j + 1, one);
                }
            }
        }
          return list;
    }

    public static void main(String[] args)
    {
        Student s1 = new Student("Abby", "Smith", 96.7);
        Student s2 = new Student("Michelle", "Jones", 98.1);
        Student s3 = new Student("Chase", "Bean", 95.2);
        Student s4 = new Student("Jack", "Clancy", 97.3);
        Student s5 = new Student("Brittany", "Jones", 95.5);
        Student s6 = new Student("Lisa", "Frank", 92.4);
        Student s7 = new Student("Marie", "Angelina", 96.5);
        Student s8 = new Student("Peter", "Frank", 97.9);
        Student s9 = new Student("Lisa", "Frank", 99.5);
        Student s10 = new Student("Dean", "Jones", 93.2);

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
        ArrayList<Student> sorted = sortStudents(students);
        
        for (Student test : sorted)
        {
            System.out.println(test.getFirstName() + " " + test.getLastName());
        }
    }
}