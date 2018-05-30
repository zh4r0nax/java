public class Anidacion{
    public static void main(String args[]){
        int operacion = 8;
        int num_uno = 5;
        int num_dos = 7;
        int res = 0;
        if(operacion == 1){
            res = num_uno + num_dos;
            System.out.println("El resultado de la suma es: "+ res);
        }else if(operacion == 2){
            res = num_uno - num_dos;
            System.out.println("El resultado de la resta es: "+ res);
        }else if(operacion == 3){
            res = num_uno * num_dos;
            System.out.println("El resultado de la multiplicacion es: "+ res);
        }else if(operacion == 4){
            res = num_uno / num_dos;
            System.out.println("El resultado de la divicion es: "+ res);
        }else{
            System.out.println("no se encuentra la opcion");            
        }


    }
}