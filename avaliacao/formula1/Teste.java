package avaliacao.formula1;

import java.util.ArrayList;

public class Teste{
    public static void main(String[] args) {
   
        ArrayList<Patrocinador> patrocinadores = new ArrayList<>();
   
        Patrocinador patrocinador1 =  new Patrocinador("Coca-Cola", 1000000);
        patrocinadores.add(patrocinador1);

        Patrocinador patrocinador2 = new Patrocinador("Rexona", 1500000);
        patrocinadores.add(patrocinador2);

        Equipe equipe1 = new Equipe("Ferrari", 1929, patrocinadores);

        Piloto piloto1 = new Piloto("Max Verstappen", 28, "Neerlandês", 71);

        Engenheiro engenheiro1 = new Engenheiro("João Pereira", 29, "Brasileiro", piloto1);

        Carro carro1 = new Carro(27, 3, equipe1, piloto1);

        System.out.println("Nome do piloto: " + piloto1.getNome());
        System.out.println("Idade do piloto: " + piloto1.getIdade());
        System.out.println("Nacionalidade do piloto: " + piloto1.getNacionalidade());
        System.out.println("Número de vitórias do piloto: " + piloto1.getNum_vitorias());

       System.out.println("Número do carro: " + carro1.getNumero());
        System.out.println("Posição do carro: " + carro1.getPosicao());
        System.out.println("Piloto do carro: " + carro1.getPiloto_carro().getNome());

        System.out.println("Nome da equipe: " + equipe1.getNome_equipe());
        System.out.println("Ano de fundação: " + equipe1.getAno_fundacao());

       System.out.println("\nPatrocinadores:");

        for (Patrocinador patrocinador : equipe1.getPatrocinadores()) {
            System.out.println("Nome: " + patrocinador.getNome_patrocinador() + " | Valor: R$ " + patrocinador.getValor_patrocinio());
        }

       System.out.println("\nNome do engenheiro: " + engenheiro1.getNome());
        System.out.println("Idade do engenheiro: " + engenheiro1.getIdade());
        System.out.println("Nacionalidade do engenheiro: " + engenheiro1.getNacionalidade());
        System.out.println("Piloto com quem o engenheiro trabalha: " + engenheiro1.getPiloto_engenheiro().getNome());
    }
}


