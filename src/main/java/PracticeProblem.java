public class PracticeProblem {

	public static void main(String args[]) {
		String q1 = pluralize("fliY");
		System.out.println(q1);
	}

	public static String pluralize(String words){
		if(words.toLowerCase().endsWith("y")){
			if(words.toLowerCase().endsWith("ey")){
				return ("eys");
			}
			else{
				return("ies");
			}
		}
		else if(words.toLowerCase().endsWith("ife")){
			return("ives");
		}
		else{
			return ("s");
		}
		
	}

	public static int min(int num, int num2, int num3){
		int minNum;
		if(num < num2 && num < num3){
			minNum = num;
		}
		else if(num3 < num && num3 < num2){
			minNum = num3;
		}
		else{
			minNum = num2;
		}
		return minNum;
	}

	public static boolean isLeapYear(int year){
		boolean result = false;
		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 == 0){
					result = true;
				}
			}
			else{
				result = true;
			}
		}
		else{
			result = false;
		}
		
		return result;
	}
}
