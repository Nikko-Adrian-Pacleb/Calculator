/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author nikko
 */
public class CalculatorFunctions extends javax.swing.JFrame{
    private double firstNumber;
    private boolean firstNumberEmpty;
    private double secondNumber;
    private char operation;
    private double result;
    private boolean haveDecimal;
    private boolean resultInitiated;
    
    //Setters Getters
    public double getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public boolean isFirstNumberEmpty() {
        return firstNumberEmpty;
    }
    public void setFirstNumberEmpty(boolean firstNumberEmpty) {
        this.firstNumberEmpty = firstNumberEmpty;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public char getOperation() {
        return operation;
    }
    public void setOperation(char operation) {
        this.operation = operation;
    }
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
    public boolean isHaveDecimal() {
        return haveDecimal;
    }
    public void setHaveDecimal(boolean haveDecimal) {
        this.haveDecimal = haveDecimal;
    }
    public boolean isResultInitiated() {
        return resultInitiated;
    }
    public void setResultInitiated(boolean resultInitiated) {
        this.resultInitiated = resultInitiated;
    }
    //Functions
    /**
     * Add this function to "window activated" method 
     */
    void defaultVariables(){
        this.firstNumberEmpty = true;
        this.operation = ' ';
        this.haveDecimal = false;
        this.resultInitiated = false;
    }
    /**
     * Add this function to = method
     * @param text Value within FieldView
     * @param base Base of the number in FieldView
     */
    void computeResult(String text, int base){
        this.resultInitiated = true;
        if(base == 10){
            this.secondNumber = Double.parseDouble(text);
        }
        else{
            this.secondNumber = Integer.parseInt(text, base);
        }
        switch (this.operation) {
            case '+' -> {
                this.result = this.firstNumber + this.secondNumber;
            }
            case '-' -> {
                this.result = this.firstNumber - this.secondNumber;
            }
            case '*' -> {
                this.result = this.firstNumber * this.secondNumber;
            }
            case '/' -> {
                this.result = this.firstNumber / this.secondNumber;
            }
            default -> {
            }
        }
    }
    /**
     * Add this function to arithmetic methods
     * @param text Value within FieldView
     * @param base Base of the number in FieldView
     */
    boolean artithetic(String text, int base){
        if(this.isFirstNumberEmpty()){
            if(base == 10){
                this.firstNumber = Double.parseDouble(text);
            }
            else{
                this.firstNumber = Integer.parseInt(text, base);
            }
            this.setFirstNumberEmpty(false);
            this.haveDecimal = false;
            return true;
        }
        return false;
    }
}
