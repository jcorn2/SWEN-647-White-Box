/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floormeasuringtool;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author james
 */
public class ShapeAreasTest {
    
    public ShapeAreasTest() {
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

    
    @Test
    public void oneParameterTypeC() {
        ShapeAreas sa = new ShapeAreas();
        double expectedResult = 314.159265;
        
        double result = sa.oneParameter("C", (float) 10.0);
        
        assertEquals(result, expectedResult, 0.000001);
    }
    
    @Test
    public void oneParameterTypeS() {
        ShapeAreas sa = new ShapeAreas();
        double expectedResult = 90.25;
        
        double result = sa.oneParameter("S", (float) 9.5);
        
        assertEquals(result, expectedResult, 0.000001);
    }
    
    @Test
    public void oneParameterTypeAny() {
        ShapeAreas sa = new ShapeAreas();
        double expectedResult = -1.0;
        
        double result = sa.oneParameter("A", (float) 10.0);
        
        assertEquals(result, expectedResult, 0.000001);
    }
    
    @Test
    public void twoParameterRectangle() {
        ShapeAreas sa = new ShapeAreas();
        double expectedResult = 55.0;
        
        double result = sa.twoParameter("R", (float) 10.0, (float) 5.5);
        
        assertEquals(result, expectedResult, 0.000001);
    }
    
    @Test
    public void twoParameterTriangle() {
        ShapeAreas sa = new ShapeAreas();
        double expectedResult = 27.5;
        
        double result = sa.twoParameter("T", (float) 10.0, (float) 5.5);
        
        assertEquals(result, expectedResult, 0.000001);
    }
    
    @Test
    public void twoParameterAny() {
        ShapeAreas sa = new ShapeAreas();
        double expectedResult = -1.0;
        
        double result = sa.twoParameter("A", (float) 10.0, (float) 5.5);
        
        assertEquals(result, expectedResult, 0.000001);
    }
    
}
