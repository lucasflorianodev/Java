package app;

import entidade.Carro;
import entidade.Roda;

import java.util.Scanner;

public class Aplicativo {

    public static void main(String[] args) {

    Carro subaru1 = new Carro(2021, "astra");

    }

    //solicitando dados do usuário
    Scanner sc = new Scanner(System.in);
    int ano = sc.nextInt();
    String modelo = sc.nextLine();


    //Instanciando um carro
    Carro subaru1 = new Carro(ano, modelo);
    Roda roda = new Roda("dunlop",15);
    subaru1.setRoda(Roda);

    subaru1.getRoda().getAro();

    System.out.println("O aro da roda é: " + subaru1.getRoda().getAro());

}
