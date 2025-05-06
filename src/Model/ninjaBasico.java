package Model;

import Interface.Ninja;

public class ninjaBasico implements Ninja {
    String nome;
    int idade;
    String classeNinja;

    public ninjaBasico(String nome, int idade, String classeNinja) {
        this.nome = nome;
        this.idade = idade;
        this.classeNinja = classeNinja;
    }


    public void mostrainfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Classe Ninja: " + classeNinja);
    }

    public void executarhabilidades() {
        System.out.println(nome + " Está lançando kunais.");
    }

}
