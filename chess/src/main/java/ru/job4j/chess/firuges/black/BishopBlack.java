package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Arrays;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws IllegalStateException {
        if(!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not way by diagonal from %s to %s", source, dest));
        }
        Cell[] cells = new Cell[8];
        if(source.x < dest.x || source.y < dest.y) {

        }
        return System.arraycopy(cells, 0, new Cell[i], i);
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        boolean rsl = false;
        if(source.x - dest.x == source.y - dest.y || source.x - dest.x == -(source.y - dest.y)) {
            rsl = true;
        }
        return rsl;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
