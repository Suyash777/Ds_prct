import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Client1{
private Client1() {super();
}
public static void main(String[] args) {
try {
Registry registry = LocateRegistry.getRegistry(null);
RemoteServerInterface stub = (RemoteServerInterface)
registry.lookup("RemoteServer");
int result = stub.addNumbers(9,8);
System.out.println("Result: " + result);
} catch (Exception e) {
System.err.println("Client exception: " + e.toString());
e.printStackTrace();
}
}
}
