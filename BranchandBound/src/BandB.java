
import java.util.*;
import java.io.*;

public class BandB {



    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String input;
        String startpattern;
        String finalpattern;
        System.out.print("Enter the starting word and final word: ");
        input = scan.next();
        startpattern = input.substring(0);
        finalpattern = input.substring(1);
        System.out.println("The words you entered are: " + startpattern + ' ' + finalpattern);
    }
}
