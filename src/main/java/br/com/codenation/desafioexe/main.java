package br.com.codenation.desafioexe;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;


public class main {

    public static void main(String[] args){
        List<Integer> list = DesafioApplication.fibonacci();
        for(int x : list){
            System.out.println(x);
        }
        for(int x=0;x<=100;x++){
            if(DesafioApplication.isFibonacci(x))
                System.out.println(x + " é fibonacci");
            else
                System.out.println(x + " não é fibonacci");
        }
    }
}
