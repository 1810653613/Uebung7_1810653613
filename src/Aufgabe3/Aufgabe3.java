package Aufgabe3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3
{
    public static void main (String[]args)
    {
    try{
        emailcheck();
        System.out.println("Dies ist eine richtige Emailadresse");
    }catch(Exception e)
    {
        e.printStackTrace();
        System.out.println("Diese Email-Adresse ist nicht gültig");
    }
    }



    public static boolean emailcheck() throws Exception{

    String email= JOptionPane.showInputDialog("Geben sie bitte ihre Email-Adresse an");

    Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
    Matcher m = pattern.matcher(email);
    if(!m.find())throw new Exception();

    return m.find();
    }
}
