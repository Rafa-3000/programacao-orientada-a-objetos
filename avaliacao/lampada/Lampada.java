package avaliacao.lampada;

//Criação da classe Lampada
public class Lampada{
 
    //Criação dos atributos da classe Lampada
   private boolean estado;
   private int num_watts;

    //Construtor que cria uma lâmpada com valores definidos
   Lampada(int num_watts, boolean estado){
       setNum_watts(num_watts);
       this.estado = estado;
   }



   //Construtor que cria uma lâmpada com os valores padrão
   Lampada(){
       this.num_watts = 60;
       this.estado = false;
   }



   //Método para pegar o valor do estado
   public boolean getEstado(){
       return estado;
   }



   //Método para alterar o valor do estado
   public void setEstado(boolean estado){
       this.estado = estado;
   }



   //Método para pegar o valor do num_watts
   public int getNum_watts(){
       return num_watts;
   }



   //Método para alterar o valor do num_watts e garantir que o valor esteja entre 1 e 1000 (1 e 1000 inclusos)
   public void setNum_watts(int num_watts){
       if(num_watts >= 1 && num_watts <= 1000){
        this.num_watts = num_watts;
       } else{
        System.out.println("Valor inválido! A potência deve estar entre 1 e 1000 watts.");
       }
   }



   //Método para ligar e desligar a lâmpada (mudar o estado)
   public void interruptor(){
       if(estado==true){
           estado=false;
           System.out.println("Desligada");
       }else{
           estado=true;
           System.out.println("Ligada");
       }
   }
}
