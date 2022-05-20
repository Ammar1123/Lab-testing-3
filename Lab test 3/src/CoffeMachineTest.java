import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoffeMachineTest {
    @Test
    public void test1() {
        CoffeMachine c = new CoffeMachine();
        assertEquals("Please turn on the machine", c.IncrementMoney(90));
    }
    @Test
    public void test2() {
        CoffeMachine c = new CoffeMachine();
        assertEquals("Power on and Lights on", c.openMachine());
    }
    @Test
    public void test3() {
        CoffeMachine c = new CoffeMachine();
        c.power = true;
        assertEquals("Error!", c.openMachine());
    }
    @Test
    public void test4() {
        CoffeMachine c = new CoffeMachine();
        c.openMachine();
        c.closeMachine();
        assertEquals("Please turn on the machine", c.IncrementMoney(70));
    }
    @Test
    public void test5() {
        CoffeMachine c = new CoffeMachine();
        c.openMachine();
        assertEquals("money incremented Successfully", c.IncrementMoney(30));
    }
    @Test
    public void test6() {
        CoffeMachine c = new CoffeMachine();
        assertEquals("Power on and Lights on",c.openMachine());
        assertEquals("money incremented Successfully",c.IncrementMoney(30));
    }
    @Test
    public void test7(){
        CoffeMachine c = new CoffeMachine();
        assertEquals("Power on and Lights on",c.openMachine());
        assertEquals("money incremented Successfully",c.IncrementMoney(50));
        assertEquals("Lights off and Power off ",c.closeMachine());
    }
    @Test
    public void test8(){
        CoffeMachine c = new CoffeMachine();
        assertEquals("Please turn on the machine",c.makeCoffee(3));
    }
    @Test
    public void test9(){
        CoffeMachine c = new CoffeMachine();
        assertEquals("Power on and Lights on",c.openMachine());
        assertEquals("money incremented Successfully",c.IncrementMoney(30));
        assertEquals(2+ "Coffee done Successfully",c.makeCoffee(3));
    }
    @Test
    public void test10(){
        CoffeMachine c = new CoffeMachine();
        assertEquals("Power on and Lights on",c.openMachine());
        assertEquals("money incremented Successfully",c.IncrementMoney(30));
        assertEquals(2+ "Coffee done Successfully",c.makeCoffee(4));
    }
    @Test
    public void test11(){
        CoffeMachine c = new CoffeMachine();
        assertEquals("Power on and Lights on",c.openMachine());
        assertEquals("money incremented Successfully",c.IncrementMoney(30));
        assertEquals(1+ "Coffee done Successfully",c.makeCoffee(1));
    }
}
