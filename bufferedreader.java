// BufferedReader - in IO package, throws IOException

import java.io.*;

class InputDemo{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter character");
		char ch=(char)br.read();

		br.skip(1);


		System.out.println("Enter name");
		String name=br.readLine();

		System.out.println("Enter age");
		int age=Integer.parseInt(br.readLine());

		
		System.out.println("Entered values are: ");

		System.out.println(ch);
		System.out.println(name);
		System.out.println(age);
	}
}




