import java.util.Scanner;

    public class Ejercicio1{
        public static void main(String[] args){
            int numero, c = 0, a = 0;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un número entero positivo menor a 100: ");
            numero = entrada.nextInt();
            if(numero > 0 && numero < 100){
                for (int i = 1; i <= numero; i++){
                int aleatorio = (int)(Math.random()*100+1);
                System.out.println( aleatorio + "");
                if(aleatorio % 2 == 0){
                    c = c+1;
                } else {
                    a = a+1;
                }
                }
            System.out.println("La cantidad de números pares es: " + c);
            System.out.println("La cantidad de números impares es: " + a);
                
            } else   
            System.out.println("El valor ingresado no es valido.");
        }
    }