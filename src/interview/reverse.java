package interview;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the name:");
        String name= scan.next();
        for(int i=name.length()-1;i>=0;i--){
        System.out.println( name.charAt(i));

    }
}
}