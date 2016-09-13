/*
 * this program will determine a game for the user based on his/her response
 * Author: Andy Su
 * September 16, 2014
 */

import java.util.Scanner;



class recommender1{
  public static void main(String args[]){
    Scanner input= new Scanner(System.in);
    String r1,r2,r3,r4;
    
    System.out.println("This program will suggest you some games based on your answers of the following 4 questions");
    

    
    System.out.println (" ");
    
    
    System.out.print("Do you like online games, y for yes , n for no");
    r1=input.nextLine();
    
    System.out.print("Do you like fighting games, y for yes, n for no");
    r2 = input.nextLine();
    
    System.out.print("do you like survival games, y for yes, n for no");
    r3= input.nextLine();
    
    System.out.print("Do you like mutiplayer games, y for yes, n for no");
    r4 = input.nextLine();
    
    
    
    if (r1.equals("y") && r2.equals("y") && r3.equals("y") && r4.equals("y")){
      System.out.print("1");
    }else if (r1.equals("y") && r2.equals("n") && r3.equals("y") && r4.equals("y")){
      System.out.print("2");
    }else if (r1.equals("y") && r2.equals("y") && r3.equals("n") && r4.equals("y")){
      System.out.print("3");
    }else if (r1.equals("y") && r2.equals("y") && r3.equals("y") && r4.equals("n")){
      System.out.print("4");
    }else if (r1.equals("n") && r2.equals("n") && r3.equals("y") && r4.equals("y")){
      System.out.print("5");
    }else if (r1.equals("y") && r2.equals("y") && r3.equals("n") && r4.equals("n")){
      System.out.print("6");
    }else if (r1.equals("n") && r2.equals("y") && r3.equals("y") && r4.equals("n")){
      System.out.print("7");
    }else if (r1.equals("y") && r2.equals("n") && r3.equals("y") && r4.equals("n")){
      System.out.print("8");
    }else if (r1.equals("n") && r2.equals("y") && r3.equals("n") && r4.equals("y")){
      System.out.print("9");
    }else if (r1.equals("y") && r2.equals("n") && r3.equals("n") && r4.equals("y")){
      System.out.print("10");
    }else if (r1.equals("n") && r2.equals("y") && r3.equals("y") && r4.equals("y")){
      System.out.print("12");
    }else if (r1.equals("n") && r2.equals("n") && r3.equals("n") && r4.equals("y")){
      System.out.print("13");
    }else if (r1.equals("n") && r2.equals("y") && r3.equals("n") && r4.equals("n")){
      System.out.print("14");
    }else if (r1.equals("y") && r2.equals("n") && r3.equals("n") && r4.equals("n")){
      System.out.print("15");
    }else if (r1.equals("n") && r2.equals("y") && r3.equals("n") && r4.equals("n")){
      System.out.print("16");
    }else if (r1.equals("n") && r2.equals("n") && r3.equals("n") && r4.equals("n")){
      System.out.print("Do you even play games?");
    }
  }
}