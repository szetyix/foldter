// Teszteljen normál értétekre.
// Teszteljen szélső értétekre.
// Teszteljen hibás értétekre.

public class test {
    public void testNormal() {
        double actual = Calculate.terfogatSzamitas(5.0, 3.0);
        double expected = 188.49555921538757;
        assertEquals(expected, actual, 0.0001);
    }

    public void testEdge() {
        double actual = Calculate.terfogatSzamitas(0.0, 3.0);
        double expected = 0.0;
        assertEquals(expected, actual, 0.0001);
    }

    public void testInvalid() {
        double actual = Calculate.terfogatSzamitas(-5.0, 3.0);
        double expected = 0.0;
        assertEquals(expected, actual, 0.0001);
    }
}