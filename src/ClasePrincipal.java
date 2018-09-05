import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3 Cargar un String por teclado e implementar los siguientes métodos:
		 Imprimir la cantidad de caracteres que posee.
		 Imprimir la primera mitad de los caracteres de la cadena.
		 Imprimir el último caracter.
		Imprimirlo en forma inversa.
		Imprimir cada caracter del String separado con un guión.
	 	Implementar un método que verifique si la cadena posee la palabra “hola”
		(indistintamente si posee letras mayúsculas o minúsculas)*/

		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		String CadenaInvertida=null;
		String guion = "";
		
		System.out.println(s.length());
		int mitad=s.length()/2;
		System.out.println(s.substring(0, mitad));
		System.out.println(s.charAt(s.length()-1));
		for (int x=s.length()-1;x>=0;x--)
		{
			CadenaInvertida = CadenaInvertida + s.charAt(x);
		}
		s.startsWith("hola");
		if(s.equalsIgnoreCase("Hola"))
		{
			System.out.println("contiene HOlaaaa");
		}
		for(int i=0;i<s.length();i++)
		{
		guion= guion + s.charAt(i) + "-";	
			
		}
		
		System.out.println(guion); 
	}

}
