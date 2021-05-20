package itstep;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyBarPanel extends JPanel {

    public MyBarPanel() {
        this.setAlignmentX(CENTER_ALIGNMENT);
        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));

        createButtons(this);

}

    private void createButtons(JPanel panel) {

        JPanel panel2 = new JPanel();

        JRadioButton od1 = new JRadioButton();
        JRadioButton od2 = new JRadioButton();
        JRadioButton od3 = new JRadioButton();
        JRadioButton od4 = new JRadioButton();

        panel2.add(od1);
        panel2.add(od2);
        panel2.add(od3);
        panel2.add(od4);

        panel2.setBackground(new Color(0,0,200));
        panel2.setSize(new Dimension(480, 240));

        add(panel2);

        JPanel panel3 = new JPanel();

        panel3.setLayout (new BoxLayout (panel3, BoxLayout.X_AXIS));
        JButton btn1 = new JButton("<<");
        JButton btn2 = new JButton(">>");

       // panel.setLayout(new BoxLayout(panel, BorderLayout.CENTER));
        panel3.add(btn1);
        panel3.add(btn2);
        add(panel3);
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btn3.setText("clicked");
            }
        });

}
}
