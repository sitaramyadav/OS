import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TestServer extends UnicastRemoteObject implements IOneInterface {


    private TestServer() throws RemoteException {
        super();
    }

    public String sayHello(String text) throws RemoteException {
        System.out.println("client is saying hello " + text);
        return "server responding to client";
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Naming.rebind("//localhost:5005/hello", new TestServer());
        System.out.println("server started");
    }
}
