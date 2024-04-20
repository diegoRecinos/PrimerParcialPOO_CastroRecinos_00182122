import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        ArrayList <Electronico> list = new ArrayList<>();  
        
        Scanner read = new Scanner(System.in);

        do {
            
            System.out.println();
            System.out.println( "Registros: ");
            System.out.println("\t1. Crear Laptop");
            System.out.println("\t2. Crear Telefono");
            System.out.println("\t3. Modificar precio articulo");
            System.out.println("\t4. Mostar lista de articulos ");
            System.out.println("\t5. Salir");

            
            int opcion = read.nextInt();
            
            if(opcion == 5)
            {
                break;
            }

            switch (opcion){
                
                case 1:
                    try {
                        System.out.println("Defina ID del articulo: ");
                        int id  = read.nextInt();  
                        System.out.println("Defina nombre: ");
                        String nombre = read.next();
                        System.out.println("Defina modelo: ");
                        String modelo = read.next();
                        System.out.println("Defina descripcion: ");
                        String descripcion = read.next();
                        System.out.println("Defina precio: ");
                        double precio = read.nextDouble();
                        System.out.println("Defina color: ");
                        String color = read.next();
                        System.out.println("Defina procesador: ");
                        String procesador = read.next();
    
                        list.add(new Laptop(id, nombre, modelo, descripcion, precio, color, procesador));
                        System.out.println("se ha aniadido articulo");
                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                    break;

                case 2:
                    
                    try {
                        System.out.println("Defina ID del articulo: ");
                        int id2  = read.nextInt();  
                        System.out.println("Defina nombre: ");
                        String nombre2 = read.next();
                        System.out.println("Defina modelo: ");
                        String modelo2 = read.next();
                        System.out.println("Defina descripcion: ");
                        String descripcion2 = read.next();
                        System.out.println("Defina precio: ");
                        double precio2 = read.nextDouble();
                        System.out.println("Defina camara px: (String) ");
                        String camara = read.next();
                        System.out.println("Defina procesador: ");
                        String tamanio = read.next();
    
                        list.add(new Telefono(id2, nombre2, modelo2, descripcion2, precio2, camara, tamanio));
                        System.out.println("se ha aniadido articulo");
                    } catch (Exception e) {
                        // TODO: handle exception
                    }                       

                            
                    break;

                case 3:
                    
                    try {

                        System.out.println("Digite el id del articulo para modificar su precio");
                        int idSearch2  = read.nextInt();
    
    
                        for (int i = 0; i < list.size(); i++) 
                        {
                            System.out.println("valor del string: " + idSearch2);
                            if (list.get(i).getId() ==  idSearch2) {
                                System.out.println("Se encontro el articulo");
    
                                System.out.println("Digite el nuevo precio del articulo ");
                                
                                double newPrice = read.nextDouble();
                                list.get(i).setPrecio(newPrice);
    
                                System.out.println("Se ha modificado el precio del articulo a: " + newPrice ); 
                            }else{System.out.println("No se encontro el articulo");}
                        }
                            
                    } catch (Exception e) {
                        // TODO: handle exception
                    }  
                                          

                    break;

                case 4:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println();            
                        System.out.println(list.get(i).toString());
                
                    }
                    break;
                
                default:

                    break;



        }

        }while(true);
    }
}
