import java.util.Scanner;

public class RockPaperScissors {
    // get computer choice: 0-rock,1-paper,2-scissors
    public static int getComputerChoice() {
        return (int)(Math.random()*3);
    }

    // decide winner: 0-draw,1-user,2-computer
    public static int findWinner(int user, int comp) {
        if (user == comp) return 0;
        if ((user==0 && comp==2)||(user==1 && comp==0)||(user==2 && comp==1)) return 1;
        return 2;
    }

    // get choice name
    public static String choiceName(int n) {
        return n==0?"Rock":n==1?"Paper":"Scissors";
    }

    // display results and stats
    public static void displayResults(int[] userWins, int[] compWins, int totalGames) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < totalGames; i++) {
            String winner = userWins[i]==1?"User":compWins[i]==1?"Computer":"Draw";
            System.out.println((i+1)+"\t"+choiceName(userWins[i])+"\t"+choiceName(compWins[i])+"\t"+winner);
        }
        int userTotal=0, compTotal=0;
        for(int i=0;i<totalGames;i++){
            if(userWins[i]==1) userTotal++;
            if(compWins[i]==1) compTotal++;
        }
        System.out.println("\nStats:");
        System.out.println("User Wins: "+userTotal+" ("+ (userTotal*100.0/totalGames)+"%)");
        System.out.println("Computer Wins: "+compTotal+" ("+ (compTotal*100.0/totalGames)+"%)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        int[] userChoices = new int[n];
        int[] compChoices = new int[n];
        int[] userWins = new int[n]; // 1 if user wins
        int[] compWins = new int[n]; // 1 if computer wins

        for (int i = 0; i < n; i++) {
            System.out.print("Game "+(i+1)+", Enter 0-Rock,1-Paper,2-Scissors: ");
            userChoices[i] = sc.nextInt();
            compChoices[i] = getComputerChoice();
            int winner = findWinner(userChoices[i], compChoices[i]);
            if (winner == 1) userWins[i]=1;
            else if (winner==2) compWins[i]=1;
        }

        displayResults(userChoices, compChoices, n);
        sc.close();
    }
}
