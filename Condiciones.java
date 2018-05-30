public class Condiciones{
    public static void main(String args[]){
        int matematica = 7;
        int biologia = 5;
        int quimica = 7;
        int suma = 0;
        double promedio = 0.0;
        int cantidadNotas = 3;

        suma = matematica + biologia + quimica;
        promedio= suma/cantidadNotas;

        System.out.println(suma);
        System.out.println(promedio);
        if(promedio >= 6){
            System.out.println("El alumno aprobo con: ");
        }else{
            System.out.println("El alumno reprobo con: ");
        }


    }
}