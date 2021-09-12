import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics; 

public class faceapplet extends Applet implements ActionListener {
    

    TextField t1 = new TextField(10);  
    TextField t2 = new TextField(10);  
    TextField t3 = new TextField(10);
    TextField t4 = new TextField(10); 
       
    Label l1 = new Label("MARK 1:");  
    Label l2 = new Label("MARK 2:");  
    Label l3 = new Label("MARK 3:");  
    Label l4 = new Label("AVERAGE IS");  
    Button b = new Button("CHECK FACE");  

    public void init(){

       
        l1.setBounds(0,50,100,20);
        t1.setBounds(120,50,100,20);
        l2.setBounds(0,75,100,20);
        t2.setBounds(120,75,250,20);
        l3.setBounds(0,100,100,20);
        t3.setBounds(120,100,40,20);
        l4.setBounds(0,125,100,20);
        t4.setBounds(120,125,40,20);
        b.setBounds(0,150,100,20);     
                  
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(b);        
        b.addActionListener(this);   





    
        
    }
    public void actionPerformed(ActionEvent e){

        int a=0;
        int c=0;
        int d=0;
        int Total=0;
        a= Integer.parseInt(t1.getText());
        c= Integer.parseInt(t2.getText());
        d= Integer.parseInt(t3.getText());
        if(e.getSource()==b){

            Total=(a+c+d)/3;
            t4.setText(String.valueOf(Total));
        }



    }

    @Override
    public void paint(Graphics g){
       
        int a=0;
        int c=0;
        int d=0;
        int Total=0;
        a= Integer.parseInt(t1.getText());
        c= Integer.parseInt(t2.getText());
        d= Integer.parseInt(t3.getText());
        Total=(a+c+d)/3; 
        if(Total > 50)

{
g.setColor(Color.orange);
g.fillOval(0,0,300,300);
g.setColor(Color.RED);
g.fillOval(80,75,30,30);//happy face
g.fillOval(190,75,30,30);
g.setColor(Color.black);
g.fillArc (75,100,150,150,0,-180);
        }
else
{

g.setColor(Color.orange);
g.fillOval(0,0,300,300);
g.setColor(Color.red );
g.fillOval(80,75,30,30);//sad face
g.fillOval(190,75,30,30);
g.setColor(Color.black);
g.drawArc(75,150,150,150,0,180);

        }
    }}
/* 
<applet code="faceapplet.class" width="400" height="400" border="2"> 
</applet> 
*/ 