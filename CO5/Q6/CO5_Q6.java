
import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class CO5_Q6 extends Applet implements ItemListener {

    Choice choice1;
    int Select; 
    

    public void init()
    {

         setBackground(Color.YELLOW);
         Label l1;
         l1 = new Label("***Select And Draw Shape ***");    
         l1.setBounds(30, 100, 100, 30);    
        choice1 = new Choice();
        choice1.addItem("Select a Shape");
        choice1.addItem("Rectangle");
        choice1.addItem("Square");
        choice1.addItem("Circle");
        choice1.addItem("Triangle");
        add(choice1);
        choice1.addItemListener(this);
        choice1.setBackground(Color.yellow);
        choice1.setBounds(70,500,500,100);
        add(l1);
    }

 public void itemStateChanged (ItemEvent e)
    {
         
         Select = choice1.getSelectedIndex();
         repaint();
    }

 public void paint(Graphics g)
	{
g.setColor(Color.red);  
         super.paint(g);

         if (Select == 1)
         {  
             
             g.drawRect(20, 40, 200, 40);
         }
         if (Select == 2)
         {
        	 g.drawRect(100,100,50,50);
         }
         if (Select == 3)
         {
             
             g.drawOval(150,150,100,100);
         }
         if (Select ==4)
         {
        	 g.drawLine(120, 130, 280, 130);
             g.drawLine(120, 130, 200, 65);
             g.drawLine(200, 65, 280, 130);
         }
	}
}

/* 
<applet code="CO5_Q6.class" width="500" height="500" border="2"> 
</applet> 
*/  