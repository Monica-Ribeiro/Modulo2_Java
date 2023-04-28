package src;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Aula> aulas;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.alunos = new ArrayList<>();
        this.aulas = new ArrayList<>();
    }

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.aulas = new ArrayList<>();
    }

    public Curso(String nome, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.alunos = alunos;
        this.aulas = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno){
        for (int i = 0; i < this.alunos.size(); i++) {
            if(this.alunos.get(i).getId() == aluno.getId()){
                System.out.println("este aluno já está matriculado...");
                return;
            }
        }

        this.alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " matriculado com sucesso!");
    }

    public void cadastrarAula(Aula aula){
        for (int i = 0; i < this.aulas.size(); i++) {
            if(this.aulas.get(i).getId() == aula.getId()){
                System.out.println("Está aula já está cadastrada...");
                return;
            }
        }

        this.aulas.add(aula);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        if(this.aulas.size() == 0){
            this.aulas = aulas;
            return;
        }
        for (int i = 0; i < aulas.size(); i++) {
            this.aulas.add(aulas.get(i));
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        if(this.alunos.size() == 0){
            this.alunos = alunos;
            return;
        }

        for (int i = 0; i < alunos.size(); i++) {
            this.alunos.add(alunos.get(i));
        }
    }
}
