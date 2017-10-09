package emprestimoFilme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Vitor de Lima
 * @author Tiago Hermano
 */

//Classe Locadora
public class Locadora {  
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Filme> filmes;
    private ArrayList<Emprestimo> emprestimos;
    
    public Locadora()
    {
        clientes = new ArrayList<Cliente>();
        filmes = new ArrayList<Filme>();
        emprestimos = new ArrayList<Emprestimo>();
    }
    
    public static ArrayList<Cliente> obterClientes()
    {
        ArrayList<AbstractModel> elementos = new Cliente().obterElementos();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        for(AbstractModel model : elementos)
            clientes.add((Cliente)model);
        
        return clientes;
    }
    
    public static ArrayList<Filme> obterFilmes()
    {
        ArrayList<AbstractModel> elementos = new Filme().obterElementos();
        ArrayList<Filme> filmes = new ArrayList<Filme>();
        
        for(AbstractModel model : elementos)
            filmes.add((Filme)model);
        
        return filmes;
    }
    
    public static ArrayList<Emprestimo> obterEmprestimos()
    {
        ArrayList<AbstractModel> elementos = new Emprestimo().obterElementos();
        ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
        
        for(AbstractModel model : elementos)
            emprestimos.add((Emprestimo)model);
        
        return emprestimos;
    }
  
}
        
        
        
       
	
        
        
      
