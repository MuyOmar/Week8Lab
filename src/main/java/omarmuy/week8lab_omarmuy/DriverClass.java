/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarmuy.week8lab_omarmuy;

/**
 *
 * @author Omar Muy
 * Driver Class method
 */
public class DriverClass {
    
    private static Application configureApplication(){
        Application app;
        ClothingFactory factory;
        
        String testS = "The invitation is for a casual meeting";
        
        if(testS.contains("casual")){
            factory = new CasualFactory();
            app = new Application(factory);
        }
        else if(testS.contains("professional")){
            factory = new ProfessionalFactory();
            app = new Application(factory);
        }
        else if(testS.contains("party")){
            factory = new PartyFactory();
            app = new Application(factory);
        }
    }
    
    public static void main(String[] args) {
        Application app = configureApplication();
        app.revealContent();
    }

}
