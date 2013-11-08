package tagtry.comlayout;

import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public final class Helper {

	public static void post(String url, List<NameValuePair> params) {
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httppost = new HttpPost(url);
		System.out.println(url);
		System.out.println(params.toString());

		try {
			httppost.setHeader("Content-Type", "application/json");
			httppost.setEntity(new UrlEncodedFormEntity(params));
			HttpResponse response = httpclient.execute(httppost);
			System.out.println(response.getStatusLine());
			HttpEntity entity = response.getEntity();
			String json = EntityUtils.toString(entity);
			System.out.println(json);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	/*
	 * params for parse.com
	 */

	public static void post(String url, JSONObject data) {
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httppost = new HttpPost(url);
		System.out.println(url);

		try {
			httppost.addHeader("X-Parse-Application-Id", ParseHelper.appid);
			httppost.addHeader("X-Parse-REST-API-Key", ParseHelper.appkey);
			httppost.addHeader("Content-Type", ParseHelper.content);
			httppost.setEntity(new StringEntity(data.toString()));
			HttpResponse response = httpclient.execute(httppost);
			System.out.println(response.getStatusLine());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void get(String url) {

		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(url);
		try {
			httpget.setHeader("Content-Type", "application/json");
			HttpResponse response = httpclient.execute(httpget);
			System.out.println(response.getStatusLine());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
