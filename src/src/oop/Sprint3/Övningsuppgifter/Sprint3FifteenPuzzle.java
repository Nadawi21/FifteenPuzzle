package src.oop.Sprint3.Övningsuppgifter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Sprint3FifteenPuzzle extends JFrame {

    public Sprint3FifteenPuzzle() {
        
//Skapar paneler och knappar

    JPanel jp = new JPanel();
    JPanel jpNorth = new JPanel();
    JPanel jpSouth = new JPanel();

    JButton jb = new JButton ("1");
    JButton jb2 = new JButton ("2");
    JButton jb3 = new JButton ("3");
    JButton jb4 = new JButton ("4");
    JButton jb5 = new JButton ("5");
    JButton jb6 = new JButton ("6");
    JButton jb7 = new JButton ("7");
    JButton jb8 = new JButton ("8");
    JButton jb9 = new JButton ("9");
    JButton jb10 = new JButton ("10");
    JButton jb11 = new JButton ("11");
    JButton jb12 = new JButton ("12");
    JButton jb13 = new JButton ("13");
    JButton jb14 = new JButton ("14");
    JButton jb15 = new JButton ("15");
    JButton jb16 = new JButton (" ");
    JButton jb17 = new JButton ("Nytt spel");

//lägger till panelen och knapparna


        this.add(jp);
        jp.add(jpNorth,BorderLayout.NORTH);
        jp.add(jpSouth,BorderLayout.SOUTH);

    jpNorth.add(jb);
    jpNorth.add(jb2);
    jpNorth.add(jb3);
    jpNorth.add(jb4);
    jpNorth.add(jb5);
    jpNorth.add(jb6);
    jpNorth.add(jb7);
    jpNorth.add(jb8);
    jpNorth.add(jb9);
    jpNorth.add(jb10);
    jpNorth.add(jb11);
    jpNorth.add(jb12);
    jpNorth.add(jb13);
    jpNorth.add(jb14);
    jpNorth.add(jb15);
    jpNorth.add(jb16);
    jpSouth.add(jb17);
    
//Lägger till layout
        jpNorth.setLayout(new GridLayout(4,4));
       // jpSouth.setLayout(new FlowLayout());

        setSize(400, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//Skapar arraylist och lägger in alla knappar
        
        
 ArrayList<JButton> buttonArrayList = new ArrayList<>();

   buttonArrayList.add(jb);
   buttonArrayList.add(jb3);
   buttonArrayList.add(jb4);
   buttonArrayList.add(jb5);
   buttonArrayList.add(jb6);
   buttonArrayList.add(jb7);
   buttonArrayList.add(jb8);
   buttonArrayList.add(jb9);
   buttonArrayList.add(jb10);
   buttonArrayList.add(jb11);
   buttonArrayList.add(jb12);
   buttonArrayList.add(jb13);
   buttonArrayList.add(jb14);
   buttonArrayList.add(jb15);
   buttonArrayList.add(jb16);
   buttonArrayList.add (jb17);
        
}
    public static void main(String[] args){
        Sprint3FifteenPuzzle inl = new Sprint3FifteenPuzzle();
    }
}
