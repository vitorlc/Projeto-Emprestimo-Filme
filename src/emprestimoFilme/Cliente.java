package emprestimoFilme;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Vitor de Lima
 * @author Tiago Hermano
 */

// Classe Cliente
public class Cliente extends AbstractModel implements Serializable {

    //atributos
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String email;

    /**
     * metodo construtor
     *
     * @param nome
     * @param endereco
     * @param email
     * @param cpf
     * @param telefone
     */
    public Cliente(String nome, String endereco, String telefone, String cpf, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    /**
     * metodo construtor
     *
     * @param nome
     */
    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public Cliente() {

    }

    // gets e sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public static Cliente obterCliente(int codigoCliente) {
        ArrayList<Cliente> clientes = Locadora.obterClientes();

        Cliente cliente = null;

        for (Cliente c : clientes) {
            if (c.getCodigo() == codigoCliente) {
                cliente = c;
            }
        }

        return cliente;
    }

    String toString(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class Integer {

        public Integer() {
            
           
            
        }
    }

}
