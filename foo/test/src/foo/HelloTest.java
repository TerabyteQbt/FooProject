package foo;

import org.junit.Assert;
import org.junit.Test;

import foo.Constants;

public class HelloTest {

    @Test
    public void testDEVS() throws Exception {
        Assert.assertTrue(Constants.DEVS.size() == 2);
        Assert.assertTrue(Constants.DEVS.contains("amling"));
        Assert.assertTrue(Constants.DEVS.contains("cmyers"));
    }
}


