/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimoFilme;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tiago Hermano
 * @author Vitor de Lima
 */
public class ClienteTest {
    Cliente clienteTeste = new Cliente("Ronaldo Nazário", "Rua Bento Ribeiro", "6235628974", "70253962487", "ronaldonazario@cbf.com.br");
    public ClienteTest() {
    }

    @Test
    public void testSetNome() {
        clienteTeste.setNome("Robinho");
        assertEquals("Robinho", clienteTeste.getNome());
    }

    @Test
    public void testGetNome() {
        assertEquals("Ronaldo Nazário", clienteTeste.getNome());
    }

    @Test
    public void testSetEndereco() {
        clienteTeste.setEndereco("Santos");
        assertEquals("Santos", clienteTeste.getEndereco());
    }

    @Test
    public void testGetEndereco() {
        assertEquals("Rua Bento Ribeiro", clienteTeste.getEndereco());
    }

    @Test
    public void testSetTelefone() {
        clienteTeste.setTelefone("123456789");
        assertEquals("123456789", clienteTeste.getTelefone());
    }

    @Test
    public void testGetTelefone() {
        assertEquals("6235628974", clienteTeste.getTelefone());
    }

    @Test
    public void testSetCpf() {
        clienteTeste.setCpf("78598213566");
        assertEquals("78598213566", clienteTeste.getCpf());
    }

    @Test
    public void testGetCpf() {
        assertEquals("70253962487", clienteTeste.getCpf());
    }

    @Test
    public void testSetEmail() {
        clienteTeste.setEmail("robinho@santosfc.com.br");
        assertEquals("robinho@santosfc.com.br", clienteTeste.getEmail());
    }

    @Test
    public void testGetEmail() {
        assertEquals("ronaldonazario@cbf.com.br", clienteTeste.getEmail());
    }

    @Test
    public void testObterCliente() {
    }

    @Test
    public void testToString() {
        
    }
    
}
