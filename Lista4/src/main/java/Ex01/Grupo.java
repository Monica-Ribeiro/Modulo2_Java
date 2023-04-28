package Ex01;
import javax.swing.*;
import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi>herois;
    private  int totalMoedasDeOuro;
    public ArrayList<Heroi> getHerois(){
        return herois;
    }
    public int getTotalMoedasDeOuro(){
        return totalMoedasDeOuro;
    }
    public Grupo(){
        this.herois = new ArrayList<>();
    }
    public void adicionarHeroi(Heroi heroi){
        this.herois.add(heroi);
        this.totalMoedasDeOuro = this.totalMoedasDeOuro + heroi.getQuantidadeMoedasDeOuro();
        JOptionPane.showMessageDialog(null, "O heroi: " + heroi.getNome() + " foi adicionado ao grupo.");
    }
    public void removerHeroi(int idHeroi) {
        for (int i = 0; i < herois.size(); i++) {
            if (herois.get(i).getId() == idHeroi) {
                this.totalMoedasDeOuro = this.totalMoedasDeOuro - herois.get(i).getQuantidadeMoedasDeOuro();
                JOptionPane.showMessageDialog(null,"Heroi: " + herois.get(i).getNome() + " removido com sucesso!");
                herois.remove(i);
                return;
            }
        }
    }
}
