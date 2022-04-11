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
public class PartyFactory implements ClothingFactory{

    @Override
    public Pants typeOfPant() {
        return new PartyPants();
    }

    @Override
    public Shoes typeOfShoe() {
        return new PartyShoes();
    }

    @Override
    public Tops typeOfTop() {
        return new PartyTop();
    }
    
}
