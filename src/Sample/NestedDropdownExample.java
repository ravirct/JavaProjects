package Sample;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NestedDropdownExample {

	private static Map<String, String[]> dropdownMap;

    public static void main(String[] args) {
        // Setup the data for the dropdowns
        dropdownMap = new HashMap<>();
        dropdownMap.put("Fruits", new String[]{"Apple", "Banana", "Orange"});
        dropdownMap.put("Vegetables", new String[]{"Carrot", "Broccoli", "Spinach"});
        dropdownMap.put("Drinks", new String[]{"Water", "Juice", "Soda"});

        // Create the main frame
        JFrame frame = new JFrame("Nested Dropdown Example");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Main dropdown (parent)
        JComboBox<String> mainDropdown = new JComboBox<>(dropdownMap.keySet().toArray(new String[0]));

        // Sub-dropdown (child)
        JComboBox<String> subDropdown = new JComboBox<>();

        // Add action listener to the main dropdown
        mainDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected value from the main dropdown
                String selectedItem = (String) mainDropdown.getSelectedItem();

                // Update the sub-dropdown based on the selected value
                subDropdown.removeAllItems();
                for (String item : dropdownMap.get(selectedItem)) {
                    subDropdown.addItem(item);
                }
            }
        });

        // Trigger initial population of sub-dropdown
        mainDropdown.setSelectedIndex(0);

        // Add components to the frame
        frame.add(new JLabel("Select Category:"));
        frame.add(mainDropdown);
        frame.add(new JLabel("Select Item:"));
        frame.add(subDropdown);

        // Display the frame
        frame.setVisible(true);
    }
	
}
