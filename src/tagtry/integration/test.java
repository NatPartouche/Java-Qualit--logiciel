package tagtry.integration;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import flexjson.JSONDeserializer;
import tagtry.dblayout.Creator;
import tagtry.dblayout.Finder;
import tagtry.dblayout.Helper;
import tagtry.dblayout.Serializer;
import tagtry.model.Owner;
import tagtry.model.Store;

public class test {
	public enum gender {
		MAN, WOMEN
	}

	public enum size {
		XS, S, M, L, XL
	}

	public enum classes {
		Client, Owner, Item, Store, User, ParseData, ParseInstallation, PaiementData, Social
	}

	public static void main(String[] args) {

		// Client client = Sampler.create_client();
		// FacebookHelper.publish(client);
		// FacebookHelper.like(client);
		// ParseHelper.createuser(client);
		// ParseHelper.installation(client);
		// ParseHelper.createuser(client);
		// ParseHelper.installation(client);
		// String value = serializer.serialize(client);
		// System.out.println(value);
		try {
			Helper.start();
			// Creator.create_client();
			// Creator.create_owner();

			String ownervalue = Finder.finbyObjectIDinDB("owner",
					"526bc8e10364c4f532f3e3dd").toString();

			Owner o = (Owner) Serializer.DeSerialize(ownervalue, classes.Owner);

			String storevalue = Finder.finbyObjectIDinDB("store",
					"526bce03036462dd5eb7780f").toString();

			Store s = (Store) Serializer.DeSerialize(storevalue, classes.Store);
			Creator.create_item(s);
			Finder.findAll("item");

			Finder.findbyattributvalueDB("client", "email", "natanel@gmail.com");

			Finder.findAll("client");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
