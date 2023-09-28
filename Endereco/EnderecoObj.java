package Endereco;

public class EnderecoObj {
	public static void main(String[]args) {
		Endereco endereco1 = new Endereco();
		
	endereco1.setId(3);
	endereco1.setLogradouro("indefinido");
	endereco1.setComplemento("casa");
	endereco1.setNumero("432");
	endereco1.setBairro("Jardim Morada");
	endereco1.setCidade("Itapetininga");
	endereco1.setCep("12-321 422");
	endereco1.setUf("indefinido");

	System.out.println("---ITEM ---");
	System.out.println(endereco1.getId());
	System.out.println(endereco1.getLogradouro());
	System.out.println(endereco1.getComplemento());
	System.out.println(endereco1.getNumero());
	System.out.println(endereco1.getBairro());
	System.out.println(endereco1.getCidade());
	System.out.println(endereco1.getCep());
	System.out.println(endereco1.getUf());
}
}