//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
//display the concerned color whenever the specific tab is selected in the Pan
package JAVA;
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPanen {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Color Tabbed Pane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create color panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add tabbed pane to frame
        frame.add(tabbedPane);

        // Make frame visible
        frame.setVisible(true);
    }
}
