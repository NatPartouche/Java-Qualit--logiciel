package tagtry.dblayout;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class Helper {
	public static Connector connector;
	public static DB db;

	public static void start() throws IOException {

		connector = new Connector();
		connector.open();
		db = connector.mongoClient.getDB("tagtry");

	}

	public static Set<String> getAllCollection() {
		return db.getCollectionNames();
	}

	public static void createcollection(String name, BasicDBObject obj) {
		db.createCollection(name, obj);
	}

	public static void stop() throws IOException {
		connector.close();
		db.forceError();
		db.resetError();

	}

	public static DBCollection gettable(String name) {
		DBCollection colls = db.getCollection(name);
		return colls;
	}

	public static void removedb(String name) {
		db.dropDatabase();
	}

	public static void insert(String databasename, BasicDBObject obj) {
		DBCollection colls = db.getCollection(databasename);
		colls.insert(obj);
	}

	public static void update(String databasename, BasicDBObject objold,
			BasicDBObject objnew) {
		DBCollection testCollection = db.getCollection(databasename);
		testCollection.update(objold, objnew);
	}

	public static void remove(String database, BasicDBObject obj) {

		DBCollection testCollection = db.getCollection(database);
		testCollection.remove(obj);
	}

	public static DBObject find(String database, BasicDBObject obj) {

		DBCollection testCollection = db.getCollection(database);
		return testCollection.findOne();
	}

	public static void query(String databasename, BasicDBObject obj) {

		DBCollection testCollection = db.getCollection(databasename);
		DBCursor cursor = testCollection.find(obj).limit(10);
		System.out.println("counter query : " + cursor.count());
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}

	}

}
