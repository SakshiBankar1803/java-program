import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements MouseListener
{
  TextField t1;
  demo()
 {
   setVisible(true);
   setSize(500,600);
   setLayout(new FlowLayout());
   t1=new TextField(30);
   add(t1);
 addMouseListener(this);
 }
 public void mouseExited(MouseEvent me)
{
  t1.setText("mouse exited");
}
public void mouseEntered(MouseEvent me)
{
  t1.setText("mouse entered");
}
public void mouseReleased(MouseEvent me)
{
  t1.setText("mouse relesed");
}
public void mousePressed(MouseEvent me)
{
  t1.setText("mouse pressed");
}
public void mouseClicked(MouseEvent me)
{
  t1.setText("mouse clicked");
int x=me.getX();
int y=me.getY();
t1.setText("x pos="+x+"\typos="+y);
}
 public static void main(String abc[])
 {
   new demo();
 }
}
