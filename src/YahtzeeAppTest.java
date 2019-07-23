import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YahtzeeAppTest {

	@Test
	void testOneOnes() {
		int[] dice = { 1, 6, 5, 5, 2 };
		int actual = YahtzeeApp.yahtzee(dice, "Ones");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void testNoOnes() {
		int[] dice = { 2, 6, 5, 5, 2 };
		int actual = YahtzeeApp.yahtzee(dice, "Ones");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testTwoTwos() {
		int[] dice = { 2, 6, 5, 5, 2 };
		int actual = YahtzeeApp.yahtzee(dice, "Twos");
		int expected = 4;
		assertEquals(expected, actual);
	}
	@Test
	void testNoTwos() {
		int[] dice = { 5, 6, 5, 5, 3 };
		int actual = YahtzeeApp.yahtzee(dice, "Twos");
		int expected = 0;
	}
	@Test
	void testTwoThrees() {
		int[] dice = { 3, 6, 5, 5, 3 };
		int actual = YahtzeeApp.yahtzee(dice, "Threes");
		int expected = 6;
	}
	@Test
	void test3Fives() {
		int[] dice = { 5, 6, 5, 5, 3 };
		int actual = YahtzeeApp.yahtzee(dice, "Threes");
		int expected = 15;
	}
	@Test
	void test3Sixes() {
		int[] dice = { 5, 6, 5, 6, 6 };
		int actual = YahtzeeApp.yahtzee(dice, "Threes");
		int expected = 18;
	}
	 @Test
	   void testPair() {
	       int[] dice = { 1, 1, 2, 3, 4};
	       int actual = YahtzeeApp.yahtzee(dice, "pair");
	       int expected = 2;
	   }
	   @Test
	   void testTwoPair() {
	       int[] dice = { 1, 1, 2, 3, 3};
	       int actual = YahtzeeApp.yahtzee(dice, "two pair");
	       int expected = 8;
	   }
	   @Test
	   void testTwoPairNone() {
	       int[] dice = { 1, 1, 2, 4, 3};
	       int actual = YahtzeeApp.yahtzee(dice, "two pair");
	       int expected = 0;
	   }
	
	@Test
	void testThreeKindSixes() {
		int[] dice = { 5, 6, 5, 6, 6 };
		int actual = YahtzeeApp.yahtzee(dice, "Three of a kind");
		int expected = 18;
	}
	@Test
	void testFourKindSixes() {
		int[] dice = { 5, 6, 6, 6, 6 };
		int actual = YahtzeeApp.yahtzee(dice, "Four of a kind");
		int expected = 24;
	}
	@Test
	void testFourKindNothing() {
		int[] dice = { 5, 5, 6, 6, 6 };
		int actual = YahtzeeApp.yahtzee(dice, "Four of a kind");
		int expected = 0;
	}
	
	@Test
	void testSmallStraight() {
		int[] dice = { 3,2,1,4,5 };
		int actual = YahtzeeApp.yahtzee(dice, "Small straight");
		int expected = 15;
	}
	@Test
	void testLargeStraight() {
		int[] dice = { 3,2,1,4,5 };
		int actual = YahtzeeApp.yahtzee(dice, "Small straight");
		int expected = 20;
	}
	@Test
	void testFullHouse() {
		int[] dice = { 5,5,5,2,2 };
		int actual = YahtzeeApp.yahtzee(dice, "full house");
		int expected = 19;
	}
	@Test
	void testFullHouse2() {
		int[] dice = { 2,5,5,5,5 };
		int actual = YahtzeeApp.yahtzee(dice, "full house");
		int expected = 0;
	}
	
	@Test
	void testYahtzee() {
		int[] dice = { 5,5,5,5,5 };
		int actual = YahtzeeApp.yahtzee(dice, "Yahtzee");
		int expected = 50;
	}
	@Test
	void testChance() {
		int[] dice = { 5,1,1,5,5 };
		int actual = YahtzeeApp.yahtzee(dice, "chance");
		int expected = 17;
	}
	
}
