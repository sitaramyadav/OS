import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IOneInterface extends Remote {
    String sayHello(String text) throws RemoteException;
}
