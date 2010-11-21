/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package byjg.webservices.cep;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dayse
 */
public class CEPServiceTest {

    public CEPServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of obterVersao method, of class CEPService.
     */
    @Test
    public void testObterVersao() throws Exception {
        System.out.println("obterVersao");
        CEPService instance = new CEPService();
        String expResult = "3.5.1";
        String result = instance.obterVersao();
        assertEquals(expResult, result);

    }

    /**
     * Test of obterLogradouro method, of class CEPService.
     */
    @Test
    public void testObterLogradouro() throws Exception {
        System.out.println("obterLogradouro");
        String cep = "60165090";
        String usuario = "gribeiro";
        String senha = "dinho#10";
        CEPService instance = new CEPService();
        String expResult = "Avenida AntÃ´nio Justa , Meireles, Fortaleza, CE, 2304400";
        String result = instance.obterLogradouro(cep, usuario, senha);
        assertEquals(expResult, result);

    }

    /**
     * Test of obterCEP method, of class CEPService.
     */
    @Test
    public void testObterCEP() throws Exception {
        System.out.println("obterCEP");
        String logradouro = "";
        String localidade = "";
        String UF = "";
        String usuario = "";
        String senha = "";
        CEPService instance = new CEPService();
        String expResult = "";
        String result = instance.obterCEP(logradouro, localidade, UF, usuario, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}