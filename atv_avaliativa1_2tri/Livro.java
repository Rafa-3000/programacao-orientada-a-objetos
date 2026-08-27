package atv_avaliativa1_2tri;

public class Livro extends Publicacao {

    private boolean disponivel;

    public Livro(String titulo){
        super(titulo);
        disponivel=true;
    }

    public void emprestar(){
        disponivel=false;
    }

    public void devolver(){
        disponivel=true;
    }
    
    public boolean isDisponivel(){
        return disponivel;
    }

    
}
