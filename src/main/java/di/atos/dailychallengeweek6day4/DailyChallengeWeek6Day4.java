/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package di.atos.dailychallengeweek6day4;

import di.atos.dailychallengeweek6day4.challenge.Calculator;

/**
 *
 * @author ezekielkouassi
 */
public class DailyChallengeWeek6Day4 {

    public static void main(String[] args) {
        Calculator obj = new Calculator(10, 94);

        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }
}
