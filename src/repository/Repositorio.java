package repository;
import model.Produto;
import java.util.ArrayList;
import java.util.List;



public class Repositorio {
    
    ArrayList<Produto> lista =new ArrayList<>();

    public void adicionar(Produto e){
        lista.add(e);

    }
    public boolean remover(int indice){
        if (indice<0 || indice>lista.size() ) {
            return false;
        }else{
            lista.remove(indice);
            return false;
        }
    }
}
