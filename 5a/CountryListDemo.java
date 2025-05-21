//5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
//Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display them on console whenever the countries are selected on the list.
package JAVA;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.List;

public class CountryListDemo {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Country List Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Country names
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(6);  // Show 6 items at a time
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);
        frame.add(scrollPane);

        // Add listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries:");
                    for (String country : selectedCountries) {
                        System.out.println(country);
                    }
                    System.out.println(); // blank line
                }
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
