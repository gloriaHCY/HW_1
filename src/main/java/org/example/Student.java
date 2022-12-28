package org.example;

 interface Payment{
     int getPaymentAmount();
}

 class Student {
     private String firstName;
     private String lastName;
     private String studentID;

     public String getFirstName() {
         return firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public String getStudentID() {
         return studentID;
     }

     public Student(String firstName, String lastName, String studentID) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.studentID = studentID;
     }

     @Override
     public String toString() {
         return "姓名="+lastName+firstName+", 學號="+studentID;
     }
 }

 class UndergraduateStudent extends Student implements Payment {
     public UndergraduateStudent(String firstName, String lastName, String studentID) {
         super(firstName, lastName, studentID);
     }
     public int getPaymentAmount() {
         return 30000;
     }
}

 class GraduateStudent extends Student implements Payment{
     public int numberOfCourse;
     public GraduateStudent(String firstName, String lastName, String studentID, int numberOfCourse) {
         super(firstName, lastName, studentID);
         this.numberOfCourse = numberOfCourse;
     }
    public int getPaymentAmount(){
        return numberOfCourse * 4500;
    }
}

 class EveningProgramStudent extends Student implements Payment {
     public EveningProgramStudent(String firstName, String lastName, String studentID) {
         super(firstName, lastName, studentID);
     }

     public int getPaymentAmount() {
         return 50000;
     }
 }
