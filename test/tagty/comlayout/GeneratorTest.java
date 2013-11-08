package tagty.comlayout;

import static org.junit.Assert.*;

import org.junit.Test;

import tagtry.dblayout.Generator;
import tagtry.integration.test.gender;

public class GeneratorTest {

	@Test
	public void randomstringTest() {
		boolean condition = false;
		String string = Generator.randomstring();
		if (string == (String) string) {
			condition = true;
		} else {
			condition = false;
		}

		assertTrue(condition);

	}

	@Test
	public void randomintTest() {
		boolean condition = false;

		int value = Generator.randomint();
		if (value == (int) value) {
			condition = true;
		} else {
			condition = false;
		}

		assertTrue(condition);

	}

	@Test
	public void randomemailTest() {
		Boolean condition = false;
		String string = Generator.randomemail();
		if (string.contains("@") && string.contains(".")) {
			condition = true;
		} else {
			condition = false;
		}

		assertTrue(condition);
	}

	@Test
	public void randomgenderTest() {
		boolean condition = false;
		gender g = Generator.randomgender();
		if (g == (gender) Generator.randomgender()) {
			condition = true;
		} else {
			condition = false;
		}
		assertTrue(condition);
	}

	@Test
	public void randomnumberTest() {
		String string = Generator.randomnumber();
		char[] chars = "0123456789".toCharArray();
		boolean condition = false;
		int counter = 0;
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < chars.length; j++) {
				if (string.charAt(i) == chars[j]) {
					counter++;
					break;
				}
			}
		}
		System.out.println(counter);
		if (counter == 10) {
			condition = true;
		} else {
			condition = false;
		}
		assertTrue(condition);
	}
}
