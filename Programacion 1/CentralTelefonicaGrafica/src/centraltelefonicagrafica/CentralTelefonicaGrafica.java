/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraltelefonicagrafica;


import Vista.Login;


/**
 *
 * @author sauld
 */
public class CentralTelefonicaGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //   TODO code application logic here
//        PanelLlamadas p = new PanelLlamadas();
//        p.setVisible(true);
//        p.setLocationRelativeTo(null);
//        ModeloDatos m = ModeloDatos.getInstance();
//        m.connectar();
//        DB_Eventos db = new DB_Eventos();
//        System.out.println(db.returnIDMax() + 1); 
        Vista.Login l = new Login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
//        

    }

}
