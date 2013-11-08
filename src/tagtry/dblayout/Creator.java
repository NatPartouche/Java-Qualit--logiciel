package tagtry.dblayout;

import java.util.Random;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import tagtry.integration.test.gender;
import tagtry.integration.test.size;
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

public class Creator {

	public static String APP_NAME = "Tag&Try";
	public static String APP_VERSION = "0.0";
	public static String APP_CHANNELS = "live";

	public static String FACEBOOK_ID = "100005374869617";
	public static String FACEBOOK_TOKEN = "CAAE1CZCgQbO8BAL54WPh8X3F53SXzolzMxNBPtr3ZClZBzgSbzljhmihMZALey71joyQG1vZCO467gWIGCiITms2NsY8ofh7DUKLNYM6VhDaFImorcjMwWcA1DmY0ZBZB7mgO0UD6Y077T4m4p1cZAhLPEdZAkb96opZBVpVqGaRRX72iUZBkJ5eI5MYmBSKi1BGzEZD";

	public static String FACEBOOK_APP_ID = "339800499449071";
	public static String FACEBOOK_APP_SECRET = "3b1c9ca1a675c03c1ffe541204a42e16";

	public static String TWITTER_ID = "100005374869617";
	public static String TWITTER_TOKEN = "CAAE1CZCgQbO8BAL54WPh8X3F53SXzolzMxNBPtr3ZClZBzgSbzljhmihMZALey71joyQG1vZCO467gWIGCiITms2NsY8ofh7DUKLNYM6VhDaFImorcjMwWcA1DmY0ZBZB7mgO0UD6Y077T4m4p1cZAhLPEdZAkb96opZBVpVqGaRRX72iUZBkJ5eI5MYmBSKi1BGzEZD";

	public static String DEVICE_TOKEN = "0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef";

	public static User create_user(String name, String firstname, int age,
			gender gender) {

		User user = new User();
		user.setName(name);
		user.setFirstname(firstname);
		user.setAge(age);
		user.setGender("" + gender);
		return user;
	}

	public static Facebook create_facebook(String fbid, String fbtoken) {
		Facebook facebook = new Facebook();
		facebook.setFacebookId(fbid);
		facebook.setFacebookToken(fbtoken);
		return facebook;
	}

	public static Twitter create_twitter(String twid, String twtoken) {

		Twitter twitter = new Twitter();
		twitter.setTwitterId(twid);
		twitter.setTwitterToken(twtoken);
		return twitter;
	}

	public static ParseData create_parsedata(String name, String firstname,
			String psw, String email, String phone, boolean emailverified,
			String authdata) {

		ParseData parse = new ParseData();
		parse.setSurname(name + " " + firstname);
		parse.setPassword(psw);
		parse.setEmail(email);
		parse.setEmailverified(emailverified);
		parse.setAuthdata(authdata);
		parse.setPhone(phone);
		return parse;
	}

	public static ParseInstallation create_parseinstallation(
			String devicetoken, String os) {

		ParseInstallation parseinstallation = new ParseInstallation();

		parseinstallation.setAppName(Creator.APP_NAME);
		parseinstallation.setAppVersion(Creator.APP_VERSION);
		parseinstallation.setBadge(1);
		parseinstallation.setChannels(Creator.APP_CHANNELS);
		parseinstallation.setDeviceToken(devicetoken);
		parseinstallation.setDeviceType(os);

		return parseinstallation;
	}

	public static Social create_social() {
		Social social = new Social();
		social.setFacebook(Creator.create_facebook(FACEBOOK_ID, FACEBOOK_TOKEN));
		social.setTwitter(Creator.create_twitter(TWITTER_ID, TWITTER_TOKEN));
		return social;
	}

	public static Client create_client(User user, ParseData parse,
			ParseInstallation installation, Social social) {

		Client returnclient = new Client();
		returnclient.setUser(user);
		returnclient.setParseData(parse);
		returnclient.setParseInstallation(installation);
		returnclient.setSocial(social);
		return returnclient;

	}

	public static Owner create_owner(String fbid, String fbs, User user) {
		Owner owner = new Owner();
		owner.setUser(user);
		owner.setFacebookid(fbid);
		owner.setFacebookSecret(fbs);
		return owner;
	}

