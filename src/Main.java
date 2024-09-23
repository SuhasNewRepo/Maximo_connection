import java.rmi.RemoteException;
import com.ibm.tivoli.maximo.assetmanagement.app.asset.Asset;
import com.ibm.tivoli.maximo.mbo.MboSet;

public class Main extends Asset {

    public Main(MboSet ms) throws RemoteException {
        super(ms);
    }

    public void save() throws RemoteException {
        super.save();
        int id = getInt("ASSETID");
        String desc = getString("DESCRIPTION");
        System.out.println("Saving Asset ID=" + id + " desc=" + desc);
    }

    public static void main(String[] args) throws RemoteException {
        MboSet ms = null; // Replace with a valid MboSet instance
        Main asset = new Main(ms);
        asset.save();
    }
}