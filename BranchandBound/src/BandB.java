
import java.util.*;
import java.io.*;

public class BandB {

    public static boolean checkValidInput(String entry, String exit){
        char[] entrystring = new char[entry.length()];
        char[] exitstring = new char[exit.length()];
        boolean valid = true;
        for(int i = 0; i < entrystring.length; i++){
            if(exit.indexOf(entrystring[i]) < i){
                valid = false;
            }
        }
        return valid;
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String input;
        String startpattern;
        String finalpattern;
        char [] inputpattern;
        System.out.print("Enter the starting word and final word:");
        input = scan.nextLine();
        String[] parts = input.split("\\s+");
        startpattern = parts[0];
        finalpattern = parts[1];
        if(startpattern.length() < 3){
            System.out.println("Invalid Entry input has to be more than 2 letters");
        }
        else if (startpattern.equals(finalpattern)){
            System.out.print(startpattern + ' ' + finalpattern);
        }
        else {
            boolean validentry = checkValidInput(startpattern,finalpattern);
            if(!validentry){
                System.out.println("Invalid Entry not a possible move");
            }
            else {
                inputpattern = new char[startpattern.length()];
                for (int i = 0; i < inputpattern.length; i++) {
                    inputpattern[i] = startpattern.charAt(i);
                }
                for (int i = 0; i < inputpattern.length; i++) {
                    System.out.print(inputpattern[i]);
                }
                System.out.println();
            }

        }

    }
}
