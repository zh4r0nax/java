import java.util.Scanner;

public class Teclado{
	public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num_uno = 0, num_dos = 0, res = 0;
        System.out.println("¿cual es tu nombre?");
        nombre = in.nextLine();
        
        System.out.println("Dame el primer valor para tu suma:");
        num_uno = in.nextInt();
        System.out.println("Dame el segundo valor para tu suma:");
        num_dos = in.nextInt();
        res = num_dos + num_uno;
        System.out.println("Hola "+nombre+" El resultado de la suma es:"+res);
	}
}