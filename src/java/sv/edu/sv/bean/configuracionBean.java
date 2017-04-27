/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.sv.bean;

/**
 *
 * @author Jose
 */
public class configuracionBean {

    /**
     * @return the docente
     */
    public int getDocente() {
        return docente;
    }

    /**
     * @param docente the docente to set
     */
    public void setDocente(int docente) {
        this.docente = docente;
    }

    /**
     * @return the alumno
     */
    public int getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the mora
     */
    public double getMora() {
        return mora;
    }

    /**
     * @param mora the mora to set
     */
    public void setMora(double mora) {
        this.mora = mora;
    }
    private int docente;
    private int alumno;
    private double mora; 
}
