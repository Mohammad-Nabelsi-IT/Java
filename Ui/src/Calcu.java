import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Calcu extends JFrame {
    private JTextField tf;
    private JButton[] btnNumbers;
    private JButton btnDot;
    private JButton btnEqual;
    private JButton[] btnOperation;
    private String selectedOperation; //+ - * /.
    private double firstNumber;
    private boolean hasOperation;
    private JButton btnPN;
    private JButton btnClear;
    private JButton btnClearAll;
    private JButton btnBackSpace;


    public Calcu(String title) {
        super(title);
        this.setBounds(1000, 100, 350, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {


            URL url = new URL("https://reyer-group.com/wp-content/uploads/2021/05/reyer_mustang_yellow_1920x1280.jpg");
            ImageIcon iconUrl=new ImageIcon(url);
            ImageIcon icon = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\calculator.png");
            this.setIconImage(iconUrl.getImage());
            ImageIcon iconBack = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\back.png");


            JPanel panelN = new JPanel();
            this.getContentPane().add(panelN, BorderLayout.NORTH);

            JMenuBar menuBar = new JMenuBar();
            this.setJMenuBar(menuBar);

            JMenu menu = new JMenu("Option");
            menuBar.add(menu);

            JMenuItem menuItemHelp = new JMenuItem("Help");
            menu.add(menuItemHelp);
            JMenuItem menuItemExit = new JMenuItem("Exit");
            menuItemExit.addActionListener(e -> {
                System.exit(0);
            });
            menu.add(menuItemExit);


            tf = new JTextField("0");
            tf.setFont(new Font("Arial", Font.BOLD, 25));
            tf.setHorizontalAlignment(JTextField.RIGHT);
            tf.setPreferredSize(new Dimension(300, 50));
            tf.setEditable(false);
            panelN.add(tf);
            //////////////////////////

            JPanel panelCenter = new JPanel(new BorderLayout());
            this.getContentPane().add(panelCenter);

            JPanel panelNorth = new JPanel(new GridLayout(1, 4, 3, 3));
            panelNorth.setPreferredSize(new Dimension(350, 60));

            btnPN = new JButton("+/-");
            btnPN.setFont(new Font("Arial", Font.BOLD, 24));
            btnPN.setBorder(BorderFactory.createRaisedBevelBorder());
            btnPN.setBackground(new Color(230, 230, 230));
            panelNorth.add(btnPN);

            btnPN.addActionListener(e -> {
                double d = Double.parseDouble(tf.getText());
                d = -d;
                tf.setText(d + "");
            });

            btnClear = new JButton("CE");
            btnClear.setFont(new Font(" Arial", Font.BOLD, 24));
            btnClear.setBorder(BorderFactory.createRaisedBevelBorder());
            btnClear.setBackground(new Color(230, 230, 230));
            panelNorth.add(btnClear);
            btnClear.addActionListener(e -> tf.setText("0"));

            btnClearAll = new JButton("C");
            btnClearAll.setFont(new Font("Arial", Font.BOLD, 24));
            btnClearAll.setBorder(BorderFactory.createRaisedBevelBorder());
            btnClearAll.setBackground(new Color(230, 230, 230));
            panelNorth.add(btnClearAll);
            btnClearAll.addActionListener(e -> {
                tf.setText("0");
                firstNumber = 0;
                selectedOperation = null;
                hasOperation = false;

            });

            btnBackSpace = new JButton(iconBack);
            btnBackSpace.addActionListener(e -> {
                String txt = tf.getText();
                tf.setText(txt.substring(0, txt.length() - 1));
                if (tf.getText().equals("")) tf.setText("0");
            });

            btnBackSpace.setFont(new Font("Arial", Font.BOLD, 24));
            btnBackSpace.setBorder(BorderFactory.createRaisedBevelBorder());
            btnBackSpace.setBackground(new Color(230, 230, 230));
            panelNorth.add(btnBackSpace);

            panelCenter.add(panelNorth, BorderLayout.NORTH);
            ///////////////////////

            JPanel panelC = new JPanel(new GridLayout(4, 3, 3, 3));
            panelCenter.add(panelC);

            btnNumbers = new JButton[10];
            for (int i = 9; i >= 0; i--) {
                btnNumbers[i] = new JButton(i + "");
                btnNumbers[i].addActionListener(e -> {
                    if (tf.getText().equals("0") || hasOperation) {
                        tf.setText(e.getActionCommand());
                        hasOperation = false;
                    } else {
                        tf.setText(tf.getText() + e.getActionCommand());
                    }
                });
                btnNumbers[i].setFont(new Font("Arial", Font.BOLD, 25));
                btnNumbers[i].setBorder(BorderFactory.createRaisedBevelBorder());
                btnNumbers[i].setBackground(new Color(230, 230, 230));
                panelC.add(btnNumbers[i]);
            }

            ////////////////////////////////////////////

            btnDot = new JButton(".");

            btnDot.setFont(new Font("Arial", Font.BOLD, 25));
            btnDot.setBorder(BorderFactory.createRaisedBevelBorder());
            btnDot.setBackground(new Color(230, 230, 230));
            panelC.add(btnDot);
            btnDot.addActionListener(e -> {
                if (tf.getText().indexOf(".") == -1) {
                    tf.setText(tf.getText() + ".");
                }

                // if (!tf.getText().contains(".")){
                //     tf.setText(tf.getText()+ ".");
                //}
            });

            //////////////////////////////////////////////////

            btnEqual = new JButton("=");
            btnEqual.addActionListener(e -> {

                double n2 = Double.parseDouble(tf.getText());
                if (selectedOperation != null) {
                    switch (selectedOperation) {
                        case "+":
                            tf.setText((firstNumber + n2) + "");
                            break;

                        case "-":
                            tf.setText((firstNumber - n2) + "");
                            break;

                        case "*":
                            tf.setText((firstNumber * n2) + "");
                            break;

                        case "/":
                            tf.setText((firstNumber / n2) + "");
                            break;

                    }
                }
            });
            btnEqual.setFont(new Font("Arial", Font.BOLD, 25));
            btnEqual.setBorder(BorderFactory.createRaisedBevelBorder());
            btnEqual.setBackground(new Color(230, 230, 230));
            panelC.add(btnEqual);

            //////////////////////////////////////////////////

            JPanel panelE = new JPanel(new GridLayout(4, 1, 3, 3));
            panelE.setPreferredSize(new Dimension(80, 300));
            panelCenter.add(panelE, BorderLayout.EAST);
            btnOperation = new JButton[4];
            String[] op = {"/", "*", "-", "+"};
            for (int i = 0; i < op.length; i++) {
                btnOperation[i] = new JButton(op[i]);
                btnOperation[i].addActionListener(e -> {
                    firstNumber = Double.parseDouble(tf.getText());
                    selectedOperation = e.getActionCommand();
                    hasOperation = true;
                });
                btnOperation[i].setFont(new Font("Arial", Font.BOLD, 25));
                btnOperation[i].setBorder(BorderFactory.createRaisedBevelBorder());
                btnOperation[i].setBackground(new Color(230, 230, 230));
                panelE.add(btnOperation[i]);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Calcu calcu = new Calcu("Test1");
        calcu.setVisible(true);
    }
}


//import javax.swing.*;
//        import java.awt.*;
//
//public class Calcu extends JFrame {
//    private JTextField tf;
//    private JButton[] btnNumbers;
//    private JButton btnDot;
//    private JButton btnEqual;
//    private JButton[] btnOperation;
//    private String selectedOperation; //+ - * /.
//    private double firstNumber;
//    private boolean hasOperation;
//    private JButton btnPercent;
//    private JButton btnClear;
//    private JButton btnClearAll;
//    private JButton btnBackSpace;
//
//
//    public Calcu(String title) {
//        super(title);
//        this.setBounds(1000, 100, 350, 400);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panelN = new JPanel();
//        this.getContentPane().add(panelN, BorderLayout.NORTH);
//
//        tf = new JTextField("0");
//        tf.setFont(new Font("Arial", Font.BOLD, 25));
//        tf.setHorizontalAlignment(JTextField.RIGHT);
//        tf.setPreferredSize(new Dimension(300, 50));
//        tf.setEditable(false);
//        panelN.add(tf);
//
//        ///////////////////////
//
//        JPanel panelC = new JPanel(new GridLayout(4, 3, 3, 3));
//        this.getContentPane().add(panelC);
//
//        btnNumbers = new JButton[10];
//        for (int i = 9; i >= 0; i--) {
//            btnNumbers[i] = new JButton(i + "");
//
//            btnNumbers[i].addActionListener(e -> {
//                if (tf.getText().equals("0") || hasOperation) {
//                    tf.setText(e.getActionCommand());
//                    hasOperation = false;
//                } else {
//                    tf.setText(tf.getText() + e.getActionCommand());
//                }
//            });
//            btnNumbers[i].setFont(new Font("Arial", Font.BOLD, 25));
//            btnNumbers[i].setBorder(BorderFactory.createRaisedBevelBorder());
//            btnNumbers[i].setBackground(new Color(230, 230, 230));
//            panelC.add(btnNumbers[i]);
//        }
//
//        ////////////////////////////////////////////
//
//        btnDot = new JButton(".");
//        btnDot.setFont(new Font("Arial", Font.BOLD, 25));
//        btnDot.setBorder(BorderFactory.createRaisedBevelBorder());
//        btnDot.setBackground(new Color(230, 230, 230));
//        panelC.add(btnDot);
//
//        //////////////////////////////////////////////////
//
//        btnEqual = new JButton("=");
//        btnEqual.addActionListener(e -> {
//
//            double n2 = Double.parseDouble(tf.getText());
//            switch (selectedOperation){
//                case "+":
//                    tf.setText((firstNumber+n2)+"");
//                    break;
//
//                case "-":
//                    tf.setText((firstNumber-n2)+"");
//                    break;
//
//                case "*":
//                    tf.setText((firstNumber*n2)+"");
//                    break;
//
//                case "/":
//                    tf.setText((firstNumber/n2)+"");
//                    break;
//
//            }
//        });
//        btnEqual.setFont(new Font("Arial", Font.BOLD, 25));
//        btnEqual.setBorder(BorderFactory.createRaisedBevelBorder());
//        btnEqual.setBackground(new Color(230, 230, 230));
//        panelC.add(btnEqual);
//
//        //////////////////////////////////////////////////
//
//        JPanel panelE = new JPanel(new GridLayout(4, 1, 3, 3));
//        panelE.setPreferredSize(new Dimension(80, 300));
//        this.getContentPane().add(panelE, BorderLayout.EAST);
//        btnOperation = new JButton[4];
//        String[] op = {"/", "*", "-", "+"};
//        for (int i = 0; i < op.length; i++) {
//            btnOperation[i] = new JButton(op[i]);
//            btnOperation[i].addActionListener(e -> {
//                firstNumber = Double.parseDouble(tf.getText());
//                selectedOperation = e.getActionCommand();
//                hasOperation = true;
//            });
//            btnOperation[i].setFont(new Font("Arial", Font.BOLD, 25));
//            btnOperation[i].setBorder(BorderFactory.createRaisedBevelBorder());
//            btnOperation[i].setBackground(new Color(230, 230, 230));
//            panelE.add(btnOperation[i]);
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        Calcu calcu = new Calcu("Test1");
//        calcu.setVisible(true);
//    }
//}
