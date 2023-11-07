package JavaPaper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {

    String Student_name;
    int prnNo;

}

class Trainer extends Student {

    String trainer_name;

    Trainer(String name, String Student_name, int prnNo) {
        this.trainer_name = trainer_name;
        super.Student_name = Student_name;
        super.prnNo = prnNo;
    }
}

class Assignment extends Trainer {

    String title;
    LocalDate date;
    String Description;
    String Assignee;

    public Assignment(String name, String Student_name, int prnNo) {
        super(name, Student_name, prnNo);
     
    }
   public void showdeatils(){
       System.out.println(
               super.Student_name + "\n"+
                super.prnNo+ "\n"+
                super.trainer_name);
   }
   

}

public class Assignement_Manager {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Studetnt : ");
        String Student_name = sc.next();
        System.out.println("Enter the prnNo. of Student : ");
        String prnNo = sc.next();
        System.out.println("Enter the Name of Trainer");
        String trainer_name = sc.next();
        System.out.println("Enter the Title :");
        String title = sc.next();

        Assignment a1 = new Assignment("Janvi Mam","Milind",12345);
          Assignment a2 = new Assignment("Pujja Mam","Parag",12346);
        Assignment a3 = new Assignment("Shital Mam","Sanjiv",12347);

        List<Assignment> l = new ArrayList<>();
        l.add(a1);
        l.add(a2);
        l.add(a3);
        
        l.get(0).showdeatils();
          l.get(1).showdeatils();
              l.get(2).showdeatils();
        
        
        
    }
}

