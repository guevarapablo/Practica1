package practica1;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Deportistas[] d = new Deportistas[100];
        
        Libre[] libre = new Libre[50];
        Mariposa[] mariposa = new Mariposa[50];
        Pecho[] pecho = new Pecho[50];
        Espalda[] espalda = new Espalda[50];
        
        int aux,aux2,aux3,aux4,aux5,aux6,aux7;
        int i=0;
        int i_libre=0;
        int i_mariposa=0;
        int i_pecho=0;
        int i_espalda=0;
        int flag=0;
        int documento,auxbus,f;
        
        while (true)
        {
            System.out.println("\nSeleccione su opción: \n1. Gestion de Deportistas\n2. Inscripciones");
            aux = sc.nextInt();
            sc.nextLine();

            switch(aux)
            {
                case 1:
                {
                    System.out.println("\nSeleccione su opción: \n1. Ingresar\n2. Actualizar\n3. Eliminar\n4. Buscar");
                    aux2 = sc.nextInt();
                    sc.nextLine();
                    d[i] = new Deportistas();
                    
                    switch(aux2)
                    {
                        case 1:
                        {                                                        
                            d[i].ingresar();
                            d[i].categoria();
                            System.out.println("Deportista ingresado");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Ingrese el documento a actualizar: ");
                            documento = sc.nextInt();
                            sc.nextLine();
                            
                            for(f=0;f<i;f++)
                            {
                                auxbus = d[f].getDocumento();
                                if (documento == auxbus)
                                {
                                    d[f].actualizar();
                                    d[f].categoria();
                                    System.out.println("\nDato actualizado");
                                }
                            }
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Ingrese el documento a eliminar: ");
                            documento = sc.nextInt();
                            sc.nextLine();
                            
                            for(f=0;f<i;f++)
                            {
                                auxbus = d[f].getDocumento();
                                if (documento == auxbus)
                                {
                                    d[f].eliminar();
                                    System.out.println("\nDeportista eliminado");
                                }
                            }
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Ingrese el documento a buscar: ");
                            documento = sc.nextInt();
                            sc.nextLine();
                            
                            for(f=0;f<i;f++)
                            {
                                auxbus = d[f].getDocumento();
                                if (documento == auxbus)
                                {
                                    d[f].buscar();
                                }
                            }
                            break;
                        }
                        default:
                        {
                        System.out.println("Entrada Incorrecta");
                        break;
                        }
                    }
                    i=i+1;
                    break;
                }
                case 2:
                {
                    System.out.println("\nSeleccione su opcion: \n1. Inscribir\n2. Eliminar\n3. Mostar");
                    aux3 = sc.nextInt();
                    sc.nextLine();
                    
                    switch(aux3)
                    {
                        case 1:
                        {
                            System.out.println("Ingrese el documento a inscribir: ");
                            documento = sc.nextInt();
                            sc.nextLine();
                            
                            for(f=0;f<i;f++)
                            {
                                auxbus = d[f].getDocumento();
                                
                                if (documento == auxbus)
                                {
                                    System.out.println("\nSeleccione la modalidad: \n1. Libre\n2. Mariposa\n3. Pecho\n4. Espalda");
        
                                    aux4 = sc.nextInt();
                                    sc.nextLine();

                                    switch(aux4)
                                    {
                                        case 1:
                                        {
                                            libre[i_libre] = new Libre();
                                            libre[i_libre].setName(d[f].getNombre());
                                            libre[i_libre].setDoc(d[f].getDocumento());
                                            i_libre = i_libre+1;
                                            break;
                                        }
                                        case 2:
                                        {
                                            mariposa[i_mariposa] = new Mariposa();
                                            mariposa[i_mariposa].setName(d[f].getNombre());
                                            mariposa[i_mariposa].setDoc(d[f].getDocumento());
                                            i_mariposa = i_mariposa+1;
                                            break;
                                        }
                                        case 3:
                                        {
                                            pecho[i_pecho] = new Pecho();
                                            pecho[i_pecho].setName(d[f].getNombre());
                                            pecho[i_pecho].setDoc(d[f].getDocumento());
                                            i_pecho = i_pecho+1;
                                            break;
                                        }
                                        case 4:
                                        {
                                            espalda[i_espalda] = new Espalda();
                                            espalda[i_espalda].setName(d[f].getNombre());
                                            espalda[i_espalda].setDoc(d[f].getDocumento());
                                            i_espalda = i_espalda+1;
                                            break;
                                        }
                                        default:
                                        {
                                            System.out.println("Entrada Incorrecta");
                                            break;
                                        }
                                    }
                                    System.out.println("\nDeportista inscrito");
                                    flag=1;
                                }
                            }
                            
                            if(flag!=1)
                                System.out.println("El documento no se ha ingresado: ");
                            
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Ingrese el documento a eliminar: ");
                            documento = sc.nextInt();
                            sc.nextLine();
                            
                            for(f=0;f<i_libre;f++)
                            {
                                auxbus = libre[f].getDoc();
                                
                                if (documento == auxbus)
                                {
                                    System.out.println("\nEstá inscrito en la modalidad Libre");
                                    System.out.println("Si desea eliminarlo de esta modalidad ingrese 1, sino, ingrese 2.");
                                    aux7 = sc.nextInt();
                                    sc.nextLine();
                                    
                                    if (aux7==1)
                                    {
                                    libre[f].eliminar_prueba();
                                    System.out.println("\nDeportista eliminado de la prueba");
                                    }
                                }
                            }
                            for(f=0;f<i_mariposa;f++)
                            {
                                auxbus = mariposa[f].getDoc();
                                
                                if (documento == auxbus)
                                {
                                    System.out.println("\nEstá inscrito en la modalidad Mariposa");
                                    System.out.println("Si desea eliminarlo de esta modalidad ingrese 1, sino, ingrese 2.");
                                    aux7 = sc.nextInt();
                                    sc.nextLine();
                                    
                                    if (aux7==1)
                                    {
                                    mariposa[f].eliminar_prueba();
                                    System.out.println("\nDeportista eliminado de la prueba");
                                    }
                                }
                            }
                            for(f=0;f<i_pecho;f++)
                            {
                                auxbus = pecho[f].getDoc();
                                
                                if (documento == auxbus)
                                {
                                    System.out.println("\nEstá inscrito en la modalidad Pecho");
                                    System.out.println("Si desea eliminarlo de esta modalidad ingrese 1, sino, ingrese 2.");
                                    aux7 = sc.nextInt();
                                    sc.nextLine();
                                    
                                    if (aux7==1)
                                    {
                                    pecho[f].eliminar_prueba();
                                    System.out.println("\nDeportista eliminado de la prueba");
                                    }
                                }
                            }
                            for(f=0;f<i_espalda;f++)
                            {
                                auxbus = espalda[f].getDoc();
                                
                                if (documento == auxbus)
                                {
                                    System.out.println("\nEstá inscrito en la modalidad Espalda");
                                    System.out.println("Si desea eliminarlo de esta modalidad ingrese 1, sino, ingrese 2.");
                                    aux7 = sc.nextInt();
                                    sc.nextLine();
                                    
                                    if (aux7==1)
                                    {
                                    espalda[f].eliminar_prueba();
                                    System.out.println("\nDeportista eliminado de la prueba");
                                    }
                                }
                            }

                            
                            break; 
                        }
                        case 3:
                        {
                                    System.out.println("\nSeleccione la modalidad: \n1. Libre\n2. Mariposa\n3. Pecho\n4. Espalda");
        
                                    aux5 = sc.nextInt();
                                    sc.nextLine();

                                    switch(aux5)
                                    {
                                        case 1:
                                        {
                                            for(f=0;f<i_libre;f++)
                                            {
                                                System.out.println("Nombre: "+libre[f].getName());
                                            }
                                            break;
                                        }
                                        case 2:
                                        {
                                            for(f=0;f<i_mariposa;f++)
                                            {
                                                System.out.println("Nombre: "+mariposa[f].getName());
                                            }
                                            break;
                                        }
                                        case 3:
                                        {
                                            for(f=0;f<i_pecho;f++)
                                            {
                                                System.out.println("Nombre: "+pecho[f].getName());
                                            }
                                            break;
                                        }
                                        case 4:
                                        {
                                            for(f=0;f<i_espalda;f++)
                                            {
                                                System.out.println("Nombre: "+espalda[f].getName());
                                            }
                                            break;
                                        }
                                        default:
                                        {
                                            System.out.println("Entrada Incorrecta");
                                            break;
                                        }
                                    }
                            break;
                        }
                        default:
                        {
                        System.out.println("Entrada Incorrecta");
                        break;
                        }
                    }
                    break;
                }
                default:
                {
                System.out.println("Entrada Incorrecta");
                break;
                }
            }
        }
    }
    
}
