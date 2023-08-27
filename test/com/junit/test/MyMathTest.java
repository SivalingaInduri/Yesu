package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.junit.code.MyMath;

class MyMathTest {

	MyMath myMath = new MyMath();
	@Test
	void caluculateSum_threeMemberArray() {
		assertEquals(6, myMath.caluculateSum(new int[] { 1, 2, 3 }));

	}

	@Test
	void caluculateSum_ZeroMemberArray() {
		assertEquals(0, myMath.caluculateSum(new int[] {}));

	}
}
