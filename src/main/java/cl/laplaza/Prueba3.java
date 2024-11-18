/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.laplaza;

import cl.laplaza.dao.DAOPersonal;
import cl.laplaza.model.Personal;

/**
 *
 * @author benja
 */
public class Prueba3 {

    public static void main(String[] args) {
        prueba();
    }
    
    public static void prueba(){
    Personal pe1 = new Personal(2132121, "k", "Jhon", "Jose", "Lara", "Plaza1");
    Personal pe2 = new Personal(2132122, "k", "Jhon", "Jose", "Lara", "Plaza2");
    Personal pe3 = new Personal(2132123, "k", "Jhon", "Jose", "Lara", "Plaza3");
    Personal pe4 = new Personal(2132124, "k", "Jhon", "Jose", "Lara", "Plaza4");
    Personal pe5 = new Personal(2132125, "k", "Jhon", "Jose", "Lara", "PENE");
    
    DAOPersonal.agregar(pe1);
    DAOPersonal.agregar(pe2);
    DAOPersonal.agregar(pe3);
    DAOPersonal.agregar(pe4);
    DAOPersonal.agregar(pe5);
    DAOPersonal.eliminar(2132122);
    DAOPersonal.listar();
}
}
