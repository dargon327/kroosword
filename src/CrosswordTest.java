import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrosswordTest {

    private Crossword crossword;
    private boolean[][] blackSquares;

    @BeforeEach
    void setUp() {

        blackSquares = new boolean[][]{
                {true, false, false, true, true, true, false, false, false},
                {false, false, false, false, true, false, false, false, false},
                {false, false, false, false, false, false, true, true, true},
                {false, false, true, false, false, false, true, false, false},
                {true, true, true, false, false, false, false, false, false},
                {false, false, false, false, true, false, false, false, false},
                {false, false, false, true, true, true, false, false, true}
        };

        crossword = new Crossword(blackSquares);

        for (int i = 0; i < crossword.getPuzzle().length; i++) {
            for (int j = 0; j < crossword.getPuzzle()[0].length; j++) {

                System.out.print(crossword.getPuzzle()[i][j].getNum() + " ");
            }
            System.out.println();
        }
    }

    @AfterEach
    void tearDown() {

        blackSquares = null;

    }

    @Test
    void testToBeLabeled() {

        // Row 0
        assertTrue(crossword.getPuzzle()[0][0].isBlack());
        assertEquals(0, crossword.getPuzzle()[0][0].getNum());

        assertFalse(crossword.getPuzzle()[0][1].isBlack());
        assertEquals(1, crossword.getPuzzle()[0][1].getNum());

        assertFalse(crossword.getPuzzle()[0][2].isBlack());
        assertEquals(2, crossword.getPuzzle()[0][2].getNum());

        assertTrue(crossword.getPuzzle()[0][3].isBlack());
        assertEquals(0, crossword.getPuzzle()[0][3].getNum());

        assertTrue(crossword.getPuzzle()[0][4].isBlack());
        assertEquals(0, crossword.getPuzzle()[0][4].getNum());

        assertTrue(crossword.getPuzzle()[0][5].isBlack());
        assertEquals(0, crossword.getPuzzle()[0][5].getNum());

        assertFalse(crossword.getPuzzle()[0][6].isBlack());
        assertEquals(3, crossword.getPuzzle()[0][6].getNum());

        assertFalse(crossword.getPuzzle()[0][7].isBlack());
        assertEquals(4, crossword.getPuzzle()[0][7].getNum());

        assertFalse(crossword.getPuzzle()[0][8].isBlack());
        assertEquals(5, crossword.getPuzzle()[0][8].getNum());

        // Row 1
        assertFalse(crossword.getPuzzle()[1][0].isBlack());
        assertEquals(6, crossword.getPuzzle()[1][0].getNum());

        assertFalse(crossword.getPuzzle()[1][1].isBlack());
        assertEquals(0, crossword.getPuzzle()[1][1].getNum());

        assertFalse(crossword.getPuzzle()[1][2].isBlack());
        assertEquals(0, crossword.getPuzzle()[1][2].getNum());

        assertFalse(crossword.getPuzzle()[1][3].isBlack());
        assertEquals(7, crossword.getPuzzle()[1][3].getNum());

        assertTrue(crossword.getPuzzle()[1][4].isBlack());
        assertEquals(0, crossword.getPuzzle()[1][4].getNum());

        assertFalse(crossword.getPuzzle()[1][5].isBlack());
        assertEquals(8, crossword.getPuzzle()[1][5].getNum());

        assertFalse(crossword.getPuzzle()[1][6].isBlack());
        assertEquals(0, crossword.getPuzzle()[1][6].getNum());

        assertFalse(crossword.getPuzzle()[1][7].isBlack());
        assertEquals(0, crossword.getPuzzle()[1][7].getNum());

        assertFalse(crossword.getPuzzle()[1][8].isBlack());
        assertEquals(0, crossword.getPuzzle()[1][8].getNum());

        // Row 2
        assertFalse(crossword.getPuzzle()[2][0].isBlack());
        assertEquals(9, crossword.getPuzzle()[2][0].getNum());

        assertFalse(crossword.getPuzzle()[2][1].isBlack());
        assertEquals(0, crossword.getPuzzle()[2][1].getNum());

        assertFalse(crossword.getPuzzle()[2][2].isBlack());
        assertEquals(0, crossword.getPuzzle()[2][2].getNum());

        assertFalse(crossword.getPuzzle()[2][3].isBlack());
        assertEquals(0, crossword.getPuzzle()[2][3].getNum());

        assertFalse(crossword.getPuzzle()[2][4].isBlack());
        assertEquals(10, crossword.getPuzzle()[2][4].getNum());

        assertFalse(crossword.getPuzzle()[2][5].isBlack());
        assertEquals(0, crossword.getPuzzle()[2][5].getNum());

        assertTrue(crossword.getPuzzle()[2][6].isBlack());
        assertEquals(0, crossword.getPuzzle()[2][6].getNum());

        assertTrue(crossword.getPuzzle()[2][7].isBlack());
        assertEquals(0, crossword.getPuzzle()[2][7].getNum());

        assertTrue(crossword.getPuzzle()[2][8].isBlack());
        assertEquals(0, crossword.getPuzzle()[2][8].getNum());

        // Row 3
        assertFalse(crossword.getPuzzle()[3][0].isBlack());
        assertEquals(11, crossword.getPuzzle()[3][0].getNum());

        assertFalse(crossword.getPuzzle()[3][1].isBlack());
        assertEquals(0, crossword.getPuzzle()[3][1].getNum());

        assertTrue(crossword.getPuzzle()[3][2].isBlack());
        assertEquals(0, crossword.getPuzzle()[3][2].getNum());

        assertFalse(crossword.getPuzzle()[3][3].isBlack());
        assertEquals(12, crossword.getPuzzle()[3][3].getNum());

        assertFalse(crossword.getPuzzle()[3][4].isBlack());
        assertEquals(0, crossword.getPuzzle()[3][4].getNum());

        assertFalse(crossword.getPuzzle()[3][5].isBlack());
        assertEquals(0, crossword.getPuzzle()[3][5].getNum());

        assertTrue(crossword.getPuzzle()[3][6].isBlack());
        assertEquals(0, crossword.getPuzzle()[3][6].getNum());

        assertFalse(crossword.getPuzzle()[3][7].isBlack());
        assertEquals(13, crossword.getPuzzle()[3][7].getNum());

        assertFalse(crossword.getPuzzle()[3][8].isBlack());
        assertEquals(14, crossword.getPuzzle()[3][8].getNum());

        // Row 4
        assertTrue(crossword.getPuzzle()[4][0].isBlack());
        assertEquals(0, crossword.getPuzzle()[4][0].getNum());

        assertTrue(crossword.getPuzzle()[4][1].isBlack());
        assertEquals(0, crossword.getPuzzle()[4][1].getNum());

        assertTrue(crossword.getPuzzle()[4][2].isBlack());
        assertEquals(0, crossword.getPuzzle()[4][2].getNum());

        assertFalse(crossword.getPuzzle()[4][3].isBlack());
        assertEquals(15, crossword.getPuzzle()[4][3].getNum());

        assertFalse(crossword.getPuzzle()[4][4].isBlack());
        assertEquals(0, crossword.getPuzzle()[4][4].getNum());

        assertFalse(crossword.getPuzzle()[4][5].isBlack());
        assertEquals(0, crossword.getPuzzle()[4][5].getNum());

        assertFalse(crossword.getPuzzle()[4][6].isBlack());
        assertEquals(16, crossword.getPuzzle()[4][6].getNum());

        assertFalse(crossword.getPuzzle()[4][7].isBlack());
        assertEquals(0, crossword.getPuzzle()[4][7].getNum());

        assertFalse(crossword.getPuzzle()[4][8].isBlack());
        assertEquals(0, crossword.getPuzzle()[4][8].getNum());

        // Row 5
        assertFalse(crossword.getPuzzle()[5][0].isBlack());
        assertEquals(17, crossword.getPuzzle()[5][0].getNum());

        assertFalse(crossword.getPuzzle()[5][1].isBlack());
        assertEquals(18, crossword.getPuzzle()[5][1].getNum());

        assertFalse(crossword.getPuzzle()[5][2].isBlack());
        assertEquals(19, crossword.getPuzzle()[5][2].getNum());

        assertFalse(crossword.getPuzzle()[5][3].isBlack());
        assertEquals(0, crossword.getPuzzle()[5][3].getNum());

        assertTrue(crossword.getPuzzle()[5][4].isBlack());
        assertEquals(0, crossword.getPuzzle()[5][4].getNum());

        assertFalse(crossword.getPuzzle()[5][5].isBlack());
        assertEquals(20, crossword.getPuzzle()[5][5].getNum());

        assertFalse(crossword.getPuzzle()[5][6].isBlack());
        assertEquals(0, crossword.getPuzzle()[5][6].getNum());

        assertFalse(crossword.getPuzzle()[5][7].isBlack());
        assertEquals(0, crossword.getPuzzle()[5][7].getNum());

        assertFalse(crossword.getPuzzle()[5][8].isBlack());
        assertEquals(0, crossword.getPuzzle()[5][8].getNum());

        // Row 6
        assertFalse(crossword.getPuzzle()[6][0].isBlack());
        assertEquals(21, crossword.getPuzzle()[6][0].getNum());

        assertFalse(crossword.getPuzzle()[6][1].isBlack());
        assertEquals(0, crossword.getPuzzle()[6][1].getNum());

        assertFalse(crossword.getPuzzle()[6][2].isBlack());
        assertEquals(0, crossword.getPuzzle()[6][2].getNum());

        assertTrue(crossword.getPuzzle()[6][3].isBlack());
        assertEquals(0, crossword.getPuzzle()[6][3].getNum());

        assertTrue(crossword.getPuzzle()[6][4].isBlack());
        assertEquals(0, crossword.getPuzzle()[6][4].getNum());

        assertTrue(crossword.getPuzzle()[6][5].isBlack());
        assertEquals(0, crossword.getPuzzle()[6][5].getNum());

        assertFalse(crossword.getPuzzle()[6][6].isBlack());
        assertEquals(22, crossword.getPuzzle()[6][6].getNum());

        assertFalse(crossword.getPuzzle()[6][7].isBlack());
        assertEquals(0, crossword.getPuzzle()[6][7].getNum());

        assertTrue(crossword.getPuzzle()[6][8].isBlack());
        assertEquals(0, crossword.getPuzzle()[6][8].getNum());
    }
}