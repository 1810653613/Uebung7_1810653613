package Aufgabe2;

import javax.swing.*;
import java.sql.SQLOutput;

public class Aufgabe2 {

    public static void main(String[] args)
    {
        eingabe();

    }
      public static void eingabe() {

          try {
          int a = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl ein"));

          System.out.println(a);
      }catch (NumberFormatException z)
      {
          eingabe();
      }
    }
}
