import java.util.Scanner;

public class Board {

        public static void main(String[] args) {

                boolean playAgain = true;


                while (playAgain == true) {

                        boolean playerXTurn = true;
                        boolean haveWinner = false;
                        int spacesRemaining = 9;

                        char playerX = 'X';
                        char playerO = 'O';
                        char winner = ' ';

                        char[] gameBoard = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

                        System.out.println("Welcome to Tic-Tac-Toe!\nPlayer X goes first, Player O will go second.\n");

                        System.out.println("        #&         %&       "+
                                "\n   0    #&    1    %&   2   "+
                                "\n        #&         %&       "+
                                "\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+
                                "\n        #&         %&       "+
                                "\n   3    #&    4    %&   5   "+
                                "\n        #&         %&       "+
                                "\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+
                                "\n        #&         %&       "+
                                "\n   6    #&    7    %&   8   "+
                                "\n        #&         %&       ");

                        System.out.println("Enter a number from 0-8 as shown above to place a piece on the board.\n"+
                                "You may only place a piece on an empty space.");

                        Scanner sc = new Scanner(System.in);

                        while(haveWinner == false && spacesRemaining > 0) {

                                int i = sc.nextInt();
                                if((i >=0 && i < 9) && !(gameBoard[i] == 'X' || gameBoard[i] == 'O')) {
                                        if (playerXTurn == true) {
                                                gameBoard[i] = 'X';
                                                playerXTurn = false;
                                        }
                                        else {
                                                gameBoard[i] = 'O';
                                                playerXTurn = true;

                                        }
                                }

                                if(gameBoard[0] != ' ' && (gameBoard[0] == gameBoard[1]) && (gameBoard[0] == gameBoard[2])) {
                                        haveWinner = true;
                                        winner = gameBoard[0];
                                }

                                if(gameBoard[3] != ' ' && (gameBoard[3] == gameBoard[4]) && (gameBoard[3] == gameBoard[5])) {
                                        haveWinner = true;
                                        winner = gameBoard[3];
                                }

                                if(gameBoard[6] != ' ' && (gameBoard[6] == gameBoard[7]) && (gameBoard[6] == gameBoard[8])) {
                                        haveWinner = true;
                                        winner = gameBoard[6];
                                }


                                if(gameBoard[0] != ' ' && (gameBoard[0] == gameBoard[3]) && (gameBoard[0] == gameBoard[6])) {
                                        haveWinner = true;
                                        winner = gameBoard[0];
                                }

                                if(gameBoard[1] != ' ' && (gameBoard[1] == gameBoard[4]) && (gameBoard[1] == gameBoard[7])) {
                                        haveWinner = true;
                                        winner = gameBoard[1];
                                }

                                if(gameBoard[2] != ' ' && (gameBoard[2] == gameBoard[5]) && (gameBoard[2] == gameBoard[8])) {
                                        haveWinner = true;
                                        winner = gameBoard[2];
                                }

                                if(gameBoard[0] != ' ' && (gameBoard[0] == gameBoard[4]) && (gameBoard[0] == gameBoard[8])) {
                                        haveWinner = true;
                                        winner = gameBoard[0];
                                }

                                if(gameBoard[2] != ' ' && (gameBoard[2] == gameBoard[4]) && (gameBoard[2] == gameBoard[6])) {
                                        haveWinner = true;
                                        winner = gameBoard[2];
                                }

                                System.out.println("        #&         %&       "+
                                        "\n   "+ gameBoard[0] +"    #&    "+ gameBoard[1] +"    %&   "+ gameBoard[2] +"   "+
                                        "\n        #&         %&       "+
                                        "\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+
                                        "\n        #&         %&       "+
                                        "\n   "+ gameBoard[3] +"    #&    "+ gameBoard[4] +"    %&   "+ gameBoard[5] +"   "+
                                        "\n        #&         %&       "+
                                        "\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+
                                        "\n        #&         %&       "+
                                        "\n   "+ gameBoard[6] +"    #&    "+ gameBoard[7] +"    %&   "+ gameBoard[8] +"   "+
                                        "\n        #&         %&       ");

                                spacesRemaining--;

                        }


                        if (haveWinner == true) {
                                System.out.println("The Winner is Player " + winner +"!");
                        }
                        else {
                                System.out.println("Tie Game.");
                        }

                        System.out.println("Play again? Enter [Y/N]");

                        String userResponse = sc.nextLine();

                        if (userResponse != "Y") {
                                playAgain = false;
                        }



                }



        }
}
