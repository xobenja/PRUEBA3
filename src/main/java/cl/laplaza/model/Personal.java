/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.laplaza.model;

/**
 *
 * @author benja
 */
public class Personal {
    private int run;
    private String dv_run;
    private String pri_nombre;
    private String seg_nombre;
    private String ap_pat;
    private String ap_mat;

    public Personal(int run) {
        this.run = run;
    }

    public Personal(int run, String dv_run, String pri_nombre, String seg_nombre, String ap_pat, String ap_mat) {
        this.run = run;
        this.dv_run = dv_run;
        this.pri_nombre = pri_nombre;
        this.seg_nombre = seg_nombre;
        this.ap_pat = ap_pat;
        this.ap_mat = ap_mat;
    }
    
    

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getDv_run() {
        return dv_run;
    }

    public void setDv_run(String dv_run) {
        this.dv_run = dv_run;
    }

    public String getPri_nombre() {
        return pri_nombre;
    }

    public void setPri_nombre(String pri_nombre) {
        this.pri_nombre = pri_nombre;
    }

    public String getSeg_nombre() {
        return seg_nombre;
    }

    public void setSeg_nombre(String seg_nombre) {
        this.seg_nombre = seg_nombre;
    }

    public String getAp_pat() {
        return ap_pat;
    }

    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    public String getAp_mat() {
        return ap_mat;
    }

    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }

    @Override
    public String toString() {
        return "Personal{" + "run=" + run + ", dv_run=" + dv_run + ", pri_nombre=" + pri_nombre + ", seg_nombre=" + seg_nombre + ", ap_pat=" + ap_pat + ", ap_mat=" + ap_mat + '}';
    }
    
    
    
}


