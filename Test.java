// package com.guest.epicodus;
// import java.util.ArrayList;
import java.io.Console;

public class Test {
  public static void main(String[] args) {
    // The first way of doing it:
    calculateAndReportTotalHours();

    // The second way:
    Console myConsole = System.console();
    System.out.println("How many hours did you work two days ago?");
    String twoDaysAgo = myConsole.readLine();
    System.out.println("Resulting input is " + twoDaysAgo);
    System.out.println("How many hours did you work yesterday?");
    String yesterday = myConsole.readLine();
    System.out.println("How many hours did you work so far today?");
    String today = myConsole.readLine();
    Integer totalHours = calculateTotalHours(Integer.parseInt(twoDaysAgo), Integer.parseInt(yesterday), Integer.parseInt(today));
    if(totalHours>1){
      System.out.println("You have worked for " + totalHours + " hours so far. Great job, you hard worker you!");
    } else{
      System.out.println("You have worked for " + totalHours + " hours so far. You have some explaining to do.");
    }
    // The third way (DRYest)
    Integer twoDays3 = getHours("two days ago");
    Integer yesterday3 = getHours("yesterday");
    Integer today3 = getHours("today");
    Integer totalHours3 = calculateTotalHours(twoDays3, yesterday3, today3);
    if(totalHours3 > 1){
      System.out.println("You have worked for " + totalHours3 + " hours so far. Great job, you hard worker you!");
    } else{
      System.out.println("You have worked for " + totalHours3 + " hours so far. You have some explaining to do.");
    }
  }


  public static void printMyName(){
    System.out.println("Who am I?");
  }

  public static void printXtimes(String str, int x){
    for (int i = 0; i<x; i++){
      System.out.println(str);
    }
  }

  public int[] favorite3(int a, int b, int c) {
    int[] allNumbers = {a, b, c};
      return allNumbers;
  }

  // public ArrayList makeArrayList(int a, int b, String c, String d){
  //   ArrayList returnVal = new ArrayList();
  //   returnVal.add(a);
  //   returnVal.add(b);
  //   returnVal.add(c);
  //   returnVal.add(d);
  //   return returnVal;
  // }

  public Boolean primeNumber(int a){
    for (int i = 2; i<a; i++){
      if (a%i ==0){
        return false;
      }
    }
    return true;
  }

  public static Integer getHours(String day){
    System.out.println("Got here");
    Console myConsole = System.console();
    System.out.println("How many hours did you work " + day + "?");
    Integer hours = Integer.parseInt(myConsole.readLine());
    return hours;
  }

  public static void calculateAndReportTotalHours() {
    Console myConsole = System.console();
    System.out.println("How many hours did you work two days ago?");
    String twoDaysAgo = myConsole.readLine();
    // System.out.println("Resulting input is " + twoDaysAgo);
    System.out.println("How many hours did you work yesterday?");
    String yesterday = myConsole.readLine();
    System.out.println("How many hours did you work so far today?");
    String today = myConsole.readLine();
    Integer totalHours = Integer.parseInt(twoDaysAgo) + Integer.parseInt(yesterday)+ Integer.parseInt(today);
    if(totalHours>1){
      System.out.println("You have worked for " + totalHours + " hours so far. Great job, you hard worker you!");
    } else{
      System.out.println("You have worked for " + totalHours + " hours so far. You have some explaining to do.");
    }
  }

  public static Integer calculateTotalHours(Integer int1, Integer int2, Integer int3) {
    Integer sum = int1+int2+int3;
    return  sum;
  }
}
