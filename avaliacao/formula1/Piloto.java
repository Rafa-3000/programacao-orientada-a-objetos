package avaliacao.formula1;

public class Piloto extends Pessoa{

    private int num_vitorias;

    public Piloto(String nome, int idade, String nacionalidade, int num_vitorias){
        super(nome, idade, nacionalidade);
        this.num_vitorias = num_vitorias;
    }
    public int getNum_vitorias(){
        return num_vitorias;
    }

    public void setNum_vitorias(int num_vitorias){
        this.num_vitorias = num_vitorias;
    }

}
