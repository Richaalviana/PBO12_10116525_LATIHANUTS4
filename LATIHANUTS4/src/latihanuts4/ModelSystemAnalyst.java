/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuts4;

/**
 *
 * @author detun-nuist
 */
public class ModelSystemAnalyst extends ModelEmployee {
    int bonus = 90000;
    public void BonusSystemAnalyst(int bonus, float salary){
        System.out.println("Salary Employee System Analyst = "+salary);
        System.out.println("Bonus System Analyst = "+bonus);
    } 
}