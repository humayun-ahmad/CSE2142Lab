package Calculator;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void add() {
        Main m = new Main();
        assertEquals(2,m.add(1,1));
    }
    void mul(){
        Main s = new Main();
        assertEquals(20,s.mul(4,5));
    }
}