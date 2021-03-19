package math.problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<Integer> list = new ArrayList<>();
		for (int n=2; n<10000; n++) {
			list = getPrimeNumbers(n);
		}
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Total Prime Number at this point: " + list.size());
	}
	public static List<Integer> getPrimeNumbers(int num){
		List<Integer> primeList = new ArrayList<>();
		for (int j=2; j<num; j++){
			if (isPrime(j)){
				primeList.add(j);

			}
		}
		return primeList;
	}
	public static boolean isPrime(int num){
		for (int i=2; i<num; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;

	}

}
