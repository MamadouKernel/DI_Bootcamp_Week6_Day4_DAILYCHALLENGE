/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.dailychallengeweek6day4.challenge;

/**
 *
 * @author ezekielkouassi
 */
public class Calculator {
    // write class fields here
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        //write definition here
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        //write definition here
        return this.num1 + this.num2;
    }

    public double subtract() {
        //write definition here
        return this.num1 - this.num2;
    }

    public double multiply() {
        //write definition here
        return this.num1 * this.num2;
    }

    public double divide() {
        //write definition here
        return this.num1 / this.num2;
    }

}
