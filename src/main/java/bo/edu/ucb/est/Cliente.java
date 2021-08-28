/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est;

/**
 *
 * @author Bernardo
 */
public class Cliente {
    
    String nombre;
    String codCli;

    public Cliente(String nombre, String codCli) {
        this.nombre = nombre;
        this.codCli = codCli;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodCli() {
        return codCli;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodCli(String codCli) {
        this.codCli = codCli;
    }
    
    
}
