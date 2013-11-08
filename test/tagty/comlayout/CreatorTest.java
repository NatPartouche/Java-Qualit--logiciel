package tagty.comlayout;

import static org.junit.Assert.*;

import javax.persistence.GenerationType;

import org.junit.Test;

import tagtry.dblayout.Creator;
import tagtry.dblayout.Generator;
import tagtry.model.Client;
import tagtry.model.User;

public class CreatorTest {

	@Test
	public void create_userTest() {
		boolean condition = false;

		User user = Creator.create_user(Generator.randomstring(),
				Generator.randomstring(), Generator.randomint(),
				Generator.randomgender());
		if (user != null) {
			if (user.getClass().equals(User.class)) {
				condition = true;
			}
		} else {
			condition = false;
		}
		assertTrue(condition);
	}

	@Test
	public void create_parsedataTest() {

	}

	@Test
	public void create_parseinstallationTest() {

	}

	@Test
	public void create_storeTest() {

	}

	@Test
	public void create_clientTest() {
		boolean condition = false;

	}

	@Test
	public void create_itemTest() {

	}
}
