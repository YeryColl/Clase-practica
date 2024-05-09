import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int tam = 0;

        do {
            try {
                System.out.println("Cuantos productos desea ingresar");
                tam = leer.nextInt();
                continuar = false;
            } catch (Exception e) {
                System.out.println("Solo numeros enteros");
                leer.nextLine();
            }
        } while (continuar);
        leer.nextLine();
        String[] productos = new String[tam];
        int[] cantProductos = new int[tam];
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese el nombre del producto :" + (i+1));
            productos[i] = leer.nextLine();
            System.out.println("Ingrese la cantidad del producto");
            cantProductos[i] = leer.nextInt();
            leer.nextLine();
        }
        System.out.println("Ingrese el nombre del producto que desea buscar");
        String target = leer.nextLine();
        int resultado = linearSearch(productos, target);
        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posicion :" + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
        leer.close();
    }
    public static int linearSearch(String[] productos, String target){
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }
}
