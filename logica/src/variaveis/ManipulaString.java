package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "xPtO@GAmA.COM";
		System.out.println("Original: " + email);
		System.out.println("Mai�scula: " + email.toUpperCase());
		System.out.println("Min�scula: " + email.toLowerCase());
		System.out.println("Qtde de caracteres: "+ email.length());
		System.out.println("Tem @? " + email.contains("@"));
		System.out.println("@ na posi��o: " + email.indexOf("@"));
		System.out.println("Parte da string: " + email.substring(2,5));
		System.out.println("Primeira parte: " + email.substring(0,email.length()/2));
		if (email.contains("@")==true)
		{
		System.out.println("Usu�rio: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1,email.length()));
		}
		
		
		
		
		
	}

}
