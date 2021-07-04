import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public abstract class MyKidsSet {

    private String kidsId, furName;
    private double price;
    public MyKidsSet()
    {
        kidsId = "";
        furName = "";
        price = 0.0;
    }

    public MyKidsSet(double p) {
        price = p;
    }
    public MyKidsSet(String newId, String newFurName, double newPrice)
    {
        kidsId = newId;
        furName = newFurName;
        price = 0.0;
    }



}
