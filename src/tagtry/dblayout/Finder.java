package tagtry.dblayout;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class Finder {

	public static BasicDBObject finbyObjectIDinDB(String databasename,
			String objectid) {
		DBCollection c = Helper.gettable(databasename);
		DBCursor cursor = c.find(
				new BasicDBObject("_id", new ObjectId(objectid))).limit(1);
		System.out.println("finbyObjectIDinDB");

		BasicDBObject obj = null;
		while (cursor.hasNext()) {
			obj = (BasicDBObject) cursor.next();

			System.out.println(obj.toString());

		}

		return (BasicDBObject) obj;
	}

	public static List<BasicDBObject> findAll(String databasename) {
		DBCollection c = Helper.gettable(databasename);
		DBCursor cursor = c.find();
		System.out.println("findAll");
		List<BasicDBObject> list = new ArrayList<BasicDBObject>();

		while (cursor.hasNext()) {
			BasicDBObject obj = (BasicDBObject) cursor.next();
			list.add(obj);
			System.out.println(obj.toString());
		}
		return list;
	}

	public static BasicDBObject findbyattributvalueDB(String databasename,
			String attribut, String value) {
		DBCollection c = Helper.gettable(databasename);
		DBCursor cursor = c.find(new BasicDBObject(attribut, value));
		System.out.println("findbyattributvalueDB");

		while (cursor.hasNext()) {
			System.out.println(cursor.next().toString());
		}

		return (BasicDBObject) cursor.next();
	}

}
