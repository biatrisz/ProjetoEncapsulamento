package Cliente;

public class ClienteObj {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		
		cliente1.setId(3);
		cliente1.setNome("indefinido");
		cliente1.setTelefone("casa");
		cliente1.setCpf("432");
		cliente1.setRg("Jardim Morada");
		
		System.out.println("---ITEM ---");
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
	}

}
