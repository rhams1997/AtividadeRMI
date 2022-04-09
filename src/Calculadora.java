import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.Remote;
public interface Calculadora extends Remote {

	public int Bhaskara(int a, int b, int c) throws RemoteException;
}


