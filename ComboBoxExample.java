import javax.swing.*; 
 public class ComboBoxExample { 
 JFrame f; 
 ComboBoxExample(){ 
 f=new JFrame("ComboBox "); 
 String state[]={"Maharashtra","MP","UP","Telagana","Bihar"}; 
 JComboBox cb=new JComboBox(state); 
 cb.setBounds(50, 50,90,20); 
 f.add(cb); 
 f.setLayout(null); 
 f.setSize(400,500); 
 f.setVisible(true); 
} 
public static void main(String[] args) { 
 new ComboBoxExample(); 
} 
}