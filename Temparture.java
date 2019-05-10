

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.*;


public class Temparture extends JFrame {

    private Container c;
   private JLabel inl,outl;
    private JTextArea ta,outta;
    private JButton calculate;// = new JButton();
     private JRadioButton cal,kal,far,outcal,outfar,outkal;
    
    Temparture(){
        
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
         inl=new JLabel("Input:");
        inl.setBounds(100,5, 100, 100);
        c.add(inl);


        outl=new JLabel("Output:");
        outl.setBounds(100,212, 100, 100);
        c.add(outl);
        calculate = new JButton("Calculate");//
        calculate.setBounds(150,300,100,50);
        c.add(calculate);
        ta=new JTextArea();
        ta.setBounds(150,50,100,30);
       ta.setBackground(Color.WHITE);
       
      c.add(ta);
      
      cal=new JRadioButton("Calcius");
      //cal.setBackground(Color.ORANGE);
      cal.setBounds(50,100,100,30);
      c.add(cal);
      
      far=new JRadioButton("Farhanhite");
      //cal.setBackground(Color.ORANGE);
      far.setBounds(50,150,100,30);
      c.add(far);
      
      kal=new JRadioButton("Kalvin");
      //cal.setBackground(Color.ORANGE);
      kal.setBounds(50,200,100,30);
      c.add(kal);
      
       outcal=new JRadioButton("Out.Calcius");
      //cal.setBackground(Color.ORANGE);
      outcal.setBounds(250,100,100,30);
      c.add(outcal);
      
      outfar=new JRadioButton("Out.Farhanhite");
      //cal.setBackground(Color.ORANGE);
      outfar.setBounds(250,150,100,30);
      c.add(outfar);
      
      outkal=new JRadioButton("Out.Kalvin");
      //cal.setBackground(Color.ORANGE);
      outkal.setBounds(250,200,100,30);
      c.add(outkal);
      
      outta=new JTextArea();
        outta.setBounds(150,250,100,30);
       outta.setBackground(Color.WHITE);
       
      c.add(outta);
      
      
    }
    public static void main(String[] args) {
       Temparture t=new Temparture();
        t.setVisible(true);
        t.setBounds(100,50,500,400);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setResizable(true);
        t.setTitle("TextField");
     
    }
    
}
