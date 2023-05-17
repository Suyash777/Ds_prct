import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RemoteServerInterface extends Remote {
int addNumbers(int a, int b) throws RemoteException;
}
