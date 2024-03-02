import java.io.*;
import java.util.*;

class StringDemo{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter societyname, wing, flatno: ");
		String info = br.readLine();

		StringTokenizer obj = new StringTokenizer(info," ");

		String token1 = obj.nextToken();
		String token2 = obj.nextToken();
		int token3 = Integer.parseInt(obj.nextToken());

		System.out.println();

		System.out.println("Society Name: "+token1);
		System.out.println("Wing: "+token2);
		System.out.println("Flat No: "+token3);
	}
}
