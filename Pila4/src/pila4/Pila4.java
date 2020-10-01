package pila4;

import java.util.Arrays;
import java.util.Scanner;

public class Pila4 {
        char pila[] = new char[26]; //creamos la pila
   int opt = 26; //variable opt que nos va a permitir hacer el tamaño de la pila 
  public void MpilaAleatoria(){ //Modulo para crear la pila aleatoria 
        for (int i=opt-1; i>=0; i--) {
        System.out.println(pila[i]);
        }
    }
  public void LPilaAleatoria(){ //Modulo para llenar la pila 
        for (int i=0; i<opt; i++) {
        pila[i] = (char) (Math.random()*opt+'A');
        for (int j=0;j<i;j++){
            if(pila[i]==pila[j]){
                i--;
            }
        }
        }
        System.out.println("Pila llena aleatoriamente\n");
  }
  public void EPilaAleatoria(){//Modulo para eliminar el ultimo caracter de la pila 
      opt--;
  }
    public void APilaAleatoria(char w) {//Modulo para agregar una letra a la pila
        pila[opt] = w; //$ *
        opt++;
        System.out.println("Letra agregada");
    }
    public void OPilaAleatoria(){//Modulo para ordenar la pila
        Arrays.sort(pila);
        System.out.println("Pila ordenada");
    }
    public static void main(String[] args) {
        Pila4 p = new Pila4();//Creamos un objeto para llamar a los modulos 
        Scanner sc = new Scanner (System.in);//Creamos un objeto para poder leer lo que el usuario introduzca
        int opcion;//variable opcion para tomar la opcion que el usuario desee
        do{ //Iniciamos un do
            System.out.println("1-Llenar Aleatoriamente\n" + "2-Mostrar\n" + "3-Eliminar\n" + "4-Agregar\n" + "5-Ordenar\n" +"6-Salir\n"+"Opcion :"); //Imprimimos el menu
            switch(opcion=sc.nextInt()){//Creamos un switch para las opciones
            case 1:
                p.LPilaAleatoria(); //En el caso uno mandamos a llamar el modulo llenar pila
            break;
            case 2:
                p.MpilaAleatoria(); //En el caso dos mandamos a llamar el modulo mostrar pila
            break;
            case 3:
                p.EPilaAleatoria(); //En el caso tres mandamos a llamar el modulo eliminar pila
            break;
            case 4: 
            System.out.println("Ingresa la letra"); 
            char w=sc.next().charAt(0);
            p.APilaAleatoria(w); //En el caso cuatro mandamos a llamar el modulo agregar pila
            break;
            case 5:
            p.OPilaAleatoria(); //En el caso cinco mandamos a llamar el modulo ordenar pila
            break;
            }
        }while (opcion != 6);
   }
}