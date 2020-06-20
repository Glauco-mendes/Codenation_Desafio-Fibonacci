package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {

		List<Integer> listFib= new ArrayList<Integer>();
		int i =1;
		int fib=0;


		while(i<=350)
		{
			listFib.add(fib);
			int fibAnterior = fib;
			fib = fib + i;
			i = fibAnterior;
		}

		return listFib;
	}

	public static Boolean isFibonacci(Integer a) {


		if(fibonacci().contains(a))
			return true;
		else
			return false;

	}

}