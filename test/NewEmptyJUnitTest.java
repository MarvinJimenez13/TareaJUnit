/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import tareajunit.descuentos.Caja;


/**
 *
 * @author Marvin
 */
public class NewEmptyJUnitTest {
    
    @Test
    public void testCaja() {
    
        Caja caja = new Caja("Camisa casual de manga larga", 6);
        assertEquals(caja.calularPrecio(), 1269.6);
        
    }
    
}
