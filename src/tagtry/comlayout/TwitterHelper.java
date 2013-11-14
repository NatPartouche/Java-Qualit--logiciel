package tagtry.comlayout;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import tagtry.model.Client;

public class TwitterHelper {

	public static String barseurl = "";

	public static void publish(Client client) {
		String facebookID = client.getSocial().getFacebook().getFacebookId();
		String url = basedurl + facebookID + "/feed";
		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
		nameValuePairs.add(new BasicNameValuePair("message", "message"));
		nameValuePairs.add(new BasicNameValuePair("access_token", client
				.getSocial().getFacebook().getFacebookToken()));

		Helper.post(url, nameValuePairs);
	}

}
