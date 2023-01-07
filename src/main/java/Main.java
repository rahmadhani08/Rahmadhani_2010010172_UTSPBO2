import frame.KotaViewFrame;
import helpers.Koneksi;

public class Main {
    public static void main(String[] args){
        Koneksi.getConnection();
        KotaViewFrame viewFrame =new KotaViewFrame();
        viewFrame.setVisible(true);
    }
}