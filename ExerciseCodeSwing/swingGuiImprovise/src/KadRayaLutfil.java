import javax.swing.*;
import java.awt.*;

public class KadRayaLutfil {

    public KadRayaLutfil() {
        // Create the main frame
        JFrame frameKad = new JFrame();

        //tknak bagi besar
        frameKad.setResizable(false);

        // Create a layered pane for stacking elements
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(500, 500));

        // Create background panel (lowest layer)
        BackgroundPanel backgroundPanel = new BackgroundPanel("tobtobitop.png");
        backgroundPanel.setBounds(0, 0, 500, 500);

        // Create foreground image (top layer)
        JLabel foregroundLabel = new JLabel(new ImageIcon(getClass().getResource("layer1eid.png")));
        foregroundLabel.setBounds(0, 0, 500, 500); 
        // Create BIG title that fits the frame
        JLabel greetingLabel = createStyledLabel("Selamat Hari Raya", 50);
        greetingLabel.setBounds(0, 0, 500, 500); 

        // Add components to layered pane
        layeredPane.add(backgroundPanel, Integer.valueOf(1)); // Background
        layeredPane.add(greetingLabel, Integer.valueOf(2)); // Big Title (Centered)
        layeredPane.add(foregroundLabel, Integer.valueOf(3)); // Foreground image

        
        frameKad.add(layeredPane);

        // Frame settings
        frameKad.setTitle("Kad Hari Raya");
        frameKad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameKad.setSize(500, 500);
        frameKad.setLocationRelativeTo(null);
        frameKad.setVisible(true);
    }


    private JLabel createStyledLabel(String text, int fontSize) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, fontSize));
        label.setForeground(new Color(1, 1, 1)); // Gold color
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }
}
