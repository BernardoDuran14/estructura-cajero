/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est;

import java.util.Scanner;


/**
 *
 * @author Bernardo
 */
public class Cuenta extends Cliente{
	Scanner entrada = new Scanner(System.in);
    int nroCuenta;
    String moneda;
    String tipo;
    double saldo;
    int cuenta;
    int pin;

    public Cuenta(int nroCuenta,String nombre, String codCli, String moneda, String tipo, double saldo, int cuenta, int pin) {
        super(nombre, codCli);
        this.nroCuenta = nroCuenta;
        this.codCli = codCli;
        this.moneda = moneda;
        this.tipo = tipo;
        this.saldo = saldo;
        this.cuenta = cuenta;
        this.pin = pin;
    }

    /*Cuenta(String jperez, int i, String juan_Perez, String bolivianos, String caja_de_Ahorros, int i0) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public String getMoneda() {
        return moneda;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public int getPin() {
        return pin;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void mostrarDatos(){
    	System.out.println("Nombre: "+nombre
                +"\nCuenta Nro: "+nroCuenta
                +"\nCódigo de cliente: "+codCli
                +"\nCuenta: "+cuenta
                +"\nMoneda: "+moneda
                +"\nTipo: "+tipo
                +"\nSaldo: "+saldo);
    }   
    
    public void retirarBol(){
 
        try {
            int retiro = 0;
            System.out.println("Cuánto desea retirar?");
            retiro = entrada.nextInt();
            if(retiro>0){
            if(retiro<=saldo){
                saldo=saldo-retiro;
                System.out.println("Se retiró exitosamente: "+retiro+"bs.\nSaldo Actual: " +saldo);
            }else{
            	System.out.println("ERROR al realizar el retiro, no cuenta con esa monto");
            }
            }else{
            	System.out.println("ERROR al realizar el retiro, quizó retirar monto negativo");
        }
            
        } catch (Exception e) {
        	System.out.println("ERROR, puede que NO introdujo números O quizó retirar monedas");
        }
        
        
    }
    
    public void depositarBol(){
        
        try {
            double deposito = 0;
            System.out.println("Cuánto desea depositar?");
      
            deposito = entrada.nextDouble();
            if(deposito>=10){
                saldo=saldo+deposito;
                System.out.println("Se retiró exitosamente: "+deposito+"bs.\nSaldo Actual: " +saldo);
            }else{
            	System.out.println("ERROR al realizar el deposito, no puede depositar monedas ni montos negativos");
        }
            
        } catch (Exception e) {
        	System.out.println("ERROR, introduzca números y NO letras");
        }
        
    }
    
    public void retirarUSD(){
 
        try {
            int retiro = 0;
            System.out.println("Cuánto desea retirar?");
            retiro = entrada.nextInt();
            if(retiro>0){
            if(retiro<=saldo){
                saldo=saldo-retiro;
                System.out.println("Se retiró exitosamente: "+retiro+"$.\nSaldo Actual: " +saldo+"$");
            }else{
            	System.out.println("ERROR al realizar el retiro, no cuenta con esa monto");
            }
            }else{
            	System.out.println("ERROR al realizar el retiro, quizó retirar monto negativo");
        }
            
        } catch (Exception e) {
        	System.out.println("ERROR, puede que NO introdujo números O quizó retirar monedas");
        }
        
        
    }
    
    public void depositarUSD(){
        
        try {
            double deposito = 0;
            System.out.println("Cuánto desea depositar?");
            deposito = entrada.nextDouble();
            if(deposito>=1){
                saldo=saldo+deposito;
                System.out.println("Se retiró exitosamente: "+deposito+"$.\nSaldo Actual: " +saldo+"$");
            }else{
            	System.out.println("ERROR al realizar el deposito, no puede depositar monedas ni montos negativos");
        }
            
        } catch (Exception e) {
        	System.out.println("ERROR, introduzca números y NO letras");
        }
        
    }

}
