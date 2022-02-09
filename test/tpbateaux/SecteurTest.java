/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpbateaux;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class SecteurTest {
    
    public SecteurTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of AjouterLiaison method, of class Secteur.
     */
    @Test
    public void testAjouterLiaison() {
        System.out.println("AjouterLiaison");
        Liaison l = null;
        Secteur instance = null;
        instance.AjouterLiaison(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LiaisonsPortDepart method, of class Secteur.
     */
    @Test
    public void testLiaisonsPortDepart() {
        System.out.println("LiaisonsPortDepart");
        Port PortDepart = null;
        Secteur instance = null;
        ArrayList<Liaison> expResult = null;
        ArrayList<Liaison> result = instance.LiaisonsPortDepart(PortDepart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LiaisonsPortDepartDate method, of class Secteur.
     */
    @Test
    public void testLiaisonsPortDepartDate() {
        System.out.println("LiaisonsPortDepartDate");
        Port PortDepart = null;
        String dte = "";
        Secteur instance = null;
        ArrayList<Liaison> expResult = null;
        ArrayList<Liaison> result = instance.LiaisonsPortDepartDate(PortDepart, dte);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HeureLiaison method, of class Secteur.
     */
    @Test
    public void testHeureLiaison() {
        System.out.println("HeureLiaison");
        Liaison L = null;
        Secteur instance = null;
        String expResult = "";
        String result = instance.HeureLiaison(L);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Secteur.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Secteur instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Secteur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Secteur instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLesLiaisons method, of class Secteur.
     */
    @Test
    public void testGetLesLiaisons() {
        System.out.println("getLesLiaisons");
        Secteur instance = null;
        ArrayList<Liaison> expResult = null;
        ArrayList<Liaison> result = instance.getLesLiaisons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
