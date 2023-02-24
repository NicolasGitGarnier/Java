public class ChestGame {

}
class Player {
    String name;
    int color;
    public Player(String name, int color) {
        this.name = name;
        this.color = color;
    }
}
class Position {
    char column;
    int row;
    public Position(char colum, int row) {
        this.column = colum;
        this.row = row;
    }
    public String toString() {
        return "" + column + row;
    }
}
class Piece {
    Position position;
    int color;
    public Piece(Position position,int color) {
        this.position = position;
        this.color = color;
    }
}
class Cell {
    private final Position position;
    private boolean isEmpty;
    private final Piece piece;
    public Cell(Position position, Piece piece) {
        this.position = position;
        this.piece = piece;
        this.isEmpty = false;
    }
    public Position getPosition() {
        return position;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    public Piece getPiece() {
        return piece;
}
}

class King {
    public boolean isValidMove(Position newPosition , Cell[][] board) {
        return false;
    }
    public String toString(){
        return"K";
    }
}
class Queen {
    public boolean isValidMove(Position newPosition , Cell[][] board) {
        return false;
    }
    public String toString(){
        return"Q";
    }
}
class Tower {
    public boolean isValidMove(Position newPosition , Cell[][] board) {
        return false;
    }
    public String toString(){
        return"T";
    }
}
/* class King {
    Position pos;
    int color;
// manque la vérification : si c'est dans l'échiquier.
    public boolean isValidMove(Position newpos, Cell[][] board) {
        int dist_pos_column = (pos.column - newpos.column);
        int dist_pos_row = (pos.row - newpos.row);
        if (dist_pos_column <= 1 && dist_pos_row <= 1){
            return true;
        }
        if (board[pos.row][pos.column] == null || board[newpos.row][newpos.column].color != color){
            return true;
        }
        return false;
    }
    public String toString(){
        return "K";
    }
} */

