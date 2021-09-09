import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvents1 extends Applet implements MouseListener, MouseMotionListener
{
String msg = "";
TextField text=new TextField(20);
public void init()
{
setLayout(new FlowLayout(FlowLayout.RIGHT));
add(text);
addMouseListener(this);
addMouseMotionListener(this);
setBackground(Color.RED);
}

// Handle mouse clicked.
public void mouseClicked(MouseEvent me)
{
text.setText("Mouse Click at " + me.getX() + "," +me.getY());
repaint();
}

// Handle mouse entered.
public void mouseEntered(MouseEvent me)
{
msg = "Mouse entered.";
repaint();
}

// Handle mouse exited.
public void mouseExited(MouseEvent me) { }

// Handle button pressed.
public void mousePressed(MouseEvent me) { }

// Handle button released.
public void mouseReleased(MouseEvent me) { }

// Handle mouse dragged.
public void mouseDragged(MouseEvent me) { }

// Handle mouse moved.
public void mouseMoved(MouseEvent me)
{
msg="Moving mouse at " + me.getX() + "," +me.getY();
repaint();
}

public void paint(Graphics g)
{
g.drawString(msg,20,20);
g.setColor(Color.blue);

}
}

/*
<applet code="MouseEvents1" width=300 height=100>
</applet>
*/
