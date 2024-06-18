import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{

  Label l1,l2,l3;
  List lst1,lst2;
  TextField t1;
  Button b1,b2,b3,b4,b5,b6;
  demo()
  {
    setVisible(true);
    setSize(500,600);
    setLayout(null);
    l1=new Label("all product");
    l2=new Label("selected product");
    l3=new Label("enter product");
    lst1=new List(10);
    lst1.add("pen");
    lst1.add("pencil");
    lst1.add("eraser");
    lst1.add("notebook");
    lst1.add("books");
    lst1.add("marker");
    lst2=new List(10);
    t1=new TextField(20);
    b1=new Button(">>");
    b2=new Button(">");
    b3=new Button("<<");
    b4=new Button("<");
    b5=new Button("add");
    b6=new Button("remove");
    l1.setBounds(50,50,100,50);
    add(l1);
   l2.setBounds(250,50,100,50);
    add(l2);
  lst1.setBounds(50,100,100,150);
   add(lst1);
  lst2.setBounds(250,100,100,150);
   add(lst2);
  b1.setBounds(180,120,20,20);
   add(b1);
  b2.setBounds(180,150,20,20);
   add(b2);
  b3.setBounds(180,180,20,20);
   add(b3);
  b4.setBounds(180,210,20,20);
   add(b4);
 l3.setBounds(50,300,100,50);
    add(l3);
 t1.setBounds(150,310,200,30);
    add(t1);
 b5.setBounds(100,400,50,30);
   add(b5);
 b6.setBounds(200,400,50,30);
   add(b6);
 b1.addActionListener(this);
 b2.addActionListener(this); 
  b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
 b6.addActionListener(this); 
  }
 public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
  {
    for(int i=0;i<lst1.countItems();i++)
    {
      lst2.add(lst1.getItem(i));
    }
  }
  if(ae.getSource()==b2)
 {
    lst2.add(lst1.getSelectedItem()); 
 }
 if(ae.getSource()==b3)
  {
    for(int i=0;i<lst2.countItems();i++)
    {
      lst1.add(lst2.getItem(i));
    }
  }
  if(ae.getSource()==b4)
 {
    lst1.add(lst2.getSelectedItem()); 
 }
 if(ae.getSource()==b5)
 {
   String s=t1.getText();
    lst2.add(s);
 }
 if(ae.getSource()==b6)
 {
   
    lst2.remove(lst2.getSelectedItem());
 }
}
  public static void main(String[] abc)
 {
    new demo();
 }
 
}