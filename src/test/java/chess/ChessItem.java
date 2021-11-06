package chess;

import lombok.Getter;

public abstract class ChessItem {
    @Getter
    int x,y;
    int value;
    public abstract void draw();

}
