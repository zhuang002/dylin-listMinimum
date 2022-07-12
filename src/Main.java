import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i=0;i<size;i++) {
			int element = sc.nextInt();
			list.add(element);
		}
		
		for (int i=0;i<size;i++) {
			// find the minimun element and remove it
			int minimun = 1001;
			int idx = -1;
			for (int j=0;j<list.size();j++) {
				int ele = list.get(j);
				if (minimun>ele) {
					minimun = ele;
					idx = j;
				}
			}
			System.out.println(minimun);
			list.remove(idx);
		}
	}

}
