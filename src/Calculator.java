import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    public static void main(String[] args) {
        new Calculator();
        Frame f=new Frame("Mini AWT calculator");
        GridBagLayout gridBagLayout = new GridBagLayout();

        f.setLayout(gridBagLayout);
        f.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        new GridBagConstraints();
        GridBagConstraints c;

        Label l1=new Label("Enter the first number: ", Label.LEFT);
        TextField t1 =new TextField(20);
        t1.setBackground(Color.lightGray);
        Label l2=new Label("Choose an operation: ");

        Choice myChoice = new Choice();
        myChoice.add("+");
        myChoice.add("-");
        myChoice.add("*");
        myChoice.add("/");
        myChoice.setBackground(Color.cyan);

        Label l3 = new Label("Enter the second number");
        TextField t2 = new TextField(20);
        t2.setBackground(Color.lightGray);
        Button b1 = new Button("Calculate");
        Label l4 = new Label("Result : ");
        l4.setBackground(Color.cyan);
        TextField t3 = new TextField(20);

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.BOTH;
        f.add(l1, c);

        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.BOTH;
        f.add(t1, c);

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        f.add(l2, c);

        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        f.add(myChoice, c);

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        f.add(l3, c);

        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        f.add(t2, c);

        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        f.add(b1, c);

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 4;
        c.fill = GridBagConstraints.BOTH;
        f.add(l4, c);

        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 4;
        c.fill = GridBagConstraints.BOTH;
        f.add(t3, c);

        b1.addActionListener(e ->  {

            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            if (myChoice.getSelectedItem().equals("+")) {

                t3.setText("" + (a + b));
            } else if (myChoice.getSelectedItem().equals("-")) {
                t3.setText("" + (a - b));

            } else if (myChoice.getSelectedItem().equals("*")) {
                t3.setText("" + (a * b));

            } else if (myChoice.getSelectedItem().equals("/")) {
                t3.setText("" + (a / b));
            }
        });

        f.setBackground(Color.GRAY);
        f.setSize(350, 180);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}