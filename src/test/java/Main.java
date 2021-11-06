import chess.ChessItem;
import chess.King;
import chess.Quin;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayList<ChessItem> chessItems = new ArrayList<>();

        chessItems.add(new Quin());
        chessItems.add(new King());
        chessItems.add(new Quin());



        for(ChessItem item:chessItems){
            item.draw();
        }
    }
}
