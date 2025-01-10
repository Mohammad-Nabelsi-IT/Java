import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Random;

public class PaintFrame extends JFrame {
    private JButton buttonLine, buttonRect, buttonOval, buttonColor,
            buttonPointer, buttonPencil, buttonEraser, buttonPaint,
            buttonCut, buttonCupy, buttonPaste, buttonText,
            buttonForGroundColor, buttonBackGroundColor, buttonsqr, buttonCircle;
    private JButton[] colorsArray;
    private PaintPanel paintPanel;
    private ArrayList<MyShape> shapes;
    private String selectedType = "Line";
    private boolean fillShape = true;
    private int x1, x2, y1, y2, shapeStrokwidth;
    private String selectedColorButton = "for";


    public PaintFrame(String title) {

        shapes = new ArrayList<>();
        setBounds(400, 150, 700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(Frame.MAXIMIZED_BOTH);

        ImageIcon iconLine = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\line.png");
        ImageIcon iconSqr = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\check-box-empty.png");
        ImageIcon iconOval = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\oval.png");
        ImageIcon iconPointer = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\pointer.png");
        ImageIcon iconPencil = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\pencil.png");
        ImageIcon iconEraser = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\eraser.png");
        ImageIcon iconPaint = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\paint.png");
        ImageIcon iconPaint1 = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\paint1.png");
        ImageIcon iconCut = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\cut.png");
        ImageIcon iconCupy = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\document.png");
        ImageIcon iconPaste = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\clipboard.png");
        ImageIcon iconRect = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\rectangle.png");
        ImageIcon iconCircle = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\Circle.png");
        ImageIcon iconText = new ImageIcon("C:\\java\\java-level-one\\MyPaintProgram\\src\\text.png");


        JToolBar toolBar = new JToolBar("tool1");
        toolBar.setPreferredSize(new Dimension(0, 150));
        this.getContentPane().add(toolBar, BorderLayout.NORTH);

        Dimension dimension = new Dimension(40, 40);
        Border border = BorderFactory.createLineBorder(Color.GRAY);


        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        JMenuItem menuItemNew = new JMenuItem("New");
        menuFile.add(menuItemNew);
        menuItemNew.addActionListener(e -> {
            shapes.clear();
            paintPanel.repaint();
        });
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(e -> System.exit(0));
        menuFile.addSeparator();
        menuFile.add(menuItemExit);


        JMenu menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);


        JPanel panelClipBoard = new JPanel();
        panelClipBoard.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black)
                , "Clipboard", TitledBorder.CENTER, TitledBorder.BOTTOM));
        toolBar.add(panelClipBoard);

        buttonCut = new JButton();
        buttonCut.setContentAreaFilled(false);
        buttonCut.setIcon(iconCut);
        panelClipBoard.add(buttonCut);

        buttonCupy = new JButton();
        buttonCupy.setContentAreaFilled(false);
        buttonCupy.setIcon(iconCupy);
        panelClipBoard.add(buttonCupy);

        buttonPaste = new JButton();
        buttonPaste.setContentAreaFilled(false);
        buttonPaste.setIcon(iconPaste);
        panelClipBoard.add(buttonPaste);

        toolBar.addSeparator();

        JPanel panelShapes = new JPanel();
        panelShapes.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black)
                , "Shapes", TitledBorder.CENTER, TitledBorder.BOTTOM));
        toolBar.add(panelShapes);

        buttonLine = new JButton();
        buttonLine.setActionCommand("Line");
        buttonLine.setIcon(iconLine);
        buttonLine.addActionListener(e -> {
            selectedType = e.getActionCommand();
            paintPanel.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        });

        buttonRect = new JButton();
        buttonRect.setIcon(iconRect);
        buttonRect.addActionListener(e -> {
            selectedType = "Rect";
            paintPanel.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        });

        buttonOval = new JButton();
        buttonOval.setIcon(iconOval);
        buttonOval.addActionListener(e -> {
            selectedType = "Oval";
            paintPanel.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        });
        buttonCircle = new JButton();
        buttonCircle.setIcon(iconCircle);
        buttonCircle.addActionListener(e -> {
            selectedType = "Circle";
            paintPanel.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        });
        buttonsqr = new JButton();
        buttonsqr.setIcon(iconSqr);
        buttonsqr.addActionListener(e -> {
            selectedType = "Square";
            paintPanel.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        });

        buttonPointer = new JButton();
        buttonPointer.setIcon(iconPointer);

        buttonPencil = new JButton();
        buttonPencil.addActionListener(e -> {
            selectedType = "Pencil";
            paintPanel.setCursor(Toolkit.getDefaultToolkit().createCustomCursor
                    (iconPencil.getImage(), new Point(10,10), "pen"));
        });
        buttonPencil.setIcon(iconPencil);

        buttonEraser = new JButton();
        buttonEraser.addActionListener(e -> {
            selectedType = "Eraser";
            paintPanel.setCursor(Toolkit.getDefaultToolkit().createCustomCursor
                    (iconEraser.getImage(), new Point(0, 0), "Eraser"));
        });
        buttonEraser.setIcon(iconEraser);

        buttonPaint = new JButton();
        buttonPaint.setIcon(iconPaint);
        buttonPaint.addActionListener(e->{
            paintPanel.setCursor(Toolkit.getDefaultToolkit().createCustomCursor
                    (iconPaint.getImage(), new Point(0, 0), "Fill"));
            paintPanel.setBackground(buttonBackGroundColor.getBackground());
        });

        buttonText = new JButton();
        buttonText.addActionListener(e -> {
            selectedType = "Text";
            paintPanel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        });
        buttonText.setIcon(iconText);

        buttonPointer.addActionListener(e -> paintPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)));
        panelShapes.add(buttonPointer);
        panelShapes.add(buttonPencil);
        panelShapes.add(buttonPaint);
        panelShapes.add(buttonEraser);
        panelShapes.add(buttonLine);
        panelShapes.add(buttonRect);
        panelShapes.add(buttonOval);
        panelShapes.add(buttonCircle);
        panelShapes.add(buttonsqr);
        panelShapes.add(buttonText);

        for (Component component : panelShapes.getComponents()) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.setPreferredSize(dimension);
                button.setBorder(border);
                button.setContentAreaFilled(false);
            }
        }

        String[] thikness = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "20", "50"};
        JComboBox<String> comboBox = new JComboBox<>(thikness);
        comboBox.setPreferredSize(new Dimension(100, 50));
        panelShapes.add(comboBox);
        comboBox.addItemListener(e -> {
            String selectedItem = e.getItem().toString();
            shapeStrokwidth = Integer.parseInt(selectedItem);
        });

        JCheckBox fillcheckBox = new JCheckBox("Fill");
        fillcheckBox.setSelected(fillShape);
        panelShapes.add(fillcheckBox);
        fillcheckBox.addActionListener(e -> {
            fillShape = fillcheckBox.isSelected();
        });


        toolBar.addSeparator();


        JPanel panelColors = new JPanel();
        panelColors.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black)
                , "Colors", TitledBorder.CENTER, TitledBorder.BOTTOM));
        toolBar.add(panelColors);

        buttonForGroundColor = new JButton();
        buttonBackGroundColor = new JButton();
        buttonForGroundColor.setBackground(Color.black);
        buttonBackGroundColor.setBackground(Color.white);
        buttonForGroundColor.setPreferredSize(new Dimension(50, 120));
        buttonBackGroundColor.setPreferredSize(new Dimension(50, 120));
        panelColors.add(buttonForGroundColor);
        panelColors.add(buttonBackGroundColor);

        buttonForGroundColor.addActionListener(e -> {
            selectedColorButton = "for";
        });
        buttonBackGroundColor.addActionListener(e -> {
            selectedColorButton = "back";
        });

        JPanel panelColorGrid = new JPanel(new GridLayout(2, 6, 2, 2));
        panelColorGrid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        colorsArray = new JButton[12];
        Color[] selectdColors = {Color.white, Color.BLACK, Color.BLUE, Color.RED, Color.PINK
                , Color.CYAN, Color.yellow, Color.orange, Color.GREEN, Color.DARK_GRAY, Color.GRAY, Color.magenta};
        Random random = new Random();
        for (int i = 0; i < colorsArray.length; i++) {
            colorsArray[i] = new JButton();
            // int r =random.nextInt(255);
            //  int g =random.nextInt(255);
            // int b =random.nextInt(255);
            colorsArray[i].setPreferredSize(new Dimension(30, 30));
            colorsArray[i].setBorder(border);
            //colorsArray[i].setBackground(new Color(r,g,b));
            colorsArray[i].setBackground(selectdColors[i]);
            panelColorGrid.add(colorsArray[i]);

            colorsArray[i].addActionListener(e -> {
                JButton b = (JButton) e.getSource();
                if (selectedColorButton.equals("for")) {
                    buttonForGroundColor.setBackground(b.getBackground());
                } else {
                    buttonBackGroundColor.setBackground(b.getBackground());

                }
            });
        }
        panelColors.add(panelColorGrid);


        buttonColor = new JButton();
        buttonColor.setContentAreaFilled(false);
        buttonColor.setPreferredSize(new Dimension(80, 80));
        buttonColor.setIcon(iconPaint1);
        panelColors.add(buttonColor);
        buttonColor.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(null, "Choose Color", Color.BLUE);
            if (selectedColorButton.equals("for")) {
                buttonForGroundColor.setBackground(selectedColor);
            } else {
                buttonBackGroundColor.setBackground(selectedColor);
            }
        });

        paintPanel = new PaintPanel();
        paintPanel.addMouseListener(paintPanel);
        paintPanel.addMouseMotionListener(paintPanel);
        paintPanel.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        paintPanel.setBackground(Color.white);
        this.getContentPane().add(paintPanel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new PaintFrame("Painting").setVisible(true);
    }

    class PaintPanel extends JPanel implements MouseListener, MouseMotionListener {

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            System.out.println("inside paint component");
            Graphics2D graphics2D = (Graphics2D) g;

            for (MyShape shape : shapes) {
                int w = shape.x2 - shape.x1;
                int h = shape.y2 - shape.y1;
                graphics2D.setStroke(new BasicStroke(shape.strokWidth));

                switch (shape.type) {
                    case "Text":
                        if (shape.text != null) {
                            System.out.println(shape.text);
                            graphics2D.setColor(shape.forGroundColor);
                            graphics2D.setFont(new Font("Tahoma", Font.BOLD, shapeStrokwidth));
                            graphics2D.drawString(shape.text, shape.x1, shape.y1);
                        }
                        break;

                    case "Square":
                        h = w;
                    case "Rect":
                        Rectangle2D rectangle2D = new Rectangle2D.Float(shape.x1, shape.y1, w, h);
                        graphics2D.setColor(shape.backGroundColor);
                        if (shape.fill) graphics2D.fill(rectangle2D);
                        graphics2D.setColor(shape.forGroundColor);
                        graphics2D.draw(rectangle2D);
                        break;

                    case "Circle":
                        h = w;

                    case "Oval":
                        Ellipse2D ellipse2D = new Ellipse2D.Float(shape.x1, shape.y1, w, h);
                        graphics2D.setColor(shape.backGroundColor);
                        if (shape.fill) graphics2D.fill(ellipse2D);
                        graphics2D.setColor(shape.forGroundColor);
                        graphics2D.draw(ellipse2D);
                        break;

                    case "Line":
                        Line2D line2D = new Line2D.Float(shape.x1, shape.y1, shape.x2, shape.y2);
                        graphics2D.setColor(shape.forGroundColor);
                        graphics2D.draw(line2D);
                        break;

                    case "Pencil":
                    case "Eraser":
                        Ellipse2D rectangle2D2 = new Ellipse2D.Float(shape.x1, shape.y1, shape.strokWidth, shape.strokWidth);
                        graphics2D.setColor(shape.forGroundColor);
                        graphics2D.fill(rectangle2D2);
                        break;

//                    Line2D line2D2 = new Line2D.Float(shape.x1,shape.y1,shape.x1 + shape.strokWidth,shape.y1 + shape.strokWidth);
////                        graphics2D.setColor(shape.forGroundColor);
////                        graphics2D.draw(line2D2);
////                        break;


                }
            }


        }

        @Override
        public void mouseClicked(MouseEvent e) {

            if (selectedType.equals("Text")) {
                String msg = JOptionPane.showInputDialog(null, "Enter Your Text");
                MyShape shape = new MyShape();
                shape.type = selectedType;
                shape.text = msg;
                shape.forGroundColor = buttonForGroundColor.getBackground();
                shape.strokWidth = shapeStrokwidth;
                shape.x1 = e.getX();
                shape.y1 = e.getY();
                shapes.add(shape);
                paintPanel.repaint();

            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();

            MyShape shape = new MyShape();
            shape.type = selectedType;
            shape.backGroundColor = buttonBackGroundColor.getBackground();
            shape.forGroundColor = buttonForGroundColor.getBackground();
            shape.strokWidth = shapeStrokwidth;
            shape.x1 = x1;
            shape.y1 = y1;
            if (x1 < x2 && y1 > y2) {
                shape.x2 = x2;
                shape.y2 = shape.y1;
                shape.y1 = y2;
            } else if (x1 > x2 && y1 > y2) {
                shape.x2 = shape.x1;
                shape.x1 = x2;
                shape.y2 = shape.y1;
                shape.y1 = y2;
            } else if (x1 > x2 && y1 < y2) {
                shape.x2 = shape.x1;
                shape.x1 = x2;
                shape.y2 = y2;
            } else {
                shape.x2 = x2;
                shape.y2 = y2;
            }
            shape.fill = fillShape;
            shapes.add(shape);
            paintPanel.repaint();
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (selectedType.equals("Pencil") || selectedType.equals("Eraser")) {


                MyShape shape = new MyShape();
                shape.type = selectedType;
                if (selectedType.equals("Eraser")) {
                    shape.forGroundColor = Color.white;
                } else {
                    shape.forGroundColor = buttonForGroundColor.getBackground();
                }
                shape.strokWidth = shapeStrokwidth;
                shape.x1 = e.getX();
                shape.y1 = e.getY();
                shape.fill = fillShape;
                shapes.add(shape);
                paintPanel.repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    class BtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            selectedType = e.getActionCommand();
            System.out.println(e.getActionCommand());
        }


    }
}

class MyShape {
    String text;
    Color backGroundColor;
    Color forGroundColor;

    String type;

    int strokWidth;

    int x1, x2, y1, y2;

    boolean fill;


}
