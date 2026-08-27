package avaliacao.lampada;

import java.io.IOException;
import java.util.Scanner;

//Criação da classe Teste
public class Teste{

    
   public static void main(String[] args) throws IOException {

        //Criação de objeto para a leitura de dados do usuário
       Scanner s = new Scanner(System.in);
       //Declaração do objeto lampada
       Lampada lampada;

       //Pergunta se o usuário quer configurar a lâmpada e lê a resposta
       System.out.println("Você gostaria de configurar o valor de watts da lâmpada e o estado dela? (Digite 1 se sim ou qualquer outro número inteiro se não): ");
        int resposta = s.nextInt();

        //Separando o processo de quem respondeu "1" de quem respondeu outro número inteiro
        if(resposta==1){
            //Declaração de variáveis
            int numero_de_watts;
            boolean estado_lampada;
            
            //Pergunta o número de watts
            System.out.println("Digite um número de watts de 1 a 1000: ");
            //Garante que o valor esteja no intervalo permitido
            do{
            numero_de_watts = s.nextInt();

            if(numero_de_watts < 1 || numero_de_watts > 1000){
                System.out.println("Valor inválido! Digite um número de 1 a 1000: ");
            }
            } while(numero_de_watts < 1 || numero_de_watts > 1000);

            //Pergunta se o usuário quer ligar ou desligar a lâmpada e lê a resposta
            System.out.println("Digite 1 para que a lâmpada ligue ou qualquer outro número inteiro para que ela desligue: ");
            int resposta2 = s.nextInt();

            //Liga para quem digitou "1" e desliga para quem digitou outro número inteiro
            if(resposta2==1){
                estado_lampada = true;
                } else{
                estado_lampada = false;
            }
            lampada = new Lampada(numero_de_watts, estado_lampada);
        } else{
            //Define os valores padrões para a lâmpada
            lampada = new Lampada();
        }

        //Exibe o número de watts
        System.out.println("Watts: " + lampada.getNum_watts());

        //Mostra se a lâmpada está ligada ou desligada
        if(lampada.getEstado()){
            System.out.println("Lâmpada ligada");
        }else{
            System.out.println("Lâmpada desligada");
        }

        //Fecha o Scanner
        s.close();

   }
}
