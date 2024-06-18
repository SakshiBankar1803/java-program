import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements KeyListener
{
  TextField t1;
  demo()
 {
   setVisible(true);
   setSize(500,600);
   setLayout(new FlowLayout());
   t1=new TextField(30);
   t1.setFont(new Font("Times New Roman",Font.BOLD,30));
   add(t1);
 t1.addKeyListener(this);
 }
 public void keyPressed(KeyEvent ke)
{
 setBackground(Color.cyan); 
 setTitle("key presssed");
}
public void keyReleased(KeyEvent ke)
{
  setTitle("key releaseed");
}
public void keyTyped(KeyEvent ke)
{
  setTitle("key typed");
}
 public static void main(String abc[])
 {
   new demo();
 }
}
