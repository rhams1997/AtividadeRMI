import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class CalculadoraServer implements Calculadora {
    public CalculadoraServer() {}  // Construtor

    public static void main(String[] args) {
        try {
            CalculadoraServer server = new CalculadoraServer();
            //Exporta o server para o stub ("apendice ou toco") do RMI na porta 0
            Calculadora stub = (Calculadora) UnicastRemoteObject.exportObject(server, 0);
            
            Registry registry = LocateRegistry.getRegistry();
            // Registra a stub no RMI para que ela seja obtida pelos clientes
            registry.bind("Servidor", stub);
            
            System.out.println("Servidor inicializado com sucesso.");
            
    		
    		
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
    
    public int Bhaskara(int a, int b, int c) throws RemoteException{
    	return (b*b-4*a*c);
    	
    	//a=1; b=2; c=3
    }
}



