import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        do {
            System.out.println("Player 1 beginnt mit X");
            System.out.println("gebe die Zeile an");
            int row = scan.nextInt();
            System.out.println("gebe die Spalte an");
            int col = scan.nextInt();

            System.out.println(game.isDraw());
            System.out.println(game.printBoard());



        }
        while (true);








    }

}
