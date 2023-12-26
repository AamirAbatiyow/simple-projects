import java.util.Scanner;


class Hangman{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            String word = "power";
            boolean solved = false;
            char[] solution = new char[word.length()];
            char[] excluded = new char[300];
            int count = 0;
            for (int i = 0; i<word.length(); i++){
                solution[i] = '_';
            }
            while(!solved){
                System.out.println("WELCOME TO HANGMAN! YOUR GOAL IS TO GUESS THE CORRECT WORD ONE LETTER AT A TIME!");
                progress(word, solution);
                System.out.println();
                System.out.println("INCORRECT LETTERS");
                incorrect(word, excluded);
                System.out.println();
                System.out.println("GUESS A LETTER.");
                System.out.println();
                String guess = input.next().toLowerCase();
                if (word.contains(guess)){
                    for (int i = 0; i<word.length(); i++){
                        if (word.charAt(i)==guess.charAt(0)){
                            solution[i] = guess.charAt(0);
                        }
                    }
                } else {
                    excluded[count] = guess.charAt(0);
                    count++;
                }
                System.out.println();
                if (check(word, solution)){
                    solved = true;
                }
            }
            
            System.out.println("YOU HAVE COMPLETED THE WORD! GOOD JOB!");
            progress(word, solution);
            System.out.println("Number of incorrect guesses: " + count);
            System.out.println();
        }
    }

    public static void progress(String word, char[] solution){
        System.out.println();
        for (int i = 0; i<word.length();i++){
            System.out.print(solution[i]+" ");
        }
        System.out.println();
    }

    public static void incorrect(String word, char[] excluded){
        System.out.println();
        for (int i = 0; i<word.length();i++){
            System.out.print(excluded[i]+" ");
        }
    }

    public static boolean check(String word, char[] solution){
        for (int i = 0; i<word.length(); i++){
            if (word.charAt(i)!=solution[i]){
                return false;
            }
        }
        return true;
    }
}