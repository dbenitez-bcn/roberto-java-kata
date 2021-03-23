import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FigureComparatorTest {
    FigureComparator sut = new FigureComparator();

    @Test
    void whenBothFigureAreTheSame_shouldReturnZero() {
        Square square = new Square(2);

        int got = sut.comparePerimeter(square, square);

        assertEquals(got, 0);
    }

    @Test
    void whenFirstFigureIsTheBiggest_shouldReturnOne() {
        Square squareA = new Square(2);
        Square squareB = new Square(1);

        int got = sut.comparePerimeter(squareA, squareB);

        assertEquals(got, 1);
    }

    @Test
    void whenSecondFigureIsTheBiggest_shouldReturnMinusOne() {
        Square squareA = new Square(1);
        Square squareB = new Square(2);

        int got = sut.comparePerimeter(squareA, squareB);

        assertEquals(got, -1);
    }
}