/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Empresa {
    private String nombre;
    private TreeMap<String,Sucursal> ok;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.ok = new TreeMap<>();
    }
    
    /*public ArrayList<Empleado> listarTodosEmpleados(){
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        for(Sucursal e : this.ok.values()){
            sucursales.add(e);
            
        }
        return sucursales;
    }*/
    
    
    
}
