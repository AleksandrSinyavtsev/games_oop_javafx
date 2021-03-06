package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void blackBishopPositionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertEquals(bishopBlack.position(), (Cell.C8));
    }

    @Test
    public void blackBishopCopyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertEquals(bishopBlack.copy(Cell.A6).position(), (Cell.A6) );
    }

    @Test
    public void blackBishopWayTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertEquals(bishopBlack.way(Cell.C1, Cell.G5), new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5});
    }
}