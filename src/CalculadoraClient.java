import java.rmi.registry.*;
import java.util.Scanner;



public class CalculadoraClient {
    public static void main(String[] args) {
        try {
            // Procura o registro do RMI no Servidor
            // Se o servidor estiver em outro host basta substituir pelo seu IP
	        	Scanner sc = new Scanner(System.in);
	        	int op=0;
	        do {
	            Registry registry = LocateRegistry.getRegistry("localhost");
	
	            // Procura a stub do servidor
	            Calculadora stub= (Calculadora) registry.lookup("Servidor");
	         // Chama o método do servidor e imprime a mensagem
	            
	            System.out.println("Invocando metodo do servidor........");
            
            	System.out.println("Digite um valor para [A]");
                int a = sc.nextInt();
                
                System.out.println("Digite um valor para [B]");
                int b = sc.nextInt();
                
                System.out.println("Digite um valor para [C]");
                int c = sc.nextInt();
                
                int Bhask = stub.Bhaskara (a, b, c);
                
                System.out.println("Mensagem retornada pelo Servidor:");
                System.out.println("(b²-4*a*c)=" +Bhask);
                
                System.out.println("Digite[0] para Sair/ [1] para continuar");
                op = sc.nextInt();
                 
            }while(op!=0);

        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
}

