/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo Rodriguez
 */
public class MapTest {
    
    public MapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCabeza method, of class Map.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        Map instance = new Map();
        Key expResult = null;
        Key result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class Map.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Map instance = new Map();
        instance.setCabeza(null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimo method, of class Map.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        Map instance = new Map();
        Key expResult = null;
        Key result = instance.getUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUltimo method, of class Map.
     */
    @Test
    public void testSetUltimo() {
        System.out.println("setUltimo");
        Map instance = new Map();
        instance.setUltimo(null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Size method, of class Map.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        Map instance = new Map();
        int expResult = 0;
        int result = instance.Size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class Map.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        Map instance = new Map();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Map.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Map instance = new Map();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class Map.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        int key = 1;
        String dato = "1";
        Map instance = new Map();
        boolean expResult = true;
        boolean result = instance.put(key, dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Map.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int key = 1;
        Map instance = new Map();
        Key expResult = null;
        Key result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Map.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Map instance = new Map();
        boolean expResult = true;
        boolean result = instance.clear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Map.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int key = 1;
        Map instance = new Map();
        boolean expResult = false;
        boolean result = instance.remove(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of containsKey method, of class Map.
     */
    @Test
    public void testContainsKey() {
        System.out.println("containsKey");
        int key = 1;
        Map instance = new Map();
        boolean expResult = false;
        boolean result = instance.containsKey(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of containsValue method, of class Map.
     */
    @Test
    public void testContainsValue() {
        System.out.println("containsValue");
        String dato = "1";
        Map instance = new Map();
        boolean expResult = false;
        boolean result = instance.containsValue(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Map.
     */
    @Test
    public void testToString() {
        System.out.println("values");
        Map instance = new Map();
        
        
        
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of valuesCola method, of class Map.
     */
    @Test
    public void testValuesCola() {
        System.out.println("valuesCola");
        Map instance = new Map();
        Cola expResult = null;
        Cola result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of valuesPila method, of class Map.
     */
    @Test
    public void testValuesPila() {
        System.out.println("valuesPila");
        Map instance = new Map();
        Pila expResult = null;
        Pila result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
 
    
}
