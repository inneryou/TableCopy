package src.com.turedurenaru;

import java.awt.*;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Main{

  public static void main(String[] args){
    // MainFrame mainFrame = new MainFrame("Table Copy");
    // mainFrame.setVisible(true);
    JFrame frame = new JFrame("HTML Text Area");
    Container content = frame.getContentPane();
    JEditorPane editorPane = new JEditorPane();
    editorPane.setContentType("text/html");
    editorPane.setText("<html><body><h1><span style='color:red;'>Hello World!</span></h1></body></html>");
    content.add(new JScrollPane(editorPane), BorderLayout.CENTER);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}