
import java.util.*;
import java.io.*;

public class BandB {

    public static boolean checkValidInput(String entry, String exit){
        char[] entrystring = new char[entry.length()];
        for(int i = 0; i< entry.length(); i++){
            entrystring[i] = entry.charAt(i);
        }
        char[] exitstring = new char[exit.length()];
        boolean valid = true;
        for(int i = 0; i < entrystring.length; i++){
            if(exit.indexOf(entrystring[i]) < i && entrystring[i] != '-' ){
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
        if(startpattern.length() < 3 || startpattern.length() != finalpattern.length()){
            System.out.println("Invalid Entry by User");
        }
        else if (startpattern.equals(finalpattern)){
            System.out.print(startpattern + ' ' + finalpattern);
        }
        else {
            boolean validentry = checkValidInput(startpattern,finalpattern);
            if(!validentry){
                System.out.println("Invalid Entry by Users");
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
