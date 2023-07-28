package Real_estate_agency;

import javax.swing.*;

public class Main_agency {
    public static void main(String[] args) {
        Agency agency= new Agency();

        agency.setAddress(JOptionPane.showInputDialog("Enter the address: "));
        agency.setAgentName(JOptionPane.showInputDialog("Enter the agent name: "));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Enter price: ")));
        JOptionPane.showMessageDialog(null,"Name the agency "+agency.getAgentName());

    }
}