	public static Store create_store(String adresse, String city, String name,
			Owner owner) {
		Store store = new Store();
		store.setAdress(adresse);
		store.setCity(city);
		store.setName(name);
		store.setOwner(owner);

		for (int i = 0; i < 10; i++) {
			store.getItem()
					.add(create_Item(Generator.randomstring(),
							Generator.randomstring(), Generator.randomstring()));
		}
		return store;
	}

	public static Item create_Item(String description, String subtitle,
			String title) {
		Item item = new Item();
		item.setDescription(description);
		item.setSubtitle(subtitle);
		item.setTitle(title);
		return item;
	}

	public static void create_client() {

		// CREATE CLIENT
		Client client = new Client();

		User user = new User();

		// BASIC INFO CLIENT
		user.setName(Generator.randomstring());
		user.setFirstname(Generator.randomstring());
		user.setAge(12);
		user.setGender("" + gender.MAN);

		client.setSizedown(33);
		client.setSizeshoes(44);
		client.setSizeup("" + size.L);

		// BASIC INFO PARSE
		ParseData parse = new ParseData();
		parse.setSurname(client.getUser().getFirstname() + " "
				+ client.getUser().getName());
		parse.setPassword("pwd");
		parse.setEmail("natanel@gmail.com");
		parse.setEmailverified(true);
		parse.setAuthdata("Ok");
		parse.setPhone("0000000000");

		// CLIENT SET INFO PARSE
		client.setParseData(parse);

		// INSTALLATION PARSE
		ParseInstallation installation = new ParseInstallation();
		installation.setAppName("Tag&Try");
		installation.setAppName("0.0");
		installation.setBadge(1);
		installation.setChannels("live");
		installation
				.setDeviceToken("0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef");
		installation.setDeviceType("ios");

		// CLIENT SET INFO INSTALLATION
		client.setParseInstallation(installation);

		Social social = new Social();

		// CREATE FACEBOOK USER VALUE
		Facebook facebook = new Facebook();
		facebook.setFacebookId("100005374869617");
		facebook.setFacebookToken("CAAE1CZCgQbO8BAL54WPh8X3F53SXzolzMxNBPtr3ZClZBzgSbzljhmihMZALey71joyQG1vZCO467gWIGCiITms2NsY8ofh7DUKLNYM6VhDaFImorcjMwWcA1DmY0ZBZB7mgO0UD6Y077T4m4p1cZAhLPEdZAkb96opZBVpVqGaRRX72iUZBkJ5eI5MYmBSKi1BGzEZD");

		// CREATE TWITER USER VALUE
		Twitter twitter = new Twitter();
		twitter.setTwitterId("");
		twitter.setTwitterToken("");

		// FACEBOOK POST ON WALLS && FACEBOOK LIKE ON WALLS
		social.setTwitter(twitter);
		social.setFacebook(facebook);

		// USER SOCIAL INFO FACEBOOK / TWITTER
		client.setSocial(social);
		DBObject value = (DBObject) Serializer.Serialize(client);
		Helper.insert("client", (BasicDBObject) value);
	}

	public static void create_random_owner(User user) {
		// THE OWNER IS A USER
		Owner owner = new Owner();
		owner.setUser(user);
		// FACEBOOK APPLICATION INFO
		owner.setFacebookid("339800499449071");
		owner.setFacebookSecret("3b1c9ca1a675c03c1ffe541204a42e16");

		DBObject value = (DBObject) Serializer.Serialize(owner);
		Helper.insert("owner", (BasicDBObject) value);

	}

	public static void create_store(Owner owner) {
		// CREATE STORE
		Store store = new Store();
		store.setAdress("5 rue de la jolie Fleure");
		store.setCity("Paris, 20eme");
		store.setName("Le pays du polo");
		store.setOwner(owner);

		DBObject value = (DBObject) Serializer.Serialize(store);
		Helper.insert("store", (BasicDBObject) value);
	}

	public static void create_item(Store store) {
		Item temp = new Item();
		temp.setDescription("Description");
		temp.setSubtitle("subtitle");
		temp.setTitle("title => ");
		temp.setStore(store);
		store.getItem().add(temp);
		DBObject value = (DBObject) Serializer.Serialize(temp);
		Helper.insert("item", (BasicDBObject) value);

	}
}
