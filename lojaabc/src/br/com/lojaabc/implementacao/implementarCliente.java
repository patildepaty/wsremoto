package br.com.lojaabc.implementacao;

public class ImplementarCliente {

	public static void main(String[] args) {
		
	char opcao = Magic.s("Digite F para pessoa Fisica").charAt(0);
	if (opcao=='F') {
		PessoaFisica cliente = new PessoaFisica();
		cliente.setNome(Magic.s("Nome"));
		cliente.setCpf("1345465");
		cliente.setEmail(Magic.s("email").toLowerCase());
		cliente.setEspecial(Magic.b("Cliente Especial?"));
		cliente.setId(Magic.i("Codigo"));
		cliente.setNascimento(Magic.s("Nascimento"));
		cliente.setRg(Magic.s("RG"));
		System.out.println(cliente.toString());
		
		
	}else {
		PessoaJuridica cliente = new PessoaJuridica();
		cliente.setNome(Magic.s("Nome"));
		cliente.setEmail(Magic.s("Email").toLowerCase());
		cliente.setEspecial(Magic.b("Cliente Especial?"));
		cliente.setId(Magic.i("Codigo"));
		cliente.setCnpj(Magic.s("CNPJ"));
		cliente.setContato(Magic.s("Contato"));
		System.out.println(cliente.toString());
	}
		
		
		
	}

}
