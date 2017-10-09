package emprestimoFilme;

/**
 *
 * @author Vitor de Lima
 * @autor Tiago Hermano
 */
class Emprestimo extends AbstractModel  {
    
    
    private Filme filme;
    private Cliente cliente;
    
     /**
     * metodo construtor
     *  @param codigoFilme
     *  @param codigoCliente
     *
     */
    public Emprestimo(int codigoFilme, int codigoCliente)
    {
        filme = Filme.obterFilme(codigoFilme);
        filme.setEmprestado(true);
        cliente = Cliente.obterCliente(codigoCliente);
    }

    Emprestimo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Gets e Sets
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
