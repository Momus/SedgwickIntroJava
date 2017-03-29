package org.momus;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest 
    extends TestCase
{

    /**
     * Rigourous Test :-)
     */
    public void testHelloWorld()
    {
        String[] Emy = {"Emy"};
        String[] FullName = { "Emily", "Bishton"};
        String[] Empty = {};

        assertEquals( "Emy!", "Hello, Emy!", HelloWorld.greeting(Emy));
        assertEquals( "Say hi to everyone", "Hello, World!", HelloWorld.greeting(Empty));
        assertEquals( "Ignore surnames" , "Hello, Emily!", HelloWorld.greeting(FullName));
    }
}
