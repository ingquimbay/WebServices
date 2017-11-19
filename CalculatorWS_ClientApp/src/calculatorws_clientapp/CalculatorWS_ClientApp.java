/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_clientapp;

/**
 *
 * @author carlitos
 */
public class CalculatorWS_ClientApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 8;
            int result = add(x, y);
            System.out.println("Adding 5 + 8 = " + result);
            result = substract(x, y);
            System.out.println("Substracting 5 - 8 = " + result);
            result = multiply(x, y);
            System.out.println("Multiplying 5 * 8 = " + result);
            result = divide(x, y);
            System.out.println("Dividing 5 / 8 = " + result);
        } catch (Exception e) {
            System.out.println("Exception " + e );
        }

    }

    private static int add(int a, int b) {
        com.example.calculator.CalculatorWS_Service service = new com.example.calculator.CalculatorWS_Service();
        com.example.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(a, b);
    }

    private static int divide(int a, int b) {
        com.example.calculator.CalculatorWS_Service service = new com.example.calculator.CalculatorWS_Service();
        com.example.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.divide(a, b);
    }

    private static int multiply(int a, int b) {
        com.example.calculator.CalculatorWS_Service service = new com.example.calculator.CalculatorWS_Service();
        com.example.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.multiply(a, b);
    }

    private static int substract(int a, int b) {
        com.example.calculator.CalculatorWS_Service service = new com.example.calculator.CalculatorWS_Service();
        com.example.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.substract(a, b);
    }

}
