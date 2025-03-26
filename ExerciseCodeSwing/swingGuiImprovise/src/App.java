import javax.swing.SwingUtilities;


public class App {
    public static void main(String[] args) {

        //async call for swing 
        SwingUtilities.invokeLater(() -> new SimpleHariRayaCard());
    }
}
