package src.oop.Sprint3.Övningsuppgifter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;

public class Sprint3FifteenPuzzle extends JFrame {

    // Gör knapparna till instansvariabler för access i andra metoder
    private JButton jb, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10, jb11, jb12, jb13, jb14, jb15, jb16, jb17;

    public Sprint3FifteenPuzzle() {

        // Skapar paneler och knappar
        JPanel jp = new JPanel();
        JPanel jpNorth = new JPanel();
        JPanel jpSouth = new JPanel();

        jb = new JButton("1");
        jb2 = new JButton("2");
        jb3 = new JButton("3");
        jb4 = new JButton("4");
        jb5 = new JButton("5");
        jb6 = new JButton("6");
        jb7 = new JButton("7");
        jb8 = new JButton("8");
        jb9 = new JButton("9");
        jb10 = new JButton("10");
        jb11 = new JButton("11");
        jb12 = new JButton("12");
        jb13 = new JButton("13");
        jb14 = new JButton("14");
        jb15 = new JButton("15");
        jb16 = new JButton("");
        jb17 = new JButton("Nytt spel");

        // Lägg till panelerna och knapparna
        this.add(jp);
        jp.add(jpNorth, BorderLayout.NORTH);
        jp.add(jpSouth, BorderLayout.SOUTH);

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

        // Lägg till layout
        jpNorth.setLayout(new GridLayout(4, 4));

        setSize(400, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Skapar ArrayList och lägger in alla knappar
        ArrayList<JButton> buttonArrayList = getButtonArrayList();

        // Action listener på "Nytt spel"-knappen för att blanda brickorna
        jb17.addActionListener(e -> shuffleTiles(buttonArrayList));

        // Lägg till action listener för att flytta brickor
        for (JButton button : buttonArrayList) {
            button.addActionListener(this::moveTile);
        }
    }

    // Metod för att flytta en bricka vid klick
    private void moveTile(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        ArrayList<JButton> buttonArrayList = getButtonArrayList();
        int clickedIndex = buttonArrayList.indexOf(clickedButton);

        int emptyIndex = getEmptyIndex(buttonArrayList);


        // Kontrollera om klickad knapp är bredvid tomma knappen
        if (isAdjacent(clickedIndex, emptyIndex)) {
            buttonArrayList.get(emptyIndex).setText(clickedButton.getText());
            buttonArrayList.get(emptyIndex).setEnabled(true);
            clickedButton.setText("");
            clickedButton.setEnabled(false);
        }

        //Kollar om man vunnit
        boolean win = true;
        for (int i=0; i<buttonArrayList.size()-1; i++){

            if (!buttonArrayList.get(i).getText().equals(String.valueOf(i+1))){
                win = false;
            }
        }
        if (win) {
           JOptionPane.showMessageDialog(null, "Grattis! du vann.");
        }
    }

    // Ta reda på indexet för den tomma platsen
    private int getEmptyIndex(ArrayList<JButton> buttonArrayList) {
        for (int i=0; i<buttonArrayList.size(); i++){
            if (buttonArrayList.get(i).getText().equals("")){
                return i;
            }
        }
        return 0;
    }

    // Metod för att kontrollera om två knappar är intill varandra i griden
    private boolean isAdjacent(int index1, int index2) {
        int row1 = index1 / 4, col1 = index1 % 4;
        int row2 = index2 / 4, col2 = index2 % 4;
        return (Math.abs(row1 - row2) == 1 && col1 == col2) ||
                (Math.abs(col1 - col2) == 1 && row1 == row2);
    }

    // Metod för att blanda brickorna
    private void shuffleTiles(ArrayList<JButton> buttonArrayList) {
        ArrayList<String> tileValues = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            tileValues.add(String.valueOf(i));
        }
        tileValues.add(""); // Lägg till tom plats
        Collections.shuffle(tileValues);

        // Uppdatera text och aktiveringsstatus på knapparna
        for (int i = 0; i < buttonArrayList.size(); i++) {
            buttonArrayList.get(i).setText(tileValues.get(i));
            buttonArrayList.get(i).setEnabled(!tileValues.get(i).equals(""));
        }
    }

    // Metod för att hämta alla knappar
    private ArrayList<JButton> getButtonArrayList() {
        ArrayList<JButton> buttonArrayList = new ArrayList<>();
        buttonArrayList.add(jb);
        buttonArrayList.add(jb2);
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
        return buttonArrayList;
    }

    public static void main(String[]args) {
        new Sprint3FifteenPuzzle();
    }
}
