package tagtry.dblayout;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import tagtry.dblayout.Connector;

public class ConnectorTest {

	@Test
	public void testopen() {
		Connector c = new Connector();
		boolean value = false;
		try {
			c.open();
			if (c.mongoClient != null) {
				value = true;
			} else {
				value = false;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue(value);
	}

	@Test
	public void testclose() {
		Connector c = new Connector();
		boolean value = false;
		try {
			c.open();
			c.close();
			if (c.mongoClient != null) {
				value = true;
			} else {
				value = false;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertFalse(value);
	}
}
