package avaliacao.formula1;

import java.util.ArrayList;

public class Equipe{

    private String nome_equipe;
    private int ano_fundacao;
    private ArrayList<Patrocinador> patrocinadores;

    public Equipe(String nome_equipe, int ano_fundacao, ArrayList<Patrocinador> patrocinadores){
        this.nome_equipe = nome_equipe;
        this.ano_fundacao = ano_fundacao;
        this.patrocinadores = patrocinadores;
    }

    public String getNome_equipe(){
        return nome_equipe;
    }

    public void setNome_equipe(String nome_equipe){
        this.nome_equipe = nome_equipe;
    }

    public int getAno_fundacao(){
        return ano_fundacao;
    }

    public void setAno_fundacao(int ano_fundacao){
        this.ano_fundacao = ano_fundacao;
    }

    public ArrayList<Patrocinador> getPatrocinadores(){
        return patrocinadores;
    }

    public void setPatrocinadores(ArrayList<Patrocinador> patrocinadores){
        this.patrocinadores = patrocinadores;
    }
}
