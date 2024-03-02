//RealTime Example

import java.io.*;
import java.util.*;

class StringTokenizerDemo{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Shop name, size, no. of clothes purchased, price");
		String info = br.readLine();

		StringTokenizer obj = new StringTokenizer(info," ");

		String token1 = obj.nextToken();
		char token2 = obj.nextToken().charAt(0);
		int token3 = Integer.parseInt(obj.nextToken());
		float token4 = Float.parseFloat(obj.nextToken());


		System.out.println("Shop Name: "+token1);
		System.out.println("Size: "+token2);
		System.out.println("No. of clothes: "+token3);
		System.out.println("Price: "+token4);
	}
}
