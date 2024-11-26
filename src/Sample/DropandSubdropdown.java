package Sample;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DropandSubdropdown{
	public static void main(String[] args){
//		Map<String, List<String> >hm=new HashMap<String, List<String>>();
//		
//		ArrayList<String> fruits = new ArrayList<String>();
//		fruits.add("Sapota");
//		fruits.add("Apple");
//		fruits.add("Mango");
//		fruits.add("Graps");
//		
//		ArrayList<String> vegitables=new ArrayList<String>();
//		vegitables.add("Tamota");
//		vegitables.add("Onian");
//		vegitables.add("Mirchi");
//		vegitables.add("Brinjal");
//		
//		hm.put("fruits", fruits);
//		hm.put("vegitables", vegitables);
//		
//		for(Entry<String, List<String>> e:hm.entrySet()) {
//			
//			System.out.println("Dropdown :"+e.getKey() );
//			System.out.println("Sub-Dropdown values:"+e.getValue());			
//		}
//		
		
		@SuppressWarnings("unchecked")
		Map<String, List<String>> drpdownMain=new HashMap();
		
		ArrayList<String> fruits=new ArrayList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		ArrayList<String> vegitables=new ArrayList();
		vegitables.add("Tamota");
		vegitables.add("Carrot");
		vegitables.add("Spinach");
		
		ArrayList<String> drinks=new ArrayList();
		drinks.add("water");
		drinks.add("Juice");
		drinks.add("Soda");
		
		drpdownMain.put("fruits", fruits);
		drpdownMain.put("vegitables",vegitables);
		drpdownMain.put("drinks", drinks);
		
		// Create the main frame
		JFrame frame=new JFrame("Nested Dropdown Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLayout(new FlowLayout());
		
		JComboBox<String> mainDropdown = new JComboBox<>(drpdownMain.keySet().toArray(new String[0]));
		JComboBox<String> subDropdown=new JComboBox<>();
		
		mainDropdown.addActionListener(new ActionListener(){
			
		public void actionPerformed(ActionEvent e) {
			String selectedItem=(String) mainDropdown.getSelectedItem();
			subDropdown.removeAllItems();
			for(String item: drpdownMain.get(selectedItem)) {
				subDropdown.addItem(item);
			}
		}
		});
		
		mainDropdown.setSelectedIndex(0);
		
		frame.add(new JLabel("Select Category:"));
		frame.add(mainDropdown);
		frame.add(new JLabel("Select Item:"));
		frame.add(subDropdown);
		
		frame.setVisible(true);
		
		
		
	}
	
}
