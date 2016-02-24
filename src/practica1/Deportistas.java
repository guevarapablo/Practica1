package practica1;

import java.util.Scanner;

public class Deportistas {
    
    Scanner sc = new Scanner(System.in);
    
    public String nombre,rama,categoria;
    public int documento,año,aux;
    
    public String nombre()
    {
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        return nombre;
    }
    
    public int documento()
    {
        System.out.println("Ingrese el documento: ");
        documento = sc.nextInt();
        sc.nextLine();
        return documento;
    }
    
    public String rama()
    {
        System.out.println("Ingrese la rama: \n1. Masculino\n2. Femenino");
        aux = sc.nextInt();
        sc.nextLine();
        switch(aux)
        {
            case 1:
            {
                rama = "Masculino";
                break;
            }
            case 2:
            {
                rama = "Femenino";
                break;
            }
            default:
            {
                System.out.println("Entrada Incorrecta");
                break;
            }
        }
        return rama;
    }
    
    public int año()
    {
        System.out.println("Ingrese el año de nacimiento: ");
        año = sc.nextInt();
        sc.nextLine();
        return año;
    }
    
    public void categoria()
    {
        if (año<=2010&&año>=2006)
            categoria = "Infantil A";
        if (año<=2005&&año>=1999)
            categoria = "Infantil B";
        if (año<=1998&&año>=1991)
            categoria = "Juvenil";
        if (año<1991)
            categoria = "Senior";
        if (año>2010)
        {
            System.out.println("No apto para ingreso");
            eliminar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getRama() {
        return rama;
    }

    public int getDocumento() {
        return documento;
    }

    public int getAño() {
        return año;
    }

    public String getCategoria() {
        return categoria;
    }
    
    
    
    public void ingresar()
    {
        nombre();
        documento();
        rama();
        año();
    }
    
    public void actualizar(){
         
        System.out.println("Seleccione el dato que desea actualizar: \n1. Nombre");
        System.out.println("2. Documento\n3. Rama\n4. Año de nacimiento");
        int j = sc.nextInt();
        sc.nextLine();
        
        switch(j){
            
            case 1:
            {
                nombre();
                break;
            }
            case 2:
            {
                documento();
                break;
                
            }
            case 3:
            {
                rama();
                break;
            }
            case 4:
            {
                año();
                break;
            }
            default:
            {
                System.out.println("Entrada Incorrecta");
                break;
            }
        }
        
    }
    
    public void eliminar()
    {
        nombre = null;
        documento = 0;
        rama = null;
        año = 0;
    }
    
    public void buscar()
    {
        System.out.println("Nombre: "+nombre+"\nDocumento: "+documento+"\nRama: "+rama+"\nAño de nacimiento: \n"+año+"\nCategoria: "+categoria);
    }
    
}

class Libre extends Deportistas
{
    private String name;
    private int doc;
    
    public Libre()
    {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }   
    
    public void eliminar_prueba()
    {
        name = null;
        doc = 0;
    }
}
    
class Mariposa extends Deportistas
{
    private String name;
    private int doc;
    
    public Mariposa()
    {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }
    
    public void eliminar_prueba()
    {
        name = null;
        doc = 0;
    }
}
    
class Pecho extends Deportistas
{
    private String name;
    private int doc;
    
    public Pecho()
    {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }    
    
    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }
    
    public void eliminar_prueba()
    {
        name = null;
        doc = 0;
    }
}
    
class Espalda extends Deportistas
{
    private String name;
    private int doc;
    
    public Espalda()
    {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }   
    
    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }
    
    public void eliminar_prueba()
    {
        name = null;
        doc = 0;
    }
}
