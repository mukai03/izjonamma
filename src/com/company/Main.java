package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame window = new JFrame();
        JPanel panel = new  JPanel(new GridBagLayout());
        window.add(panel);

        JLabel label = new JLabel("Изжөнамма");
        panel.add(label);

        JTextField textField = new JTextField(32);
        panel.add(textField);

        JButton button = new JButton("Издөө");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=%D0%BF%D0%BE%D0%B3%D0%BE%D0%B4%D0%B0&rlz=1C1GGRV_enKG837KG837&oq=%D0%BF%D0%BE%D0%B3%D0%BE&aqs=chrome.0.0l2j69i57j0l3.10901j1j7&sourceid=chrome&ie=UTF-8&dlnr=1&sei=CgIZYtWKG4L4qwGJ5IvoBg" +textField.getText()));
                }   catch (IOException ex) {
                        ex.printStackTrace();
                }   catch (URISyntaxException ex) {
                        ex.printStackTrace();
                }
            }
        });
        window.setVisible(true);
        window.setSize(400,400);
    }
}
