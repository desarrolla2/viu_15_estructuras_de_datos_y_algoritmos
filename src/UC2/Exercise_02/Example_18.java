package UC2.Exercise_02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example_18 {
    private JPanel panel1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JFormattedTextField formattedTextField3;
    private JFormattedTextField formattedTextField4;
    private JFormattedTextField formattedTextField5;
    private JButton calculateButton;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;

    public Example_18() {

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFormattedTextField[] textFields = getFormattedTextFields();
                JComboBox[] comboBoxes = getComboBoxes();
                Float currentBilling;
                Float totalBilling = 0f;
                Float salesOfProductCode1 = 0f;
                Integer salesGreaterThan600 = 0;
                for (int i = 0; i < 5; i++) {
                    String productCode = comboBoxes[i].getSelectedItem().toString();
                    Float numberOfLiters = 0f;
                    try {
                        numberOfLiters = Float.parseFloat(textFields[i].getText());
                    } catch (Exception e) {

                    }
                    numberOfLiters = Math.round(numberOfLiters * 100f) / 100f;
                    textFields[i].setValue(numberOfLiters.toString());
                    Float price = getPriceByCode(productCode);
                    currentBilling = price * numberOfLiters;
                    totalBilling += currentBilling;
                    if (productCode == "1") {
                        salesOfProductCode1 += numberOfLiters;
                    }
                    if (currentBilling >= 600f) {
                        salesGreaterThan600++;
                    }
                }
                textField6.setText(totalBilling.toString());
                textField7.setText(salesOfProductCode1.toString());
                textField8.setText(salesGreaterThan600.toString());

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example_18");
        frame.setContentPane(new Example_18().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JComboBox[] getComboBoxes() {
        JComboBox[] comboBoxes = new JComboBox[5];
        comboBoxes[0] = comboBox1;
        comboBoxes[1] = comboBox2;
        comboBoxes[2] = comboBox3;
        comboBoxes[3] = comboBox4;
        comboBoxes[4] = comboBox5;
        return comboBoxes;
    }

    private JFormattedTextField[] getFormattedTextFields() {
        JFormattedTextField[] textFields = new JFormattedTextField[5];
        textFields[0] = formattedTextField1;
        textFields[1] = formattedTextField2;
        textFields[2] = formattedTextField3;
        textFields[3] = formattedTextField4;
        textFields[4] = formattedTextField5;

        return textFields;
    }

    private float getPriceByCode(String code) {
        if (code == "1") {
            return 0.6f;
        }
        if (code == "2") {
            return 3f;
        }

        if (code == "3") {
            return 1.25f;
        }

        return 0f;
    }
}
