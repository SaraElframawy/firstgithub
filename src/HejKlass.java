import javax.swing.*;
import java.util.*;
public class HejKlass {
    public static void main(String[] args){
        System.out.println("hej klassen");
        String age = JOptionPane.showInputDialog("hUR GAMMAL ÄR ?");
        JOptionPane.showMessageDialog(null,"age is "+age);
        JOptionPane.showMessageDialog(null,"Hello world");
        JOptionPane.showConfirmDialog(null, "Är du säker");
        var scan = new Scanner (System.in);
        System.out.println("Hur gammal är du?");
        int year = scan.nextInt();
        int g = Integer.parseInt(age)+year;
        System.out.println(g);



    }
}
