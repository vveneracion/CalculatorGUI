import java.util.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class CalculatorFrame extends JFrame{ //implements ActionListener{

    private static final long serialVersionUID = 1L;
    private JPanel mainPanel = new JPanel();
    private JPanel northPanel = new JPanel();
    private JPanel southPanel = new JPanel();

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 500;

    private static JButton[] numButtons = new JButton[4];

    private static final int CALCULATE_ROWS = 13;
    private static final int CALCULATE_COLUMNS = 10;

    private JTextField calculation;

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

        calculation = new JTextField(CALCULATE_ROWS);
        calculation.setHorizontalAlignment(SwingConstants.RIGHT);
        northPanel.add(calculation, BorderLayout.CENTER);

    }

    public void createSouthPanel(){

        //southPanel.setLayout(new BorderLayout());

        JPanel first = createFirstRow();
        JPanel second = createSecondRow();
        JPanel third = createThirdRow();
        JPanel fourth = createFourthRow();

        JPanel buttons = new JPanel(new GridLayout(1, 4, 10, 0));

        JButton clear = new JButton("C");

        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");

        JButton dot = new JButton(".");
        JButton equals = new JButton("=");

        southPanel.add(buttons, BorderLayout.CENTER);
                    

    }

    public JPanel createFirstRow(){

        JPanel firstRow = new JPanel(new GridLayout(1, 4, 10, 0));
        for(int i = 0; i < numButtons.length; i++){
            numButtons[i] = new JButton("" + i+1);
            firstRow.add(numButtons[i]);
        }

        return firstRow;

    }

    public JPanel createSecondRow(){

        JPanel secondRow = new JPanel(new GridLayout(1, 4, 10, 0));
        for(int i = 0; i < numButtons.length; i++){
            numButtons[i] = new JButton("" + i+5);
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
        
    }
}
