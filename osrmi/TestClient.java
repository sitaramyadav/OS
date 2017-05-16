import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;TestClient main()
public class TestClient {
    private static ITestInterface lookup;
    public static void main(String args[]) throws RemoteException, NotBoundException, MalformedURLException {
        Naming.rebind((name:"//localhost:5005/myObject", new TestServer()));
    }
}
