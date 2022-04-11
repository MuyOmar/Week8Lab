/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarmuy.week8lab_omarmuy;

/**
 *
 * @author ramoy
 */
public class CasualFactory implements ClothingFactory{
// Implement all abstract methods for casual factory 
   
    @Override
    public Pants typeOfPant() {
        return new CasualPants();
    }

    @Override
    public Shoes typeOfShoe() {
        return new CasualShoes();
    }

    @Override
    public Tops typeOfTop() {
        return new CasualTop();
    }
    
    
}
