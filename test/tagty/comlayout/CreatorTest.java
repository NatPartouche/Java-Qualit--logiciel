package tagty.comlayout;

import static org.junit.Assert.*;

import javax.persistence.GenerationType;

import org.junit.Test;

import tagtry.dblayout.Creator;
import tagtry.dblayout.Generator;
import tagtry.model.Client;
import tagtry.model.Facebook;
import tagtry.model.Item;
import tagtry.model.Owner;
import tagtry.model.ParseData;
import tagtry.model.ParseInstallation;
import tagtry.model.Social;
import tagtry.model.Store;
import tagtry.model.Twitter;
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
		boolean condition = false;
		ParseData parsedata = Creator.create_parsedata(
				Generator.randomstring(), Generator.randomstring(),
				Generator.randomstring(), Generator.randomemail(),
				Generator.randomnumber(), true, Generator.randomstring());

		if (parsedata != null) {
			if (parsedata.getClass().equals(ParseData.class)) {
				condition = true;
			} else {
				condition = false;
			}
		}
		assertTrue(condition);
	}

	@Test
	public void create_parseinstallationTest() {
		boolean condition = false;

		ParseInstallation parseinstallation = Creator.create_parseinstallation(
				Generator.randomstring(), "iOS");
		if (parseinstallation != null) {
			if (parseinstallation.getClass().equals(ParseInstallation.class)) {
				condition = true;
			} else {
				condition = false;
			}
		}
		assertTrue(condition);
	}

	@Test
	public void create_ownerTest() {

		boolean condition = false;
		User user = Creator.create_user(Generator.randomstring(),
				Generator.randomstring(), Generator.randomint(),
				Generator.randomgender());

		Owner owner = Creator.create_owner(Creator.FACEBOOK_APP_ID,
				Creator.FACEBOOK_APP_SECRET, user);

		if (owner != null) {
			if (owner.getClass().equals(Owner.class)) {
				condition = true;
			} else {
				condition = false;
			}
		}
		assertTrue(condition);

	}

	@Test
	public void create_storeTest() {

		boolean condition = false;

		User user = Creator.create_user(Generator.randomstring(),
				Generator.randomstring(), Generator.randomint(),
				Generator.randomgender());

		Owner owner = Creator.create_owner(Creator.FACEBOOK_APP_ID,
				Creator.FACEBOOK_APP_SECRET, user);

		Store store = Creator.create_store(Generator.randomstring(),
				Generator.randomstring(), Generator.randomstring(), owner);

		if (store != null) {
			if (store.getClass().equals(Store.class)) {
				if (store.getOwner().getUser().getClass().equals(User.class)) {
					condition = true;
				}

			} else {
				condition = false;
			}
		}
		assertTrue(condition);
	}

	@Test
	public void create_socialTest() {

		boolean condition = false;
		Social social = Creator.create_social();

		if (social.getFacebook().getClass().equals(Facebook.class)) {
			if (social.getTwitter().getClass().equals(Twitter.class)) {
				condition = true;

			} else {

				condition = false;
			}
		}
		assertTrue(condition);
	}

	@Test
	public void create_clientTest() {
		boolean condition = false;
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

		if (client.getClass().equals(Client.class)) {
			condition = true;
		} else {
			condition = false;
		}
		assertTrue(condition);
	}

	@Test
	public void create_itemTest() {

		boolean condition = false;
		Item item = Creator.create_Item(Generator.randomstring(),
				Generator.randomstring(), Generator.randomstring());

		if (item.getClass().equals(Item.class)) {
			condition = true;
		} else {
			condition = false;
		}
		assertTrue(condition);

	}
}
