package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    @Test
    public void testAdd(){
        MyClass myClass = new MyClass();
        assertEquals(3, myClass.add(1,2));
        assertEquals(0, myClass.add(-1,1));
        assertEquals(0, myClass.add(0,0));
    }

    @Test
    public void testSub(){
        MyClass myClass = new MyClass();
        assertEquals(2, myClass.sub(4,2));
        assertEquals(-4, myClass.sub(-1,3));
        assertEquals(3, myClass.sub(6,3));
    }
}
