import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;
    SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2, 10, 10));
        l1 = new Label("First Number : ");
        t1 = new TextField();
        l2 = new Label("Second Number : ");
        t2 = new TextField();
        b1 = new Button("Add");
        b2 = new Button("Subtract");
        b3 = new Button("Multiply");
        b4 = new Button("Divide");
        l3 = new Label("Result : ");
        t3 = new TextField();
        t3.setEditable(false);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);
        add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        double n1 = Double.parseDouble(t1.getText());
        double n2 = Double.parseDouble(t2.getText());
        if (e.getSource() == b1) {
            t3.setText(String.valueOf(n1 + n2));
        }
        else if (e.getSource() == b2) {
            t3.setText(String.valueOf(n1 - n2));
        }
        else if (e.getSource() == b3) {
            t3.setText(String.valueOf(n1 * n2));
        }
        else if (e.getSource() == b4) {
            if (n2 == 0) {
                t3.setText("Cannot divide by zero");
            } else {
                t3.setText(String.valueOf(n1 / n2));
            }
        }
    }
    public static void main(String args[]) {
        new SimpleCalculator();
    }
}
