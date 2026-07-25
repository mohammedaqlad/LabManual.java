import java.util.Scanner;

class Board {
    private char[][] grid = {
        {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'},
        {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
        {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'}
    };

    public void display() {
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + "  ");
            for (int j = 0; j < 8; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("   a  b  c  d  e  f  g  h");
    }

    public boolean movePiece(String from, String to, boolean whiteTurn) {
        if (from.length() != 2 || to.length() != 2) return false;

        int fromCol = from.charAt(0) - 'a';
        int fromRow = 8 - (from.charAt(1) - '0');
        int toCol = to.charAt(0) - 'a';
        int toRow = 8 - (to.charAt(1) - '0');

        if (fromRow < 0 || fromRow > 7 || fromCol < 0 || fromCol > 7 ||
            toRow < 0 || toRow > 7 || toCol < 0 || toCol > 7) {
            return false;
        }

        char piece = grid[fromRow][fromCol];
        if (piece == '.') return false;

        grid[toRow][toCol] = piece;
        grid[fromRow][fromCol] = '.';

        System.out.println(getPieceName(piece) + " moved from " + from + " to " + to + ".");
        return true;
    }

    private String getPieceName(char piece) {
        switch (Character.toLowerCase(piece)) {
            case 'p': return "Pawn";
            case 'r': return "Rook";
            case 'n': return "Knight";
            case 'b': return "Bishop";
            case 'q': return "Queen";
            case 'k': return "King";
            default: return "Piece";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        boolean whiteTurn = true;

        System.out.println("=== Chess Game (Console Version) ===");
        System.out.println("Initial Board Setup:");
        board.display();

        while (true) {
            System.out.println("\n" + (whiteTurn ? "White's" : "Black's") + " turn.");
            System.out.print("Enter move (e.g., e2 e4) or 'exit': ");
            
            String from = sc.next();
            if (from.equalsIgnoreCase("exit")) break;

            String to = sc.next();
            System.out.println();
            
            boolean moved = board.movePiece(from, to, whiteTurn);
            System.out.println();
            board.display();

            if (moved) whiteTurn = !whiteTurn;
        }

        sc.close();
    }
}
