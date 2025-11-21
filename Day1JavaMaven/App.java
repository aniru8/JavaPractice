package com.example.Day1JavaMaven;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        Employee emp= new Employee(null, 0, null, null);
//        //System.out.println(emp);
//        emp.setEmpId(123);
//        emp.setEmpName("Anirudha");
//        emp.setDesg("Software Engineer");
//        emp.setMobileNumber("5392358");
//        System.out.println(emp);
//        
//        Employee e1 =new Employee ("Anirudha",432,"Manager","5209501");
//        System.out.println(e1);
    	Student s1=new Student(123,"Anirudha",99);
    	Student s2=new Student(123,"Anirudha",99);
    	
    	System.out.println(s1.hashCode());
    	System.out.println(s2.hashCode());
    	System.out.println(s1==s2);
    	System.out.println(s1.equals(s2));
    	
    	Class1 c1= new Class1();
    	c1.sayHello();
    	
    	Interface1 i1=new Class1();
    	i1.sayHello();
    	
    	Interface2 i2=new Class1();
    	i2.sayHello();
    }
}
