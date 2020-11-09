import java.awt.*; 
import java.awt.event.*;
 import java.applet.*;
/* <applet code="ButtonE" width=250 height=150>
 </applet> */
public class ButtonE extends Applet implements ActionListener 
{ 
String msg="";
public void init()
 { 
Button yes = new Button("Yes");
Button no = new Button("No");
Button maybe = new Button("Undecided");
add(yes); 
add(no); 
add(maybe);
yes.addActionListener(this);
 no.addActionListener(this); 
maybe.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
 { 
String str=ae.getActionCommand();
if(str.equals("Yes"))
 { 
setBackground(Color.red);
msg="You pressed Yes.";
 } 
else if(str.equals("No"))
 { 
setBackground(Color.yellow);
msg="You pressed No."; 
} 
else
 {
setBackground(Color.green);
 msg="You pressed Undecided.";
 }
repaint();
}
public void paint(Graphics g) 
{ 
g.drawString(msg, 6, 100); 
}
}