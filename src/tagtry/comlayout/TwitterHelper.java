package tagtry.comlayout;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import tagtry.model.Client;

public class TwitterHelper {

	public static String barseurl = "";

	public static void publish(Client client) {
		String TwitterID = client.getSocial().getTwitter().getTwitterId();
		String temp = barseurl + "twitter/proxy/statuses/update";
		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
		nameValuePairs.add(new BasicNameValuePair("twitter_screen_names",
				"natpartouche"));
		nameValuePairs.add(new BasicNameValuePair("status", "Message"));

		// Helper.post(url, nameValuePairs);
	}
}
