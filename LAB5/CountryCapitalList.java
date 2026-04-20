package Swings;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

class CountryCapitalList {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Countries
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Map for capitals
        HashMap<String, String> map = new HashMap<>();
        map.put("USA", "Washington D.C.");
        map.put("India", "New Delhi");
        map.put("Vietnam", "Hanoi");
        map.put("Canada", "Ottawa");
        map.put("Denmark", "Copenhagen");
        map.put("France", "Paris");
        map.put("Great Britain", "London");
        map.put("Japan", "Tokyo");
        map.put("Africa", "Addis Ababa");
        map.put("Greenland", "Nuuk");
        map.put("Singapore", "Singapore");

        // JList
        JList<String> list = new JList<>(countries);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Event
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selected = list.getSelectedValuesList();

                    for (String country : selected) {
                        System.out.println("Capital of " + country + " is: " + map.get(country));
                    }
                    System.out.println("----------------------");
                }
            }
        });

        frame.add(new JScrollPane(list));
        frame.setVisible(true);
    }
}
