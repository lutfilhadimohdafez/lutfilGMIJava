import javax.swing.*;
import java.awt.*;

public class SimpleHariRayaCard extends JFrame {

    static JButton b, b1, b2; 

    public SimpleHariRayaCard() {


        setTitle("Selamat Hari Raya!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        setLocationRelativeTo(null); // Center the window

      
        // Greeting Label
        JLabel greetingLabel = new JLabel("Selamat Hari Raya Aidilfitri!");
        greetingLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(greetingLabel);

        // Additional Message (Optional)
        JLabel messageLabel = new JLabel("Maaf Zahir Batin");
        messageLabel.setFont(new Font("Arial", Font.ITALIC, 16));
        add(messageLabel);

        // Display the current year (as it's Hari Raya in 2025 in this context)
        JLabel yearLabel = new JLabel("Tahun 2025");
        yearLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        add(yearLabel);

        setVisible(true);
    }

}