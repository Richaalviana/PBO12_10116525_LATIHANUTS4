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
public class ModelDesigner extends ModelEmployee {
    int bonus = 50000;
    public void BonusDesigner(int bonus, float salary){
        System.out.println("Salary Employee Designer = "+salary);
        System.out.println("Bonus Designer = "+bonus);
    }
}