package tagty.comlayout;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.junit.Test;

import tagtry.comlayout.ParseHelper;
import tagtry.dblayout.Creator;
import tagtry.dblayout.CreatorTest;
import tagtry.dblayout.Generator;
import tagtry.model.Client;
import tagtry.model.ParseData;
import tagtry.model.ParseInstallation;
import tagtry.model.Social;
import tagtry.model.User;

public class ParseHelperTest {

	@Test
	public void testcreateusergood() {

		User user = Creator.create_user(Generator.randomstring(),
				Generator.randomstring(), Generator.randomint(),
				Generator.randomgender());

		Social social = Creator.create_social();

		ParseInstallation parseinstallation = Creator.create_parseinstallation(
				Generator.randomstring(), "iOS");

		ParseData parsedata = Creator.create_parsedata(
				Generator.randomstring(), Generator.randomstring(),
				Generator.randomstring(), Generator.randomemail(),
				Generator.randomnumber(), true, Generator.randomstring());

		Client client = Creator.create_client(user, parsedata,
				parseinstallation, social);

		try {
			assertTrue(ParseHelper.createuser(client));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void testcreateuserbad() {

		User user = Creator.create_user(Generator.randomstring(),
				Generator.randomstring(), Generator.randomint(),
				Generator.randomgender());

		Social social = Creator.create_social();

		ParseInstallation parseinstallation = Creator.create_parseinstallation(
				Generator.randomstring(), "iOS");

		ParseData parsedata = Creator.create_parsedata(
				Generator.randomstring(), Generator.randomstring(),
				Generator.randomstring(), Generator.randomemail(),
				Generator.randomnumber(), true, Generator.randomstring());

		Client client = Creator.create_client(user, parsedata,
				parseinstallation, social);

		try {
			assertFalse(ParseHelper.createuser(client));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void testcreateinstallationgood() {
		User user = Creator.create_user(Generator.randomstring(),
				Generator.randomstring(), Generator.randomint(),
				Generator.randomgender());

		Social social = Creator.create_social();

		ParseInstallation parseinstallation = Creator.create_parseinstallation(
				Generator.randomstring(), "iOS");

		ParseData parsedata = Creator.create_parsedata(
				Generator.randomstring(), Generator.randomstring(),
				Generator.randomstring(), Generator.randomemail(),
				Generator.randomnumber(), true, Generator.randomstring());

		Client client = Creator.create_client(user, parsedata,
				parseinstallation, social);

		try {
			assertTrue(ParseHelper.installation(client));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testcreateinstallationbad() {
		User user = Creator.create_user(Generator.randomstring(),
				Generator.randomstring(), Generator.randomint(),
				Generator.randomgender());

		Social social = Creator.create_social();

		ParseInstallation parseinstallation = Creator.create_parseinstallation(
				Generator.randomstring(), "iOS");

		ParseData parsedata = Creator.create_parsedata(
				Generator.randomstring(), Generator.randomstring(),
				Generator.randomstring(), Generator.randomemail(),
				Generator.randomnumber(), true, Generator.randomstring());

		Client client = Creator.create_client(user, parsedata,
				parseinstallation, social);

		try {
			assertFalse(ParseHelper.installation(client));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testcreatsendpushgood() {

		User user = Creator.create_user(Generator.randomstring(),
				Generator.randomstring(), Generator.randomint(),
				Generator.randomgender());
		Social social = Creator.create_social();

		ParseInstallation parseinstallation = Creator.create_parseinstallation(
				Generator.randomstring(), "iOS");

		ParseData parsedata = Creator.create_parsedata(
				Generator.randomstring(), Generator.randomstring(),
				Generator.randomstring(), Generator.randomemail(),
				Generator.randomnumber(), true, Generator.randomstring());

		Client client = Creator.create_client(user, parsedata,
				parseinstallation, social);
		boolean value = ParseHelper.sendpush(client);
		assertTrue(value);

	}

	@Test
	public void testcreatsendpushbad() {

		User user = Creator.create_user(Generator.randomstring(),
				Generator.randomstring(), Generator.randomint(),
				Generator.randomgender());
		Social social = Creator.create_social();

		ParseInstallation parseinstallation = Creator.create_parseinstallation(
				Generator.randomstring(), "Android");

		ParseData parsedata = Creator.create_parsedata(
				Generator.randomstring(), Generator.randomstring(),
				Generator.randomstring(), Generator.randomemail(),
				Generator.randomnumber(), true, Generator.randomstring());

		Client client = Creator.create_client(user, parsedata,
				parseinstallation, social);
		boolean value = ParseHelper.sendpush(client);
		assertFalse(value);

	}
}
