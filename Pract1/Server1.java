import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server1 implements RemoteServerInterface {
public Server1() {
super();
}
@Override
public int addNumbers(int a, int b) throws RemoteException {
return a + b;
}
public static void main(String[] args) {
try {
Server1 obj = new Server1();
RemoteServerInterface stub = (RemoteServerInterface)
UnicastRemoteObject.exportObject(obj, 0);
Registry registry = LocateRegistry.getRegistry();
registry.bind("RemoteServer", stub);
System.out.println("Server ready");
} catch (Exception e) {
System.err.println("Server exception: " + e.toString());
e.printStackTrace();
}
}
}
