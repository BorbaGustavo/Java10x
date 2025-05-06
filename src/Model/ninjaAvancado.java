package Model;

import Interface.Ninja;

public class ninjaAvancado extends ninjaBasico implements Ninja {
   String especilidade;

    public ninjaAvancado(String nome, int idade, String classeNinja, String especilidade) {
       super(nome, idade, classeNinja);
       this.especilidade = especilidade;}

    @Override
    public void mostrainfo() {
        super.mostrainfo();
        System.out.println("Especilidade: " + especilidade);
    }


    public void executarhabilidades(String justu) {
        System.out.println(nome + " Está lançando jutsu .." + justu);
    }
}