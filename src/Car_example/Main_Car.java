package Car_example;

import javax.swing.*;

public class Main_Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlate(JOptionPane.showInputDialog("Enter the plate: "));
        car.setColor(JOptionPane.showInputDialog("Enter color: "));
        car.setModel(Integer.parseInt(JOptionPane.showInputDialog("Model: ")));
        JOptionPane.showMessageDialog(null,"the plate is"+car.getPlate());
    }
}
