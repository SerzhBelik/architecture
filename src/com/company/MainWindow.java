package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainWindow extends JFrame implements ClientUI {

    private Controller controller;
    final static int WIDTH = 600;
    final static int HEIGHT = 800;

    JTextField textField = new JTextField();
    JPanel panel = new JPanel();
    JTextArea inputText = new JTextArea(1, 30);
    JButton enter = new JButton("Enter");
    JScrollPane jsp = new JScrollPane(inputText);
    JScrollPane jspTextArea = new JScrollPane(textField);

    public MainWindow(Controller controller) {
        this.controller = controller;
        setTitle("Insurance calculate");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(Toolkit.getDefaultToolkit ().getScreenSize ().width/2-WIDTH/2,
                Toolkit.getDefaultToolkit ().getScreenSize ().height/2-HEIGHT/2, WIDTH, HEIGHT);
        setResizable(false);

        getContentPane().add(textField, BorderLayout.NORTH);
        textField.setText("Для рассчета стоимости полиса добавьте как минимум одного водителя");
        textField.setHorizontalAlignment(JTextField.CENTER);

        getContentPane().add(panel, BorderLayout.CENTER);




//        textArea.setEditable(false);
//        textArea.setLineWrap(true);
//        textArea.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, new Color(150, 200, 150)));
//        textArea.setBackground(new Color(250, 255, 250));
//
//        jspTextArea.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//        jspTextArea.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
//
//        inputText.setLineWrap(true);
//        inputText.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//
//                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//                    e.consume();
//
//                }
//            }
//        });
//
//        jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//        enter.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                       //FIXME
//            }
//        });
//
//        setLayout(new BorderLayout());
//        add(jspTextArea, BorderLayout.CENTER);
//        add(panel, BorderLayout.SOUTH);
//
//        panel.setLayout(new BorderLayout());
//        panel.add(jsp, BorderLayout.CENTER);
//        panel.add(enter, BorderLayout.EAST);
//        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        setVisible(true);
//


    }
    @Override
    public void showUI() {
        setVisible(true);
    }
}
