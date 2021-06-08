package PAT.basic.basic_1009;

import java.util.Scanner;
public class Basic_1009{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
        String[]words = s.split("\\s+");
		for(int i = words.length - 1; i > 0 ; i--){  
			System.out.print(words[i]+" ");  
		}
		System.out.println(words[0]);
        in.close();
	}
}