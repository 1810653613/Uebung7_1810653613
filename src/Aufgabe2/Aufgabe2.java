package Aufgabe2;

import javax.swing.*;
import java.sql.SQLOutput;

public class Aufgabe2 {

    public static void main(String[] args)
    {
      try {
          int a = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl ein"));

          System.out.println(a);
      }catch (NumberFormatException z)
      {
          System.out.println("Hierbei handelt es sich leider um keine Zahl. Versuchen sie es bitte erneut");
      }
    }
}
