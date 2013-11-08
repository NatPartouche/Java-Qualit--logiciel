package tagtry.integration;

import java.util.Set;

import javax.persistence.GenerationType;

import tagtry.dblayout.Creator;
import tagtry.dblayout.Generator;
import tagtry.integration.test.gender;
import tagtry.integration.test.size;
import tagtry.model.*;

public class Sampler {

	public static Client create_client() {

		// CREATE CLIENT

		ParseData parse = Creator.create_parsedata(Generator.randomstring(),
				Generator.randomstring(), Generator.randomstring(),
				Generator.randomemail(), Generator.randomstring(), true,
				Generator.randomstring());

		ParseInstallation installation = Creator.create_parseinstallation(
				Creator.DEVICE_TOKEN, "ios");

		Social social = Creator.create_social();

		User user = Creator.create_user(Generator.randomstring(),
				Generator.randomstring(), Generator.randomint(),
				Generator.randomgender());
		Client client = Creator
				.create_client(user, parse, installation, social);
		Owner owner = Creator.create_owner(Creator.FACEBOOK_APP_ID,
				Creator.FACEBOOK_APP_SECRET, Creator.create_user(
						Generator.randomstring(), Generator.randomstring(),
						Generator.randomint(), gender.WOMEN));

		Store store = Creator.create_store(Generator.randomstring(),
				Generator.randomstring(), Generator.randomstring(), owner);

		return client;
	}
}
