import java.util.Scanner;
class Main {
  //class
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Create scanner
    System.out.println("Five character string?");
    //ask for string
    String five = input.nextLine();
    //string input
    char first = five.charAt(0);
    //first char
    char second = five.charAt(1);
    //second char
    System.out.println(""+first + second);
    //print first 2 
    char third = five.charAt(2);
    //third char
    char fourth = five.charAt(3);
    //fourth char
    char fifth = five.charAt(4);
    //fifth char
    System.out.println(""+ third + fourth + fifth);
    //print last 3
  }
}
