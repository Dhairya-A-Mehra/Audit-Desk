/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home;
import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Main Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Open Sub Frame");
        button.addActionListener(e -> openSubFrame());

        // Add the button to the main frame
        getContentPane().add(button);

        setVisible(true);
    }

    private void openSubFrame() {
        // Create a sub frame
        SubFrame subFrame = new SubFrame();
        // Set the location of sub frame relative to main frame
        subFrame.setLocationRelativeTo(this);
        // Make the sub frame visible
        subFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}

class SubFrame extends JFrame {
    public SubFrame() {
        setTitle("Sub Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("This is a sub frame");

        // Add the label to the sub frame
        getContentPane().add(label);

        //setVisible(true); // Don't call setVisible(true) here, as the main frame controls when to show the sub frame
    }
}
