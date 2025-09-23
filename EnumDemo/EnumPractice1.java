package JAVA_DSA_Learning.EnumDemo;

import java.util.Scanner;

enum Day{
    MON ("Weekday"),TUE("Weekday"),WED("Weekday"),THU("Weekday"),FRI("Weekday"),SAT("Weekend") , SUN("Weekend");
    String typeOfDay;
    private Day(String type){
        this.typeOfDay = type;
    }

    public void display(){
        System.out.println(this.name()+" is a "+this.typeOfDay);
    }
}
public class EnumPractice1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a day (eg. mon): ");
        String s = in.next().toUpperCase();
        Day d = Day.valueOf(s);
        Day[] list = Day.values();
        d.display();
        System.out.println("Printing all the abbreviation and status of a day:");
        for(Day x:list){
            x.display();
        }
    }
}
