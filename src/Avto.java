import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Avto extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        avto(g);
    }

    private void avto(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        g.setStroke(new BasicStroke(6f)); //толщина линии
        GeneralPath k = new GeneralPath();
        k.moveTo(241, 607);
        k.curveTo(238, 491, 401, 494, 392, 607);
        k.lineTo(584, 607);
        k.curveTo(583, 492, 737, 495, 737, 603);
        k.lineTo(825, 603);
        k.curveTo(859, 582, 839, 555, 839, 555);
        k.curveTo(842, 442, 687, 446, 687, 446);
        k.curveTo(589, 298, 308, 283, 211, 446);
        k.curveTo(167, 498, 170, 539, 170, 539);
        k.curveTo(155, 552, 153, 558, 153, 558);
        k.curveTo(153, 558, 141, 584, 179, 607);
        k.closePath();

        GeneralPath oz = new GeneralPath();
        oz.moveTo(248, 445);
        oz.lineTo(413, 445);
        oz.lineTo(413, 359);
        oz.curveTo(413, 359, 309, 366, 248, 445);

        GeneralPath op = new GeneralPath();
        op.moveTo(643, 445);
        op.curveTo(643, 445, 559, 344, 440, 359);
        op.lineTo(440, 445);
        op.closePath();

        GeneralPath fara = new GeneralPath();
        fara.moveTo(814, 517);
        fara.quadTo(760, 526, 750, 480);
        fara.curveTo(750, 480, 800, 470, 814, 517);

        Ellipse2D kolz = new Ellipse2D.Double(253, 534, 127, 127);
        Ellipse2D kolz2 = new Ellipse2D.Double(289, 569, 56, 56);
        Ellipse2D kolp = new Ellipse2D.Double(598, 534, 127, 127);
        Ellipse2D kolp2 = new Ellipse2D.Double(633, 569, 56, 56);

        Rectangle2D ruch=new Rectangle2D.Double(448,477,41,6);

        g.setColor(Color.orange);
        g.fill(k);
        g.setColor(Color.black);
        g.draw(k);

        g.setColor(Color.WHITE);
        g.fill(oz);
        g.setColor(Color.black);
        g.draw(oz);

        g.setColor(Color.WHITE);
        g.fill(op);
        g.setColor(Color.black);
        g.draw(op);

        g.setColor(Color.WHITE);
        g.fill(fara);
        g.setColor(Color.black);
        g.draw(fara);

        g.fill(ruch);

        g.fill(kolz);
        g.setColor(Color.WHITE);
        g.fill(kolz2);
        g.setColor(Color.black);
        g.fill(kolp);
        g.setColor(Color.WHITE);
        g.fill(kolp2);
    }
}
