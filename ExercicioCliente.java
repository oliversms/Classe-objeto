package familia58;

public class ExercicioCliente {

	public static void main(String[] args) {
		
		String nome = "ijjmijm y6#á ";
		int ano = 8;
		Cliente joao = new Cliente();
		joao.setIdade(28);
		joao.setNome("João");
		joao.setTelefone("91981089555");
		joao.setCpf("01023456788");
		
		Cliente ana = new Cliente();
		ana.setIdade(36);
		ana.setNome("Ana");
		ana.setTelefone("9187654433");
		ana.setCpf("0223344567");
			
		Cliente ezequiel = new Cliente();
		ezequiel.setIdade(28);
		ezequiel.setNome("Ezequiel");
		ezequiel.setTelefone("878777777");
		ezequiel.setCpf("986543800");
		
		System.out.println("\n"+joao.getNome()+"\n"+joao.getCpf()+"\n"+joao.getIdade()+"\n"+joao.getTelefone());
		System.out.println("\n"+ana.getNome()+"\n"+ana.getCpf()+"\n"+ana.getIdade()+"\n"+ana.getTelefone());
		System.out.println("\n"+ezequiel.getNome()+"\n"+ezequiel.getCpf()+"\n"+ezequiel.getIdade()+"\n"+ezequiel.getTelefone());
	}

}
