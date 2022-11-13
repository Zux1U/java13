package homework.homework5_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football {

    private static int cnt1;
    private static int cnt2;

    public static void main(String args[]) {
        JFrame frame = new JFrame("Real vc Milan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430, 300);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(430, 300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        panel.add(button1);
        panel.add(button2);
        JLabel label1 = new JLabel("Result: " + cnt1 + "X" + cnt2);
        JLabel label2 = new JLabel("Last Scorer: N/A");
        JLabel label3 = new JLabel("Winner: DRAW");
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cnt1++;
                label1.setText("Result: " + cnt1 + " X " + cnt2);
                label2.setText("Last Scorer: AC Milan");
                if (cnt1 > cnt2) {
                    label3.setText("Winner: AC Milan");
                }
                else if (cnt2 > cnt1) {
                    label3.setText("Winner: Real Madrid");
                }
                else{
                    label3.setText("Winner: DRAW");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cnt2++;
                label1.setText("Result: " + cnt1 + " X " + cnt2);
                label2.setText("Last Scorer: Real Madrid");
                if (cnt2 > cnt1) {
                    label3.setText("Winner: Real Madrid");
                }
                else if (cnt1 > cnt2) {
                    label3.setText("Winner: AC Milan");
                }
                else{
                    label3.setText("Winner: DRAW");
                }
            }
        });
    }
}
