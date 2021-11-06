package chess;

import lombok.Getter;

public class King extends ChessItem{
    @Override
    public void draw()
    {
        System.out.println("draw King");
    }
}
