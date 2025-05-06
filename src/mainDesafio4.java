import Model.ninjaAvancado;
import Model.ninjaBasico;

public class mainDesafio4 {
    public static void main(String[] args) {
        ninjaBasico ninjaB1 = new ninjaBasico("Naruto", 16, "Genin");

        ninjaAvancado ninjaA1 = new ninjaAvancado("Kakashi", 35, "Jounin","Ninjutsu");

        ninjaB1.mostrainfo();
        ninjaB1.executarhabilidades();
        System.out.println("-------------------------------------------------");
        ninjaA1.mostrainfo();
        ninjaA1.executarhabilidades( "Chidori");
    }
}
