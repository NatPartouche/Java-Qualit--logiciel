package tagtry.comlayout;

import org.json.JSONArray;
import org.json.JSONObject;

import tagtry.model.Client;

public final class ParseHelper {

	public static String basedurl = "https://api.parse.com/1/";

	public static String appid = "kU6kf4bGitrrUvje1aiscCbvSPeHMkS1vRQSe16k";
	public static String appkey = "ycLv4268FKKdI0ZytAaItqUi5jVBuc7bHvQMMy6J";
	public static String content = "application/json";

	public static void createuser(Client client) {
		String temp = basedurl + "users/";
		JSONObject data = new JSONObject();

		try {

			data.put("name", client.getUser().getName());
			data.put("firstname", client.getUser().getFirstname());
			data.put("username", client.getParseData().getSurname());
			data.put("password", client.getParseData().getPassword());
			data.put("phone", client.getParseData().getPhone());
			data.put("email", client.getParseData().getEmail());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(data.toString());
		Helper.post(temp, data);

	}

	public static void installation(Client client) {

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
			Helper.post(temp, data);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void sendpush(Client client) {

	}
}
