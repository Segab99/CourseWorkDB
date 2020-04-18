package view.listeners;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;


public class NumericFormatListener implements ChangeListener<String> {
    private final TextField textField;

    public NumericFormatListener(TextField textField) {
        this.textField = textField;
    }
    @Override
    public void changed(ObservableValue<? extends String> observable,
                        String oldValue, String newValue) {
        if (!newValue.matches("\\d+")) {
            textField.setText(newValue.replaceAll("[^\\d]", ""));
        }
    }
}