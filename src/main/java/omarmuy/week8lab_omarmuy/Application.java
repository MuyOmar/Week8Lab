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
public class Application {
    //Describe types of wears
    private Pants pants;
    private Shoes shoes; 
    private Tops tops;
    
    public Application(ClothingFactory factory){
        tops.TypeOfTop();
        pants.TypeOfPants();
        shoes.TypeOfShoes();
    }
    
    public void revealContent(){
        tops.TypeOfTop();
        pants.TypeOfPants();
        shoes.TypeOfShoes();
    }
}
