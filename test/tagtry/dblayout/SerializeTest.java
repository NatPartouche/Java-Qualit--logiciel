package tagtry.dblayout;

import static org.junit.Assert.*;

import javax.persistence.GenerationType;

import org.junit.Test;

import com.mongodb.DBObject;

import tagtry.dblayout.Creator;
import tagtry.dblayout.Generator;
import tagtry.dblayout.Serializer;
import tagtry.integration.test.classes;
import tagtry.model.User;

public class SerializeTest {

	@Test
	public void SerializeClientTest() {
		Object o = Serializer.Serialize(Creator.create_user(
				Generator.randomstring(), Generator.randomstring(),
				Generator.randomint(), Generator.randomgender()));

		DBObject value = (DBObject) Serializer.Serialize(o);

		if (value.getClass() == DBObject.class) {

		}

	}

	@Test
	public void DeserializeUserTest() {
		/*
		 * User o = (User) Serializer.Serialize(Creator.create_user(
		 * Generator.randomstring(), Generator.randomstring(),
		 * Generator.randomint(), Generator.randomgender()));
		 * System.out.println("DeserializeUserTest : " + o.toString()); User ob
		 * = (User) Serializer.DeSerialize(o.toString(), classes.User);
		 * System.out.println("DeserializeUserTest : " + ob.toString());
		 * 
		 * assertEquals(ob, o);
		 */

	}

	@Test
	public void SerializeOwnerTest() {

	}

	@Test
	public void SerializeItemTest() {

	}

	@Test
	public void SerializeStoreTest() {
	}

	@Test
	public void SerializeSocialTest() {

	}

	@Test
	public void SerializeParseDataTest() {

	}

	@Test
	public void SerializeParseInstallationTest() {

	}

	public void SerializeUserTest() {
	}

}
