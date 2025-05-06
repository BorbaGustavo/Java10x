package Model;

import Enums.tipoEspecialidade;
import Interface.Ninja;

public class ninjaAvancado extends ninjaBasico implements Ninja {
   tipoEspecialidade especilidade;

    public ninjaAvancado(String nome, int idade, String classeNinja, tipoEspecialidade especilidade) {
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