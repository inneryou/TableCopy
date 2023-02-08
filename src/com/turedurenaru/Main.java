package src.com.turedurenaru;

import java.awt.*;
import java.awt.event.InputEvent;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Main{

  public static void main(String[] args){
    // MainFrame mainFrame = new MainFrame("Table Copy");
    // mainFrame.setVisible(true);
    JFrame frame = new JFrame("HTML Text Area");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
    Container content = frame.getContentPane();
    JEditorPane editorPane = new JEditorPane();
    editorPane.setContentType("text/html");
    editorPane.setText("<html><body><h1><span style='color:red;'>Hello World!</span></h1></body></html>");
    content.add(new JScrollPane(editorPane), BorderLayout.CENTER);
    frame.setSize(300, 300);
    frame.setVisible(true);

    try {
      Robot robot = new Robot();
      robot.delay(1000);
      robot.mouseMove(200,200);
      robot.delay(1000);
      robot.mouseMove(450,200);
      robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
       robot.delay(500);
      robot.mouseMove(600,600);
       robot.delay(500);
      robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    } catch (AWTException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}