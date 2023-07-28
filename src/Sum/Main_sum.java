package Sum;

import javax.swing.*;

public class Main_sum {

    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.setNumber1(Integer.parseInt(JOptionPane.showInputDialog("Enter the number 1: ")));
        sum.setNumber2(Integer.parseInt(JOptionPane.showInputDialog("Enter the number 2: ")));
        JOptionPane.showMessageDialog(null,"The sum is equal: "+sum.sum());
    }
}
