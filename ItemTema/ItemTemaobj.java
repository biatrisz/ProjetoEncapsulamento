package ItemTema;

public class ItemTemaobj {
	public static void main(String[]args) {
	ItemTema Item2 = new ItemTema();

	Item2.setId(3);
	Item2.setNome("JAPA");
	Item2.setDescricao("comida");


	System.out.println("---ITEM ---");
	System.out.println(Item2.getId());
	System.out.println(Item2.getNome());
	System.out.println(Item2.getDescricao());

}
}

