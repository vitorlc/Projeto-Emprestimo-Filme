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
 * @author tiago
 */
public class FilmeTest {
    String nomeFilme = "Titanic";
    String generoFilme = "Drama";
    String diretorFilme = "James Cameron";
    int duracao = 194;
    int anoLancamento = 1998;
    
// Instanciação de Filme Teste
    Filme filmeTeste = new Filme(nomeFilme, generoFilme, diretorFilme, duracao, anoLancamento);
    
    public FilmeTest() {
    }

    @Test
    public void testIsEmprestado() {
        filmeTeste.setEmprestado(true);
        assertEquals(true, filmeTeste.isEmprestado());
    }

    @Test
    public void testSetEmprestado() {
        
    }

    @Test
    public void testGetNome() {
        assertEquals(nomeFilme, filmeTeste.getNome());
    }

    @Test
    public void testGetGenero() {
        assertEquals(generoFilme, filmeTeste.getGenero());
    }

    @Test
    public void testGetDiretor() {
        assertEquals(diretorFilme, filmeTeste.getDiretor());
    }

    @Test
    public void testGetDuracao() {
        assertEquals(duracao, filmeTeste.getDuracao());
    }

    @Test
    public void testGetAnoLancamento() {
        assertEquals(anoLancamento, filmeTeste.getAnoLancamento());
    }

    @Test
    public void testSetNome() {
        filmeTeste.setNome("Os Bons Companheiros");
        assertEquals("Os Bons Companheiros", filmeTeste.getNome());
    }

    @Test
    public void testSetGenero() {
        filmeTeste.setGenero("Drama");
        assertEquals("Drama", filmeTeste.getGenero());
    }

    @Test
    public void testSetDiretor() {
        filmeTeste.setDiretor("Martin Scorcese");
        assertEquals("Martin Scorcese", filmeTeste.getDiretor());
    }

    @Test
    public void testSetDuracao() {
        filmeTeste.setDuracao(146);
        assertEquals(146, filmeTeste.getDuracao());
    }

    @Test
    public void testSetAnoLancamento() {
        filmeTeste.setAnoLancamento(1990);
        assertEquals(1990, filmeTeste.getAnoLancamento());
    }

    @Test
    public void testObterFilme() {
        
    }
    
}
