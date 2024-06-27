import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what ur name: ");
        System.out.println("ur name is:"+name);
        JOptionPane.showMessageDialog(null,"hello: "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("ur age:"));
        JOptionPane.showMessageDialog(null,"ur age: "+age);
        System.out.println("ur age: "+age);
        double mark = Double.parseDouble(JOptionPane.showInputDialog("what your marks: "));
        JOptionPane.showMessageDialog(null,"your marks: "+mark);
        System.out.println("your mark: "+mark);
    }
}
