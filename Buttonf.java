import java.awt.*; 
import java.awt.event.*;
 
public class Buttonf 
{ 
  public static void main(String[] args) 
{
  Frame frame=new Frame("Button Frame");
  Button button = new Button("Submit"); 
  frame.add(button); 
  frame.setLayout(new FlowLayout());
  frame.setSize(200,100);
  frame.setVisible(true);
    }
}