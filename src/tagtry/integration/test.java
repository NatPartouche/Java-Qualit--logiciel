package tagtry.integration;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import flexjson.JSONDeserializer;
import tagtry.dblayout.Creator;
import tagtry.dblayout.Finder;
import tagtry.dblayout.Helper;
import tagtry.dblayout.JdbcConnector;
import tagtry.dblayout.JdbcHelper;
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

		try {
			/*
			 * Helper.start(); Finder.findAll("client");
			 * System.out.println(Helper.getAllCollection().toString());
			 * Helper.stop(); INSERT INTO User VALUES (value2,value3);
			 */
			JdbcHelper.viewTable(JdbcConnector.open(), "User");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
