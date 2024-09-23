import psdi.mbo.MboSetRemote;
import psdi.mbo.MboRemote;
import psdi.app.asset.AssetSetRemote;
import psdi.app.asset.AssetRemote;

public class ReadData {
    public static void main(String[] args) {
        try {
            try (MboSetRemote assetSet = getMboSet("STUDENT_TABLE")) {
                //assetSet.setWhere("LOCATION='BEDFORD'");
                MboRemote asset = null;
                for (int i = 0; (asset = assetSet.getMbo(i)) != null; i++) {
                    System.out.println("ID: " + asset.getInt("ID"));
                    System.out.println("NAME: " + asset.getString("NAME"));
                    System.out.println("EMAIL: " + asset.getString("EMAIL"));
                    System.out.println("PHONE: " + asset.getString("PHONE"));
                    System.out.println("ABOUT: " + asset.getString("ABOUT"));
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
