import java.util.Scanner;

import javax.sound.midi.SysexMessage;

class Hangman{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            String word = "power";
            boolean solved = false;
            char[] solution = new char[word.length()];
            char[] excluded = new char[26];
            for (int i = 0; i<word.length(); i++){
                solution[i] = '_';
            }
            while(!solved){
                System.out.println("WELCOME TO HANGMAN! YOUR GOAL IS TO GUESS THE CORRECT WORD ONE LETTER AT A TIME!");
                System.out.println("GUESS A LETTER.");
            }
        }
    }

    public static void progress(String word, char[] solution){
        System.out.println();
        for (int i = 0; i<word.length();i++){
            System.out.print(solution[i]+" ");
        }
        System.out.println();
    }
}