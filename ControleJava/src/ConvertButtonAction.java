import javax.swing.*;
import java.awt.event.ActionEvent;

public class ConvertButtonAction extends AbstractAction {

    private FahrenheitToCelsius fahrenheitToCelsius;

    public ConvertButtonAction(String text, FahrenheitToCelsius fahrenheitToCelsius){

        super(text);
        this.fahrenheitToCelsius = fahrenheitToCelsius;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fahrenheitToCelsius.setResultLabel(fahrenheitToCelsius.conversion(fahrenheitToCelsius.getValueFromTextField()) + " Fahrenheit");
    }
}
