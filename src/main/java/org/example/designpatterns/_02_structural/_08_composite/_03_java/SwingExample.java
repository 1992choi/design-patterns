package org.example.designpatterns._02_structural._08_composite._03_java;

import javax.swing.*;

public class SwingExample {

    public static void main(String[] args) {
        /*
            JFrame, JTextField, JButton 클래스 모두 최상위는 Component 클래스를 사용하고 있다.
         */
        JFrame frame = new JFrame();

        JTextField textField = new JTextField();
        textField.setBounds(200, 200, 200, 40);
        frame.add(textField);

        JButton button = new JButton("click");
        button.setBounds(200, 100, 60, 40);
        button.addActionListener(e -> textField.setText("Hello Swing"));
        frame.add(button);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }


}
