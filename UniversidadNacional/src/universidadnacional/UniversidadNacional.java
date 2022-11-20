package universidadnacional;
import javax.swing.JFrame;

public class UniversidadNacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        frmPrincipal principal = new frmPrincipal();
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
    
}
