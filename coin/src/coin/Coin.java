package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer,String>();
	public Coin(){
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dollar");
		coinnames.put(50, "ÎåÃ«");
		System.out.println(coinnames.keySet().size());
		for( int k : coinnames.keySet() ){
			System.out.println(coinnames.get(k));
		}
		System.out.println(coinnames);
	}
	public String get(int amount){
		if( coinnames.containsKey(amount) )
			return coinnames.get(amount);
		else
			return "NOT FOUND";
	}
	public static void main(String[] args) {
		Coin coin = new Coin();
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		System.out.println(coin.get(amount));
		System.out.println(coin.keySet());
		System.out.println(coin.keySet().size());
		System.out.println("");

	}

}
