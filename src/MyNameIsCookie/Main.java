package MyNameIsCookie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("What is Your name Fool?");
        String name=input.nextLine();
        System.out.println("Hello"+name+"Nice to meet u fool");
        System.out.println(name+", what is your age?");
        String age=input.nextLine();
        System.out.println(age+"! That's how old I am");
    }
}
