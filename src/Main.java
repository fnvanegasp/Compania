
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado("123", "V", 0);
        Empleado e2 = new Empleado("456","I", 30);
        Sucursal s = new Sucursal("Bogota");
        
        if(!s.ingresarEmp(e1)) System.out.println("Error");
        if(!s.ingresarEmp(e2)) System.out.println("Error");
        
        //s.ingresarEmp(e1);
        //s.ingresarEmp(e2);
        
        Empleado e = s.buscarEmpleado("456");
        if(e!=null) System.out.println(e);
        else System.out.println("No existe");
    
        ArrayList<Empleado> emp = s.listarTodosEmpleados();
            for(Empleado emp1 : emp){
                System.out.println(emp1);
            }
    
    }
    
}
