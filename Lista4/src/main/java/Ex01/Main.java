package Ex01;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        Grupo grupo = new Grupo();
        grupo.adicionarHeroi(new Heroi("Superman", 1, 10));
        grupo.adicionarHeroi(new Heroi("Superman", 1, 10));
        grupo.adicionarHeroi(new Heroi("Batman", 2, 25000));
        grupo.adicionarHeroi(new Heroi("Mulher Maravilha", 3, 30));

        grupo.removerHeroi(1);
        JOptionPane.showMessageDialog(null,"O total de moedas de ouro é: " + grupo.getTotalMoedasDeOuro());
    }
}
