

import
javax.swing.*;

import
java.awt.*;

import
java.awt.event.*;

public
class Interfaz {

public static void main(String[] args) {

JFrame frame =
new JFrame("Cálculo de Determinantes");

final JLabel label = new JLabel("Programa para el Cálculo de Determinantes");

frame.getContentPane().add(label);

frame.setSize(new Dimension(300,300));

frame.setDefaultCloseOperation(JFrame.
EXIT_ON_CLOSE);

frame.addWindowListener(
new java.awt.event.WindowAdapter(){

public void windowClosing(WindowEvent e){

System.exit(0);

}

}

);

frame.pack();

frame.setVisible(
true);

}

}
