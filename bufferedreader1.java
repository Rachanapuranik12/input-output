// br.close() method

import java.io.*;

class InputBuffer{

	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("Enter string1: ");
		String str1=br.readLine();

		br.close();

		System.out.println("Enter string2: ");
		String str2=br.readLine();

		System.out.println(str1);
		System.out.println(str2);
	}
}

