import javax.swing.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class TestClient {
    private static IOneInterface lookup;

    public static void main(String args[]) throws RemoteException, NotBoundException, MalformedURLException {
        lookup = (IOneInterface) Naming.lookup("//localhost:5005/hello");

        String name = JOptionPane.showInputDialog("Enter name");

        String response = lookup.sayHello(name);
        JOptionPane.showConfirmDialog(null, response);
    }
}
