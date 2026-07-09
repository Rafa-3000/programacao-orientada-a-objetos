package avaliacao.formula1;

public class Carro{

    private int numero;
    private int posicao;
    private Equipe equipe;
    private Piloto piloto_carro;

    public Carro(int numero, int posicao, Equipe equipe, Piloto piloto_carro){
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto_carro = piloto_carro;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getPosicao(){
        return posicao;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public Equipe getEquipe(){
        return equipe;
    }

    public void setEquipe(Equipe equipe){
        this.equipe = equipe;
    }

    public Piloto getPiloto_carro(){
        return piloto_carro;
    }

    public void setPiloto_carro(Piloto piloto_carro){
        this.piloto_carro = piloto_carro;
    }
}


