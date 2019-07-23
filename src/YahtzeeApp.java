import java.util.ArrayList;
import java.util.Arrays;

public class YahtzeeApp {

	public static int yahtzee(int[] dice, String category) {
		int sum = 0;
		
		if(category.equalsIgnoreCase("ones")) {	
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 1) {
					sum += 1;
			}
		}
		} else if (category.equalsIgnoreCase("twos")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 2) {
					sum += 2;
				}
		}
		} else if (category.equalsIgnoreCase("threes")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 2) {
					sum += 3;
				}
		}
		} else if (category.equalsIgnoreCase("fours")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 2) {
					sum += 4;
				}
		}
		} else if (category.equalsIgnoreCase("fives")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 2) {
					sum += 5;
				}
		}
		} else if (category.equalsIgnoreCase("sixes")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 2) {
					sum += 6;
				}
		}
		} else if (category.equalsIgnoreCase("pair")) {
	           Arrays.sort(dice);
	           for (int i = dice.length - 1; i > 0; i--) {
	               if (dice[i] == dice[i-1]) {
	                   sum += dice[i] + dice[i-1];
	               }
	           }
	       } else if (category.equalsIgnoreCase("two pairs")) {
	           Arrays.sort(dice);
	           for (int i = dice.length - 1; i > 0; i--) {
	               if (dice[i] == dice[i-1]) {
	                   sum += dice[i] + dice[i-1];
	                   i--;
	               }
	           }
        } else if (category.equalsIgnoreCase("three of a kind")) {
			Arrays.sort(dice);
				if (dice[0] == dice[1] && dice[1] == dice[2]) {
					sum += dice[2] * 3;
				}else if (dice[1] == dice[2] && dice[2] == dice[3]) {
					sum += dice[2] * 3;
				} else if (dice[2] == dice[3] && dice[3] == dice[4]) {
					sum += dice[2] * 3;
			}
		} else if (category.equalsIgnoreCase("four of a kind")) {
			Arrays.sort(dice);
			if (dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[3])  {
				sum += dice[2] * 4;
			}else if (dice[1] == dice[2] && dice[2] == dice[3] && dice[3] == dice[4]) {
				sum += dice[2] * 3;
			}
		} else if (category.equalsIgnoreCase("small straight")) {
			Arrays.sort(dice);
			if (dice[0] == 1 && dice[1] == 2 && dice[2] == 3 && dice[3] == 4 && dice[4] == 5)  {
				sum += 15;
			}
		} else if (category.equalsIgnoreCase("large straight")) {
			Arrays.sort(dice);
			if (dice[0] == 2 && dice[1] == 3 && dice[2] == 4 && dice[3] == 5 && dice[4] == 6)  {
				sum += 20;
			}	
		} else if (category.equalsIgnoreCase("yahtzee")) {
			if (dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[3] && dice[3] == dice[4])  {
				sum += 50;
			}
		} else if (category.equalsIgnoreCase("full house")) {
	           Arrays.sort(dice);
	           for (int i = dice.length - 1; i > 0; i--) {
	               if (dice[i] == dice[i-1]) {
	            	   if (dice[0] == dice[1] && dice[1] == dice[2]) {
					} else if (dice[1] == dice[2] && dice[2] == dice[3]) {
					} else if (dice[2] == dice[3] && dice[3] == dice[4]) {
						sum += dice[0] + dice[1] + dice[2] + dice[3] + dice[4];
				} 
	           }
	       } 
		} else if (category.equalsIgnoreCase("chance")) {
			for (int i = 0; i < dice.length; i++) {
				sum += dice[i]; 	
			}
		}
		return sum;
}
	}
