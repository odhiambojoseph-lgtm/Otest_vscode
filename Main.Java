import java.util.Scanner;

class user_details{
    String username;
    int age;
     Scanner  BSE = new Scanner(System.in);
    String password;
}
class student extends user_details{
   
  void display(){

      System.out.println("let us test if i still remember oop");
      System.out.println("enter username");
      username = BSE.nextLine();
      System.out.println("hehehehe  "+username);
      System.out.println("enter password");
      password = BSE.nextLine();
      System.out.println("your password is ****");
       System.out.println("enter age");
      age = BSE.nextInt();  
      System.out.println("age "+age);
      System.out.println("summary of the entered details is as follows");
       System.out.println("username  "+username); 
       System.out.println("age  "+age);
        System.out.println("password  ****");
  }
}
class grades{
     int Scores ;
    void merit(){
        if(Scores >= 70 && Scores <=100){
            System.out.println("your grade is A");
        }
        else if(Scores >60 && Scores<=69){
            System.out.println("Your grade is B");
        }
        else if(Scores>=50 && Scores <=59){
            System.out.println("Your grade is C");
        }
        else if(Scores>=40 && Scores <=49){
            System.out.println("your grade is D");
        }
        else{
            System.out.println("You have failed to met the expectations");
        }
    }
}
class Lecturer extends grades{
       Scanner Scare = new Scanner(System.in);
    void powers(){
        System.out.println("enter scores fro the student");
        Scores = Scare.nextInt();
        
    }
}

public class Main{
    public static void main(String[]args){
        System.out.println("hello world"  );
        student joe = new student();
        joe.display();

        Lecturer john = new Lecturer();
        john.powers();
        john.merit(); 
    }
}