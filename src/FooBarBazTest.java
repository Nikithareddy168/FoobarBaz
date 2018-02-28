import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class FooBarBazTest {
    @Test
    public void testFoo() throws IOException {
        FooBarBaz fbb = new FooBarBaz();
        assertEquals("Foo", fbb.replace(9));
    }

    @Test
    public void testBar() throws IOException {
        FooBarBaz fbb = new FooBarBaz();
        assertEquals("Bar", fbb.replace(20));
    }

    @Test
    public void testBaz() throws IOException {
        FooBarBaz fbb = new FooBarBaz();
        assertEquals("Baz", fbb.replace(14));
    }

    @Test
    public void testFooBar() throws IOException {
        FooBarBaz fbb = new FooBarBaz();
        assertEquals("FooBar", fbb.replace(15));
    }

    @Test
    public void testFooBarBaz() throws IOException {
        FooBarBaz fbb = new FooBarBaz();
        assertEquals("FooBarBaz", fbb.replace(105));
    }

    @Test
    public void testNotFooBarBaz() throws IOException {
        FooBarBaz fbb = new FooBarBaz();
        assertEquals("2", fbb.replace(2));
    }

    @Test
    public void testValidate() throws IOException {
        FooBarBaz fbb = new FooBarBaz();
        assertEquals("Enter Positive integer value", fbb.validate("-1"));
    }

}
