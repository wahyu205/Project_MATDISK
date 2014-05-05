import javax.swing.*;
public class Faktorial
{
    public static void main (String[]arguments)
    {
        long fakt;
        fakt=1;
        int a=Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka: "));
        for (int i=1; i<=a; i++)
        {
            fakt*=i;
            System.out.println ("faktorial dari: "+i+" adalah " +fakt);
        }
    }
