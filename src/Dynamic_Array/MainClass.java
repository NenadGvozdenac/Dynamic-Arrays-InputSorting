package Dynamic_Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static Scanner sc;
	public static ArrayList<Integer> number_list;
	public static Integer curr_number = null;
	
	public static void main(String[] args) throws IOException {

		sc = new Scanner(System.in);
		number_list = new ArrayList<Integer>();
		
		System.out.print("Enter a number of entries: ");
		Integer entry_number = sc.nextInt();
		
		System.out.printf("You entered %d entries, add %d numbers with space between them: ", entry_number, entry_number);
		
		for(int i = 0; i < entry_number; i++) {
			curr_number = sc.nextInt();
			number_list.add(curr_number);
		}
		
		System.out.print("Here are the entries you entered: ");
		
		for(Integer i : number_list) {
			System.out.printf("%d ", i);
		}
		
		ArrayList<Integer> sorted_list = sort_list(number_list);
		
		System.out.print("\n\nSorted list with entries you entered: ");
		
		for(Integer i : sorted_list) {
			System.out.printf("%d ", i);
		}
		
	}
	
	public static ArrayList<Integer> sort_list(ArrayList<Integer> start_list) {
		
		for(int i = 0; i < start_list.size() - 1; i++) {
			for(int j = 0; j < start_list.size() - i - 1; j++) {
				if(start_list.get(j) > start_list.get(j+1)) {
					Integer x = start_list.get(j);
					start_list.set(j, start_list.get(j+1));
					start_list.set(j+1, x);
				}
			}
		}
		
		return start_list;
	}
	

}
