package Swings;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class ColorTabbedPane {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabbed Pane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tab = new JTabbedPane();

        // Panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tab.addTab("CYAN", cyanPanel);
        tab.addTab("MAGENTA", magentaPanel);
        tab.addTab("YELLOW", yellowPanel);

        // Event
        tab.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tab.getSelectedIndex();
                String name = tab.getTitleAt(index);

                System.out.println(name + " tab is selected");
            }
        });

        frame.add(tab);
        frame.setVisible(true);
    }
}
