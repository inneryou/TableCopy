package src.com.turedurenaru;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener{
  private InputArea inputArea;
  private OutputArea outputArea;
 public MainFrame(String title){
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle(title);
  this.setBounds(200,200,600,400);

  JPanel mainPanel = new JPanel();
  mainPanel.setLayout(new GridLayout(1,2));

  inputArea = new InputArea();
  outputArea = new OutputArea();

  mainPanel.add(inputArea);
  mainPanel.add(outputArea);

  JButton buttonTrans = new JButton("変換");
  buttonTrans.addActionListener(this);
  getContentPane().add(BorderLayout.SOUTH,buttonTrans);
  getContentPane().add(BorderLayout.CENTER,mainPanel);

 }

  @Override
  public void actionPerformed(ActionEvent e) {
    String str1 = inputArea.getText();
    String result = TextTransform.inputText(str1);
    outputArea.setText(result);
  }

}
