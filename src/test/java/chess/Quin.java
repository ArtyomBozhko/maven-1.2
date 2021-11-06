package chess;

import lombok.Getter;

public class Quin extends ChessItem {
    @Override
    public void draw() {
        System.out.println("draw King");
    }
}