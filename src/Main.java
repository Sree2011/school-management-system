package school.management.system;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1,"Lizzy",500);
        Teacher Elisa = new Teacher(2,"Elisa",700);
        Teacher VanderHorn =  new Teacher(3,"VanderHorn",600);
        List<Teacher> teachersList = new ArrayList<Teacher>();
        teachersList.add(Lizzy);
        teachersList.add(Elisa);
        teachersList.add(VanderHorn);

        Student Cham = new Student(1,"Cham",4);
        Student Rakshith = new Student(2,"Rakshith",12);
        Student Rabby = new Student(3,"Rabby",5);

        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(Cham);
        studentsList.add(Rakshith);
        studentsList.add(Rabby);


        School GHS = new School(teachersList,studentsList);

        System.out.println("GHS has earned : $"+GHS.getTotal_money_earned());

        Cham.payFees(5000);
        System.out.println("Details of Student 1:");
        System.out.println("Id: "+Cham.getId());
        System.out.println("Name: "+Cham.getName());
        System.out.println("Fee Paid: $"+Cham.getFeesPaid());
        System.out.println("Remaining Fee : $"+(30000- Cham.getFeesPaid()));
        System.out.println("-----------------");
        System.out.println("GHS has earned : $"+GHS.getTotal_money_earned());
        System.out.println("-----------------");

        Rakshith.payFees(2000);
        System.out.println("Details of Student 2:");
        System.out.println("Id: "+Rakshith.getId());
        System.out.println("Name: "+Rakshith.getName());
        System.out.println("Fee Paid: $"+Rakshith.getFeesPaid());
        System.out.println("Remaining Fee : $"+(30000- Rakshith.getFeesPaid()));
        System.out.println("-----------------");
        System.out.println("GHS has earned : $"+GHS.getTotal_money_earned());
        System.out.println("-----------------");

        Rabby.payFees(1000);
        System.out.println("Details of Student 3:");
        System.out.println("Id: "+Rabby.getId());
        System.out.println("Name: "+Rabby.getName());
        System.out.println("Fee Paid: $"+Rabby.getFeesPaid());
        System.out.println("Remaining Fee : $"+(30000- Rabby.getFeesPaid()));
        System.out.println("-----------------");
        System.out.println("GHS has earned : $"+GHS.getTotal_money_earned());
        System.out.println("-----------------");


        Lizzy.receiveSalary(500);
        System.out.println("Details of Teacher 1: ");
        System.out.println("Id: "+Lizzy.getId());
        System.out.println("Name: "+Lizzy.getName());
        System.out.println("Salary: $"+Lizzy.getSalary());
        System.out.println("-----------------");
        System.out.println("GHS has earned : $"+GHS.getTotal_money_earned());
        System.out.println("-----------------");

        Elisa.receiveSalary(700);
        System.out.println("Details of Teacher 2: ");
        System.out.println("Id: "+Elisa.getId());
        System.out.println("Name: "+Elisa.getName());
        System.out.println("Salary: $"+Elisa.getSalary());
        System.out.println("-----------------");
        System.out.println("GHS has earned : $"+GHS.getTotal_money_earned());
        System.out.println("-----------------");

        VanderHorn.receiveSalary(600);
        System.out.println("Details of Teacher 3: ");
        System.out.println("Id: "+VanderHorn.getId());
        System.out.println("Name: "+VanderHorn.getName());
        System.out.println("Salary: $"+VanderHorn.getSalary());
        System.out.println("-----------------");
        System.out.println("GHS has earned : $"+GHS.getTotal_money_earned());
        System.out.println("-----------------");


    }
}
