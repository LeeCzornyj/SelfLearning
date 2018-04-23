package com.qa.test.BlackjackTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.Blackjack.*;

public class blackjackTest {

	@Test
	public void test() {
		blackjack Blackjack = new blackjack();
		assertEquals(10,Blackjack.blackjackMain1(10, 22));
		assertEquals(9,Blackjack.blackjackMain1(22, 9));
		assertEquals(0,Blackjack.blackjackMain1(22, 22));
		assertEquals(10,Blackjack.blackjackMain1(10, 7));
		assertEquals(19,Blackjack.blackjackMain1(1, 19));
			
	}

}
