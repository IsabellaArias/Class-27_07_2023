package Person;

import javax.swing.JOptionPane;

public class Main_Person {
    public static void main(String[] args) {
        Person person= new Person();
        person.setName(JOptionPane.showInputDialog("Enter the name: "));
        System.out.println(person.getName());
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter age: ")));
        System.out.println(person.getAge());

        Person person1= new Person();
        person1.name= "Diego";
    }
}
