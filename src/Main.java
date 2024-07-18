import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Автомобиль");
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new Avto());
        frame.setVisible(true);
    }
}
