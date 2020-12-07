package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "xPtO@GAmA.COM";
		System.out.println("Original: " + email);
		System.out.println("Maiúscula: " + email.toUpperCase());
		System.out.println("Minúscula: " + email.toLowerCase());
		System.out.println("Qtde de caracteres: "+ email.length());
		System.out.println("Tem @? " + email.contains("@"));
		System.out.println("@ na posição: " + email.indexOf("@"));
		System.out.println("Parte da string: " + email.substring(2,5));
		System.out.println("Primeira parte: " + email.substring(0,email.length()/2));
		if (email.contains("@")==true)
		{
		System.out.println("Usuário: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1,email.length()));
		}
		
		
		
		
		
	}

}
