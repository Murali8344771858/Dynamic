import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class swing1 extends JFrame implements ActionListener
{
 JLabel l1;
 swing1()
 {
  JFrame frame=new JFrame("My Frame");
  JButton b1=new JButton("click");
  l1=new JLabel();
  b1.setBounds(100,50,250,100);
  l1.setBounds(150,75,300,100);
  frame.add(b1);
  b1.addActionListener(this);
  frame.add(l1);
  frame.setSize(300,300);
  frame.setVisible(true);
  frame.setLayout(null);
 }
  public void actionPerformed(ActionEvent e)
    {
      l1.setText("hi i am click");
     }
    public static void main(String args[])
   {
    new swing1();
   }
}