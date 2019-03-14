import java.awt.*;
import java.awt.event.ActionEvent;


import javax.swing.*;

public class FahrenheitToCelsius extends JFrame {

    private JLabel      celsiusLabel;
    private JTextField  textField;
    private JButton     convertButton;
    private JLabel      resultLabel;

    public FahrenheitToCelsius() {

        super();
        build();
        addComponents();
    }


    private void build() {

        setTitle("Convert Celsius to Fahrenheit");
        setSize(400, 120);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponents() {

        JPanel contentPanel = (JPanel)this.getContentPane();

        textField       = new JTextField();
        celsiusLabel    = new JLabel("Celsius");
        convertButton   = new JButton();
        resultLabel     = new JLabel(" - Fahrenheit");

        contentPanel.setLayout(new GridLayout(2, 2));

        contentPanel.add(textField);
        contentPanel.add(celsiusLabel);
        contentPanel.add(convertButton);
        contentPanel.add(resultLabel);

        convertButton.setAction(new ConvertButtonAction("Convert", this));
    }

    public int conversion(int celsius){
        double c = (double)celsius;
        double r = (1.8 * celsius) + 32;
        return (int)r;
    }

    public int getValueFromTextField(){
        return Integer.parseInt(textField.getText());
    }

    public void setResultLabel(String value){
        resultLabel.setText(value);
    }


}