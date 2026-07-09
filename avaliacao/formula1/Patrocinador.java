package avaliacao.formula1;

public class Patrocinador{

    private String nome_patrocinador;
    private int valor_patrocinio;

    public Patrocinador(String nome_patrocinador, int valor_patrocinio){
        this.nome_patrocinador = nome_patrocinador;
        this.valor_patrocinio = valor_patrocinio;
    }

    public String getNome_patrocinador(){
        return nome_patrocinador;
    }

    public void setNome_patrocinador(String nome_patrocinador){
        this.nome_patrocinador = nome_patrocinador;
    }

    public int getValor_patrocinio(){
        return valor_patrocinio;
    }

    public void setValor_patrocinio(int valor_patrocinio){
        this.valor_patrocinio = valor_patrocinio;
    }
}
