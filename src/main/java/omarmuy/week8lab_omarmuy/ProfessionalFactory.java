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
public class ProfessionalFactory implements ClothingFactory {

    @Override
    public Pants typeOfPant() {
        return new ProPants();
    }

    @Override
    public Shoes typeOfShoe() {
        return new ProShoes();
    }

    @Override
    public Tops typeOfTop() {
        return new ProTop();
    }

}
