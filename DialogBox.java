import javax.swing.JOptionPane;
class DialogBox
{
public static void main(String args[])
{
int a= Integer.parseInt(JOptionPane.showInputDialog("a="));
int b= Integer.parseInt(JOptionPane.showInputDialog("b="));
JOptionPane.showMessageDialog(null,"sum="+(a+b));
}
}