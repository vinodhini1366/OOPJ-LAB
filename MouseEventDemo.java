import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {

    String message = "";
    int x = 50, y = 100;

    public MouseEventDemo() {
        // Set frame properties
        setTitle("AWT Mouse Event Demo");
        setSize(400, 200);
        setVisible(true);

        // Add mouse listeners to the Frame
        addMouseListener(this);
        addMouseMotionListener(this);

        // Add window close functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // MouseListener methods

    @Override
    public void mouseClicked(MouseEvent me) {
        message = "Mouse Clicked at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
        message = "Mouse Pressed at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        message = "Mouse Released at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        message = "Mouse Entered the Frame at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent me) {
        message = "Mouse Exited the Frame at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

    // MouseMotionListener methods

    @Override
    public void mouseDragged(MouseEvent me) {
        message = "Mouse Dragged at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        message = "Mouse Moved at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

    // Override paint method to display message
    public void paint(Graphics g) {
        g.drawString(message, x, y);
    }

    // Main method
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}