import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class FooBarBazTest {

    @Test
    public void testReplace() throws IOException {
        FooBarBaz fbb = new FooBarBaz();
        
        assertEquals("FooBar",fbb.replace(15));
        
       // fail("Not yet implemented");
    }

}
