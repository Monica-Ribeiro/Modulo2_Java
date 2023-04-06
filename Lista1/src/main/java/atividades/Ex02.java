package atividades;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args){
        System.out.println("**PESQUISA HABITACIONAL**");
        Scanner leia = new Scanner(System.in);
        float salario;
        float maiorSalario = 0;
        float somaSalarioPopulacao = 0;
        int filhos;
        int somaFilhosPopulacao = 0;
        int quantidadeHabitantes = 0;

        while (quantidadeHabitantes < 3){
            System.out.println("Digite o salário: ");
            salario = leia.nextFloat();
            System.out.println("Quantos filhos? ");
            filhos = leia.nextInt();
            quantidadeHabitantes++;
            somaSalarioPopulacao = somaSalarioPopulacao + salario;
            somaFilhosPopulacao = somaFilhosPopulacao + filhos;
            if(salario > maiorSalario){
                maiorSalario = salario;
            }
        }
        float mediaSalarioPopulacao = somaSalarioPopulacao / quantidadeHabitantes;
        int mediaFilhosPopulacao = somaFilhosPopulacao / quantidadeHabitantes;
        System.out.println("Média salarial da população: " + mediaSalarioPopulacao);
        System.out.println("Média de filhos por habitantes: " + quantidadeHabitantes);
        System.out.println("Maior salário: " + maiorSalario);
    }
}
