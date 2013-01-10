//Created by Denny Kurniawan-4510210016
//December-2012



import aplikasi.db.Login;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

}
