package tagtry.comlayout;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.mongodb.util.JSON;

import tagtry.model.Client;

public final class ParseHelper {

	public static String basedurl = "https://api.parse.com/1/";

	public static String appid = "kU6kf4bGitrrUvje1aiscCbvSPeHMkS1vRQSe16k";
	public static String appkey = "ycLv4268FKKdI0ZytAaItqUi5jVBuc7bHvQMMy6J";
	public static String content = "application/json";

	public static boolean createuser(Client client) throws JSONException,
			ClientProtocolException, IOException {
		String temp = basedurl + "users/";
		JSONObject data = new JSONObject();
		boolean returnvalue = false;
		data.put("name", client.getUser().getName());
		data.put("firstname", client.getUser().getFirstname());
		data.put("username", client.getParseData().getSurname());
		data.put("password", client.getParseData().getPassword());
		data.put("phone", client.getParseData().getPhone());
		data.put("email", client.getParseData().getEmail());
		if (Helper.post(temp, data) == 201) {
			returnvalue = true;
		} else if (Helper.post(temp, data) == 400) {
			returnvalue = false;
		}
		System.out.println(data.toString());
		return returnvalue;
	}

	public static boolean installation(Client client) {

		boolean returnvalue = false;
		String temp = basedurl + "installations/";

		try {
			JSONObject data = new JSONObject();

			data.put("deviceType", client.getParseInstallation()
					.getDeviceType());
			data.put("deviceToken", client.getParseInstallation()
					.getDeviceToken());
			JSONArray array = new JSONArray();
			array.put(client.getParseInstallation().getChannels());
			data.put("channels", array);
			System.out.println(data);
			if (Helper.post(temp, data) == 201) {
				returnvalue = true;
			} else if (Helper.post(temp, data) == 400) {
				returnvalue = false;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return returnvalue;

	}

	public static boolean sendpush(Client client) {

		String temp = basedurl + "push/";

		boolean returnvalue = false;
		try {
			JSONObject data = new JSONObject();
			data.put("alert", "Ricky Vaughn was injured in last night's game!");
			
			JSONArray array = new JSONArray();
			array.put("live");

			JSONObject obj = new JSONObject();
			obj.put("data", data);
			obj.put("channels", array);
			System.out.println(obj);
			if (Helper.post(temp, data) == 201) {
				returnvalue = true;
			} else if (Helper.post(temp, data) == 400) {
				returnvalue = false;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return returnvalue;

	}
}
