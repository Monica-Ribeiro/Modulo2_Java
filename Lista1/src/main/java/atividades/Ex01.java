package atividades;
import java.util.Scanner;
public class Ex01 {
    public static String categoriaIdade(int idade){
        if(idade > 4 && idade < 8){
            return "Categoria infantil A";
        } else if (idade > 7 && idade < 11) {
            return "Categoria infantil B";
        } else if (idade > 10 && idade < 14) {
            return "Categoria juvenil A";
        } else if (idade > 13 && idade <= 17) {
            return "Categoria juvenil B";
        } else if (idade >= 18) {
            return "Categoria adulto";
        }
        return "Número inválido! tente novamente.";
    }
    public static void main(String[] args){
        System.out.println("Idade: ");
        Scanner leia = new Scanner(System.in);
        int idade = leia.nextInt();
        String resposta = categoriaIdade(idade);
        System.out.println(resposta);
    }
}
