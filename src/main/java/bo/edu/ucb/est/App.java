package bo.edu.ucb.est;


import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner entrada = new Scanner(System.in);
        Cuenta juan1 = new Cuenta(1,"Juan Perez","jperez","Bolivianos","Caja de Ahorros",12000,111122,3333);
        Cuenta juan2 = new Cuenta(2,"Juan Perez","jperez","USD","Cuenta Corriente",100,112211,3333);
        Cuenta maria = new Cuenta(1,"Maria Gomez","mgomez","Bolivianos","Caja de Ahorros",0,221122,4444);
        Cuenta carlos1 = new Cuenta(1,"Carlos Gomez","cgomez","Bolivianos","Caja de ahorros",100,331122,3333);
        Cuenta carlos2 = new Cuenta(2,"Carlos Gomez","cgomez","USD","Cuenta Corriente",1000,332211,3333);
        Cuenta carlos3 = new Cuenta(3,"Carlos Gomez","cgomez","Bolivianos","Caja de ahorros",100000,332233,3333);
        
        try{
        
        	
        	String codC = "";	
            int pin;
        	System.out.println("Ingrese el codigo de cuenta :");
        	codC = entrada.next();
        	System.out.println("Ingrese el pin de la cuenta :");
        	pin =entrada.nextInt();
        
            String perez = "jperez";
            String mari = "mgomez";
            String carlos = "cgomez";
            
        if(codC.equals("jperez")&&pin==3333){
        	boolean salir = false;
            int opcion1;
            int opcion=0;
            while(opcion!=4) {
            	
            	System.out.println("\n\nMENÚ DE OPCIONES\n\n 1.Ver saldo\n 2.Retirar\n 3.Depositar\n 4.Salir");
                opcion= entrada.nextInt();
                

        switch (opcion){
            case 1:
            	int cta;
                System.out.println("Ingrese la cuenta entre 1-2: ");
                cta = entrada.nextInt();
                if(cta==1){
                    juan1.mostrarDatos();
                }else if(cta==2){
                    juan2.mostrarDatos();
                }
                else{
                	System.out.println("No tiene esa cuenta.");
                }
                break;
            case 2:
                System.out.println("Ingrese la cuenta entre 1-2: ");
                cta = entrada.nextInt();
                if(cta==1){
                    juan1.retirarBol();
                }else if(cta==2){
                    juan2.retirarUSD();
                }
                break;
            case 3:
                System.out.println("Ingrese la cuenta entre 1-2: ");
                cta = entrada.nextInt();
                if(cta==1){
                    juan1.depositarBol();
                }else if(cta==2){
                    juan2.depositarUSD();
                }
                break;
            case 4:
            	System.out.println("Salió");
                break;
            default:
            	System.out.println("Opcion Incorrecta");
                break;
        }
        }
        }else if(codC.equals("mgomez")&&pin==4444){
        	boolean salir = false;
            int opcion1;
            int opcion=0;
            while(opcion!=4) {
            	System.out.println("\n\nMENÚ DE OPCIONES\n\n 1.Ver saldo\n 2.Retirar\n 3.Depositar\n 4.Salir");
                opcion= entrada.nextInt();
        switch (opcion){
            case 1:
                
                
                    maria.mostrarDatos();
                
                
                break;
            case 2:
                
                
                    maria.retirarBol();
                
                break;
            case 3:
                
                
                    maria.depositarBol();
                
                break;
            case 4:
            	System.out.println("Salió");
                break;
            default:
            	System.out.println("Opcion Incorrecta");
                break;
        }
        }
        }
        else if(codC.equals("cgomez")&&pin==3333){
        	boolean salir = false;
            int opcion1;
            int opcion=0;
            while(opcion!=4) {
            	System.out.println("\n\nMENÚ DE OPCIONES\n\n 1.Ver saldo\n 2.Retirar\n 3.Depositar\n 4.Salir");
                opcion= entrada.nextInt();
            	

        switch (opcion){
            case 1:
            	int cta;
                System.out.println("Ingrese la cuenta entre 1-3: ");
                cta = entrada.nextInt();
                if(cta==1){
                    carlos1.mostrarDatos();
                }else if(cta==2){
                    carlos2.mostrarDatos();
                }else if(cta==3){
                    carlos3.mostrarDatos();
                }
                else{
                	System.out.println("No tiene esa cuenta.");
                }
                break;
            case 2:
                System.out.println("Ingrese la cuenta entre 1-3: ");
                cta = entrada.nextInt();
                if(cta==1){
                    carlos1.retirarBol();
                }else if(cta==2){
                    carlos2.retirarUSD();
                }else if(cta==3){
                    carlos3.retirarBol();
                }
                break;
            case 3:
                System.out.println("Ingrese la cuenta entre 1-3: ");
                cta = entrada.nextInt();
                if(cta==1){
                    carlos1.depositarBol();
                }else if(cta==2){
                    carlos2.depositarUSD();
                }else if(cta==3){
                    carlos3.depositarBol();
                }
                break;
            case 4:
            	System.out.println("Salió");
                break;
            default:
            	System.out.println("Opcion Incorrecta");
                break;
        }
        }
        }
        else{
        	System.out.println("Ingresaste datos incorrectos");
        }
        }catch(Exception e){
        	System.out.println("Ingresaste datos que no corresponden en los campos");
        }
    }
}