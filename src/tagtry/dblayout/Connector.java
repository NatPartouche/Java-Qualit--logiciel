package tagtry.dblayout;

import java.io.IOException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Connector {

	public MongoClient mongoClient;

	public void open() throws IOException {
		if (mongoClient != null) {
		} else {
			mongoClient = new MongoClient();
		}
	}

	public void close() throws IOException {
		if (mongoClient != null) {
			mongoClient.close();
			mongoClient = null;
		} else {
			mongoClient = new MongoClient();
		}
	}

}
