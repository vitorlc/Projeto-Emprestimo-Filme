package emprestimoFilme;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Vitor de Lima
 * @author Tiago Hermano
 */
public class Filme extends AbstractModel implements Serializable {
 
    
    
    private String nomeFilme;
    private String generoFilme;
    private String diretorFilme;
    private int duracaoFilme;
    private int anoLancamentoFilme;
    private boolean emprestado;
    
    //Construtor
    /**
     *
     * @param nomeFilme
     * @param generoFilme
     * @param diretorFilme
     * @param duracaoFilme
     * @param ano_lancamentoFilme
     */
    public Filme(String nomeFilme, String generoFilme, String diretorFilme, int duracaoFilme, int ano_lancamentoFilme) {
        this.nomeFilme = nomeFilme;
        this.generoFilme = generoFilme;
        this.diretorFilme = diretorFilme;
        this.duracaoFilme = duracaoFilme;
        this.anoLancamentoFilme = ano_lancamentoFilme;
    }
    public Filme (){
        
    }

    

    // Getters
    public boolean isEmprestado() {
        return emprestado;
    }

    public String getNome() {
        return nomeFilme;
    }

    public String getGenero() {
        return generoFilme;
    }

    public String getDiretor() {
        return diretorFilme;
    }

    public int getDuracao() {
        return duracaoFilme;
    }

    public int getAnoLancamento() {
        return anoLancamentoFilme;
    }
    
    //Setters
     public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
     
    public void setNome(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setGenero(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public void setDiretor(String diretorFilme) {
        this.diretorFilme = diretorFilme;
    }

    public void setDuracao(int duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public void setAnoLancamento(int anoLancamentoFilme) {
        this.anoLancamentoFilme = anoLancamentoFilme;
    }
   
    
    public static Filme obterFilme(int codigoFilme)
    {
        ArrayList<Filme> filmes = Locadora.obterFilmes();
        
        Filme filme = null;
        
        for(Filme f : filmes)
            if(f.getCodigo() == codigoFilme)
                filme = f;
        
        return filme;
    }
    
    
}
