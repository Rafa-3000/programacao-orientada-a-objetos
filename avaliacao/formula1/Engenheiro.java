package avaliacao.formula1;

public class Engenheiro extends Pessoa{

    private Piloto piloto_engenheiro;

    public Engenheiro(String nome, int idade, String nacionalidade, Piloto  piloto_engenheiro){
        super(nome, idade, nacionalidade);
        this.piloto_engenheiro = piloto_engenheiro;
    }

    public Piloto getPiloto_engenheiro(){
        return piloto_engenheiro;
    }

    public void setPiloto_engenheiro(Piloto piloto_engenheiro){
        this.piloto_engenheiro = piloto_engenheiro;
    }
}
