import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class CalculatorFrame extends JFrame{ //implements ActionListener{

    private static final long serialVersionUID = 1L;
    private JPanel mainPanel = new JPanel();
    private JPanel northPanel = new JPanel();
    private JPanel southPanel = new JPanel();

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;

    private static JButton[] numButtons = new JButton[4];

    private static final int CALCULATE_ROWS = 4;
    private static final int CALCULATE_COLUMNS = 20;

    private JTextArea calculation;

    public CalculatorFrame(){

        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        mainPanel.setLayout(new BorderLayout());
        
        createNorthPanel();
        createSouthPanel();

        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        add(mainPanel);

    }

    public void createNorthPanel(){

        //northPanel.setLayout(new BorderLayout());

        calculation = new JTextArea(CALCULATE_ROWS, CALCULATE_COLUMNS);
        //calculation.setHorizontalAlignment(SwingConstants.RIGHT);
        calculation.setEditable(false);
        northPanel.add(calculation, BorderLayout.CENTER);

    }

    public void createSouthPanel(){

        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.Y_AXIS));

        JPanel first = createFirstRow();
        JPanel second = createSecondRow();
        JPanel third = createThirdRow();
        JPanel fourth = createFourthRow();
        JPanel fifth = createFifthRow();

        southPanel.add(first, Box.createVerticalStrut(10));
        southPanel.add(second, Box.createVerticalStrut(10));
        southPanel.add(third, Box.createVerticalStrut(10));
        southPanel.add(fourth, Box.createVerticalStrut(10));
        southPanel.add(fifth, Box.createVerticalStrut(10));
                    

    }

    public JPanel createFirstRow(){

        JPanel firstRow = new JPanel(new GridLayout(1, 4, 10, 0));
        for(int i = 0; i < numButtons.length; i++){
            int num = i+1;
            String str = String.valueOf(num);
            numButtons[i] = new JButton(str);
            firstRow.add(numButtons[i]);
        }

        return firstRow;

    }

    public JPanel createSecondRow(){

        JPanel secondRow = new JPanel(new GridLayout(1, 4, 10, 0));
        for(int i = 0; i < numButtons.length; i++){
            int num = i+5;
            String str = String.valueOf(num);
            numButtons[i] = new JButton(str);
            secondRow.add(numButtons[i]);
        }

        return secondRow;

    }

    public JPanel createThirdRow(){

        JPanel thirdRow = new JPanel(new GridLayout(1, 4, 10, 0));

        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");

        thirdRow.add(nine);
        thirdRow.add(zero);
        thirdRow.add(plus);
        thirdRow.add(minus);
        
        return thirdRow;

    }

    public JPanel createFourthRow(){

        JPanel fourthRow = new JPanel(new GridLayout(1, 4, 10, 0));

        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JButton posneg = new JButton("+/-");
        JButton dot = new JButton(".");

        fourthRow.add(multiply);
        fourthRow.add(divide);
        fourthRow.add(posneg);
        fourthRow.add(dot);

        return fourthRow;

    }

    public JPanel createFifthRow(){

        JPanel fifthRow = new JPanel(new GridLayout(1, 4, 10, 0));

        JButton clear = new JButton("C");
        JButton equals = new JButton("=");

        fifthRow.add(clear);
        fifthRow.add(equals);

        return fifthRow;
    }
}
