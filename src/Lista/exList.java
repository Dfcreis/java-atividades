package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exList {
    public static void main(String[]agrs){
    List<String> lista = new ArrayList<>();

    lista.add("daniel");
    lista.add("gabrielli");
    lista.add("maria");
    lista.add("joao");
    lista.add("jose");


    for(String n : lista){
        System.out.println(n);
    }
    System.out.println("------------------------------");
    System.out.println();
    System.out.println(lista.size());
    lista.remove("maria");

    lista.removeIf(x -> x.charAt(0) == 'j');

    for(String n : lista){
        System.out.println(n);
    }

    System.out.println("-----------------------");
    System.out.println(lista.indexOf("daniel"));
    System.out.println(lista.indexOf("maria"));

    System.out.println("------------------------");

  List<String> result = lista.stream().filter(x -> x.charAt(0) == 'd').collect(Collectors.toList());
    for (String n : result){
        System.out.println(n);
    }

    }

}
