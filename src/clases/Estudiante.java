/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;



/**
 *
 * @author Juansebastian
 */
public class Estudiante {

    private String nombre; 
    private String apellido;
    private int codigo;

    Curso curso[];
    Curso c;            //Molde para evaluar

    private int cursosRegistrados;

    

    public void registrar(String nombre, String apellido, int codigo) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;

        this.cursosRegistrados = 1;

    }

    public void registrarCurso(String nombre, int codigo, int creditos) {
        
        if(this.cursosRegistrados <6){
            
            this.curso[this.cursosRegistrados] = new Curso(nombre, codigo, creditos);
            this.cursosRegistrados++;
          
        }
        
        else
            System.out.println("Se han registrados los cursos");
        
    }

    public void consultarCurso(int cod) {

        
        
        
        for(int i = 1; i<= this.cursosRegistrados; i++){
            
            
            c = this.curso[i];
            
            if(c.getCodigo()==cod){
                
                System.out.println("Nombre: "+ c.getNombre());
                
                
                i = this.cursosRegistrados + 1;
                
            }
            
        }
        
    }
    
    public void asignarNota(int codigo, double nota) {

        for( int i = 1; i< this.cursosRegistrados; i++){
        
        
        c = this.curso[i];
        
        if(c.getCodigo() == codigo){
            
            this.curso[i].setNota(nota);
        
            i = this.cursosRegistrados + 1;
            
        }
        
        
    }

    }

    public double calcularPromedio() {

        double promedio = 0;
        int creditos = 0;
        
        for(int i = 1; i< this.cursosRegistrados; i++){
            
            c = this.curso[i];
            
            promedio = promedio + (c.getNota()* c.getCreditos());
            creditos = creditos + c.getCreditos();
            
            
            
        }
        
        double resultado = promedio / creditos;
        
        return resultado;
        
    }
        

    public boolean pruebaAcademica(){

        double resultado = this.calcularPromedio();


        if(resultado >= 3.25 )
        return false;  
        
        else
        return true;
    
    


    }

}