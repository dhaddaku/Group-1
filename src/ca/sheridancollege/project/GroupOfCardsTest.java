/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JASKARAN
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of distributeCards method, of class GroupOfCards.
     */
    @Test
    public void testDistributeCards() {
        System.out.println("distributeCards");
        GroupOfCards instance = new GroupOfCards(2);
        instance.distributeCards();
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of cardsInPlay method, of class GroupOfCards.
     */
    @Test
    public void testCardsInPlaygood() {
        System.out.println("cardsInPlay");
        GroupOfCards instance = new GroupOfCards();
        CardUno[] expResult = null;
        CardUno[] result = instance.cardsInPlay();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
    public void testCardsInPlaybad() {
        System.out.println("cardsInPlay");
        GroupOfCards instance = new GroupOfCards(2);
        CardUno[] expResult = null;
        CardUno[] result = instance.cardsInPlay();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
    public void testCardsInPlaybound() {
        System.out.println("cardsInPlay");
        GroupOfCards instance = new GroupOfCards(10);
        CardUno[] expResult = null;
        CardUno[] result = instance.cardsInPlay();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSizegood() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards(0);
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
     @Test
    public void testGetSizebound() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards(2);
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    @Test
    public void testGetSizebad() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards(8);
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    
}
