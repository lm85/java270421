package itstep;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

public class MyBarPanel extends JPanel {

    JRadioButton od1;
    JRadioButton od2;
    JRadioButton od3;
    JRadioButton od4;
    int noQ=-1;
    public MyBarPanel() {


        this.setAlignmentX(CENTER_ALIGNMENT);
        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));

        createButtons(this);

}

    private void createButtons(JPanel panel) {

        JPanel panel1 = new JPanel();
        JButton btn3 = new JButton("...");
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

                int returnValue = jfc.showOpenDialog(null);


                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = jfc.getSelectedFile();

                    Quiz.file=((File) selectedFile).getAbsolutePath();
                    Quiz.loadfile();
                    System.err.println(((File) selectedFile).getAbsolutePath());

                }

            }
        });
        panel1.setPreferredSize(new Dimension(480, 40));
        panel1.setMaximumSize(new Dimension(480, 40));

        panel1.add(btn3);
        add(panel1);

        repaint();



        JPanel panel2 = new JPanel();

        od1= new JRadioButton();
        od2 = new JRadioButton();
        od3 = new JRadioButton();
        od4 = new JRadioButton();

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

                ArrayList<String>  questions = Quiz.getAswer(++noQ);

               od1.setText(questions.get(0));
               od2.setText(questions.get(1));
               od3.setText(questions.get(2));
               od4.setText(questions.get(3));
               od1.repaint();

            }
        });


}
}
