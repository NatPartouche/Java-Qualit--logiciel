package tagtry.dblayout;

import tagtry.integration.test.classes;
import tagtry.model.Client;
import tagtry.model.Item;
import tagtry.model.Owner;
import tagtry.model.PaiementData;
import tagtry.model.ParseData;
import tagtry.model.ParseInstallation;
import tagtry.model.Store;
import tagtry.model.User;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

public class Serializer {

	public static Object Serialize(Object obj) {
		Object o = com.mongodb.util.JSON.parse(new JSONSerializer().exclude(
				"*.class").serialize(obj));
		return o;
	}

	public static Object DeSerialize(String obj, classes root) {
		Object o = null;
		switch (root) {
		case Client:
			o = new JSONDeserializer<Owner>().deserialize(obj, Client.class);
			break;
		case Owner:
			o = new JSONDeserializer<Client>().deserialize(obj, Owner.class);
			break;
		case Item:
			o = new JSONDeserializer<Item>().deserialize(obj, Item.class);
			break;
		case Store:
			o = new JSONDeserializer<Store>().deserialize(obj, Store.class);
			break;
		case User:
			o = new JSONDeserializer<User>().deserialize(obj, User.class);
			break;
		case PaiementData:
			o = new JSONDeserializer<PaiementData>().deserialize(obj,
					PaiementData.class);
			break;
		case ParseInstallation:
			o = new JSONDeserializer<ParseInstallation>().deserialize(obj,
					PaiementData.class);
			break;
		case ParseData:
			o = new JSONDeserializer<ParseData>().deserialize(obj,
					ParseData.class);

			break;
		case Social:
			o = new JSONDeserializer<Store>().deserialize(obj, Store.class);
			break;

		default:
			break;
		}
		return o;
	}
}
