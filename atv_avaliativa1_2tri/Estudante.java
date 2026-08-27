package atv_avaliativa1_2tri;
import java.util.Scanner;

public class Estudante {
    
    private String nome;
    private double[] notas;


    public Estudante(String nome){
        this.nome = nome;
        this.notas = new double[5];
    }

    public String getNome(){
        return nome;
    }

    public double[] getNotas(){
        return notas;
    }

    public void insereNotas(){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++){
            notas[i]=scanner.nextDouble();
        }
    }

    public double calculaMedia(){
        double soma=0;
        
        for(int i=0;i<5;i++){
            soma+=notas[i];
        }
        return soma/5.0;
    }

    public double menorNota(){
        double menor_nota=0;

        for(int i=0;i<5;i++){
            if(notas[i]<menor_nota){
                menor_nota=notas[i];
            }
        }
        return menor_nota;
    }


}
