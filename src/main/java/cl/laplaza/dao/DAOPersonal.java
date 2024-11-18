/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.laplaza.dao;
import cl.laplaza.model.Personal;
import java.util.ArrayList;

/**
 *
 * @author benja
 */
public class DAOPersonal {
    private static ArrayList<Personal> lPersonal = new ArrayList<Personal>();
    
    public static void listar(){
        for (Personal registro : lPersonal) {
            System.out.println("Personal :"+ registro.toString());
        }
    }
    public static Personal buscar(int rut){
        for (Personal registro : lPersonal) {
            //if(registro.getRut()== rut)
                return registro;
        }
        return null;
    }
    public static boolean agregar(Personal alumno){
        /*Personal a1 = buscar(alumno.getRut());
        if(a1 != null){
            return false;
        }*/
        lPersonal.add(alumno);
        return true;
    }
    public static boolean actualizar(Personal alumno){
       /*Personal a1 = buscar(alumno.getRut());
       if(a1 == null){
           return false;
       }*/
      //a1.setNombres(alumno.getNombres());
      //a1.setApPaterno(alumno.getApPaterno());
      //a1.setApMaterno(alumno.getApMaterno());
      return true;
    }
    public static void eliminar(int rut) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int j = lPersonal.size() - 1; j > 0; j--) {
            Personal e1 = lPersonal.get(j);
            if (e1.getRun()== rut) {
                lPersonal.remove(j);
            }

        }
    }
    /*public static boolean eliminar(int rut){
        Personal a1 = buscar(rut);
        if (a1 == null) {
            return false;
        }
        lPersonal.remove(a1);
        return true;
    } */
}

