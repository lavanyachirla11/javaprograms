import java.awt.*;
import java.applet.*;
/*<applet code="Life.class" height=150 width=300>
</applet>*/
public class LifeCycleOfApplet extends Applet
{
String msg=" ";
public void init()
{
msg=msg+" init ";
}
public void start()
{
msg=msg+" start ";
}
public void stop()
{
msg=msg+" stop ";
}
public void destroy()
{
msg=msg+" destroy ";
}
public void paint(Graphics g)
{
Font f =new Font("Arial",Font.BOLD,30);
setBackground(Color.white);
g.setFont(f);
g.drawString(msg,200,250);
}
}

