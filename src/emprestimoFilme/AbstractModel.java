package emprestimoFilme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Vitor de Lima
 * @author Tiago Hermano
 */
public abstract class AbstractModel implements Serializable {
    
    private int codigo;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public ArrayList<AbstractModel> obterElementos()
    {
        ArrayList<AbstractModel> elementos = new ArrayList<AbstractModel>();
        
        try
        {
            FileInputStream fis = new FileInputStream(this.getClass().getName() + ".data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            elementos = (ArrayList<AbstractModel>) ois.readObject();
        
            ois.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return elementos;
    }
    
    /**Salva os dados em arquivo
    */
    public void salvar()
    {
        ArrayList<AbstractModel> elementos = obterElementos();
        
        elementos.add(this);
        
        try
        {
            FileOutputStream fout = new FileOutputStream(this.getClass().getName() + ".data");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(elementos);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
    public void excluir(int codigo)
    {
        ArrayList<AbstractModel> elementos = obterElementos();
        
        int posicao;
        
        for(int i = 0; i < elementos.size(); i++)
        {
            if(elementos.get(i).getCodigo() == codigo)
                elementos.remove(i);
        }
        
        try
        {
            FileOutputStream fout = new FileOutputStream(this.getClass().getName() + ".data");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(elementos);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
