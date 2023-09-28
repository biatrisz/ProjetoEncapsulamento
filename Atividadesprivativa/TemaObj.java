package Atividadesprivativa;

public class TemaObj {
	public static void main(String[]args) {

	Tema Item1 = new Tema();

	Item1.setId(3);
	Item1.setNome("julia");
	Item1.setValorAluguel((double) 100000);
	Item1.setCorToalha("Azul");

	System.out.println("---ITEM ---");
	System.out.println(Item1.getId());
	System.out.println(Item1.getNome());
	System.out.println(Item1.getValorAluguel());
	System.out.println(Item1.getCorToalha());

}
}

