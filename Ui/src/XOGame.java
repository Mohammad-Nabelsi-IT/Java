import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;

public class XOGame extends JFrame {
    JButton[][] gameArray;
    String player = "x";

    public XOGame(String title) {
        super(title);
        setBounds(400, 150, 350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new GridLayout(3, 3, 10, 10));

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu jMenu=new JMenu("File");
        menuBar.add(jMenu);

        JMenuItem menuItem=new JMenuItem("New");
        menuItem.addActionListener(e -> {
            for (JButton bArr[] : gameArray){
                for (JButton b : bArr){
                    b.setText("");
                    b.setEnabled(true);
                    b.setBackground(Color.green);
                }
            }
        });
        jMenu.add(menuItem);

        JMenuItem menuItemOpen=new JMenuItem("Open");
        jMenu.addSeparator();
        JMenuItem menuItemExit=new JMenuItem("Exit");
        jMenu.add(menuItemExit);
        menuItemExit.addActionListener(e -> System.exit(0));

        JMenu menuEdit=new JMenu("Edit");
        menuBar.add(menuEdit);

        JMenuItem menuItem1 = new JMenuItem("Copy");
        JMenuItem menuItem2 = new JMenuItem("Cut");
        JMenuItem menuItem3 = new JMenuItem("Paste");

        menuEdit.add(menuItem1);
        menuEdit.add(menuItem2);
        menuEdit.addSeparator();
        menuEdit.add(menuItem3);

        gameArray = new JButton[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameArray[i][j] = new JButton("");
                gameArray[i][j].setFont(new Font("Arial", Font.PLAIN, 25));
                gameArray[i][j].setHorizontalAlignment(JLabel.CENTER);
                gameArray[i][j].setBackground(Color.green);
                this.getContentPane().add(gameArray[i][j]);

                gameArray[i][j].addActionListener(e -> {
                    JButton btn = (JButton) e.getSource();
                    if (e.getActionCommand().equals("")) {
                        btn.setText(player);
                        btn.setBackground(Color.gray);
                        if (checkWinner()) {
                            JOptionPane.showMessageDialog(null, "Congratulations");
                            for (JButton buttons[] : gameArray) {
                                for (JButton buttonx : buttons) {
                                    if (buttonx.getText().equals(""))
                                        buttonx.setEnabled(false);
                                }
                            }
                        }
                        if (gameOver()) {
                            JOptionPane.showMessageDialog(null, "GAME OVER");
                        }


                        if (player.equals("x")) player = "o";
                        else player = "x";
                    }
                });
            }

        }

    }

    public static void main(String[] args) {
        XOGame game = new XOGame("X O Game");
        game.setVisible(true);
    }

    private boolean checkWinner() {
        if (gameArray[0][0].getText().equals(player) && gameArray[0][1].getText().equals(player) && gameArray[0][2].getText().equals(player))
            return true;
        else if (gameArray[1][0].getText().equals(player) && gameArray[1][1].getText().equals(player) && gameArray[1][2].getText().equals(player))
            return true;
        else if (gameArray[2][0].getText().equals(player) && gameArray[2][1].getText().equals(player) && gameArray[2][2].getText().equals(player))
            return true;
        else if (gameArray[0][0].getText().equals(player) && gameArray[1][0].getText().equals(player) && gameArray[2][0].getText().equals(player))
            return true;
        else if (gameArray[0][1].getText().equals(player) && gameArray[1][1].getText().equals(player) && gameArray[2][1].getText().equals(player))
            return true;
        else if (gameArray[0][2].getText().equals(player) && gameArray[1][2].getText().equals(player) && gameArray[2][2].getText().equals(player))
            return true;
        else if (gameArray[0][0].getText().equals(player) && gameArray[1][1].getText().equals(player) && gameArray[2][2].getText().equals(player))
            return true;
        else if (gameArray[2][0].getText().equals(player) && gameArray[1][1].getText().equals(player) && gameArray[0][2].getText().equals(player))
            return true;
        else return false;

    }

    boolean gameOver() {
        for (JButton buttons[] : gameArray) {
            for (JButton buttonx : buttons) {
                if (buttonx.getText().equals(""))
                    return false;
            }
        }
        return true;
    }

}