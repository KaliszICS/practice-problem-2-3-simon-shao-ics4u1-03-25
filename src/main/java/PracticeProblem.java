public class PracticeProblem {

	public static void main(String args[]) {
		String[] word = new  String[] {"a", "b", "D", "c", "help", "me", "you", "fool"};
bubbleSortString(word);
for (int i = 0; i<word.length;i++){
	System.out.println(word[i]);
}
	}

	public static void bubbleSortString(String[] strings){
		boolean swapped = true;
String bucket = "";
		for(int i = 0; i<strings.length-1 && swapped;i++){
			swapped = false;
			for(int s = 0; s<strings.length-1-i;s++){
				if (strings[s].compareToIgnoreCase(strings[s+1]) >0){
					bucket = strings[s+1];
					strings[s+1] = strings[s];
					strings[s] = bucket;
					swapped = true;
					System.out.println(strings[s]);
				}
	}
}





	}

}
