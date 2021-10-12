import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Gui implements ActionListener{
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JTextField field = new JTextField(16);
    private JButton addItem = new JButton("Add Item");
    ArrayList<String> sList = new ArrayList<>();

    public Gui() {
        setUp();
    }

    private void setUp () {
        //Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);

        //Panel Flow Layout:
        JLabel info = new JLabel("Enter items to list:");
        
        //Append panel with layout:
        panel.add(info);
        panel.add(field);
        //panel.add(itemList);
        buttonProperties();

        //Organize
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.setVisible(true);
    }
    private void buttonProperties() {
        panel.add(addItem);
        addItem.addActionListener(this);
    }
    @Override 
        public void actionPerformed(ActionEvent e) {
            String s = field.getText();
            sList.add(s);
            String txt = "Your Items: \n";
            for (String i : sList) {
                txt = txt + i + " \n";
            }
            frame.getContentPane().add(BorderLayout.CENTER, new JTextArea(txt));
            frame.setVisible(true);
        }
}
