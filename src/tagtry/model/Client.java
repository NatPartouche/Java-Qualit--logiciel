package tagtry.model;

import java.util.Set;
import java.util.HashSet;

public class Client implements DatabaseInterface {
	/**
	 * <pre>
	 *           1..1     0..1
	 * Client ------------------------- User
	 *           client        &gt;       user
	 * </pre>
	 */
	private User user;

	public void setUser(User value) {
		this.user = value;
	}

	public User getUser() {
		return this.user;
	}

	/**
	 * <pre>
	 *           1..1     1..1
	 * Client ------------------------- Social
	 *           user        &gt;       social
	 * </pre>
	 */
	private Social social;

	public void setSocial(Social value) {
		this.social = value;
	}

	public Social getSocial() {
		return this.social;
	}

	/**
	 * <pre>
	 *           1..1     1..1
	 * Client ------------------------- PaiementData
	 *           user        &gt;       paiementData
	 * </pre>
	 */
	private PaiementData paiementData;

	public void setPaiementData(PaiementData value) {
		this.paiementData = value;
	}

	public PaiementData getPaiementData() {
		return this.paiementData;
	}

	private String sizeup;

	public void setSizeup(String value) {
		this.sizeup = value;
	}

	public String getSizeup() {
		return this.sizeup;
	}

	private int sizedown;

	public void setSizedown(int value) {
		this.sizedown = value;
	}

	public int getSizedown() {
		return this.sizedown;
	}

	private int sizeshoes;

	public void setSizeshoes(int value) {
		this.sizeshoes = value;
	}

	public int getSizeshoes() {
		return this.sizeshoes;
	}

	/**
	 * <pre>
	 *           1..1     0..*
	 * Client ------------------------- Selection
	 *           client        &gt;       selection
	 * </pre>
	 */
	private Set<Selection> selection;

	public Set<Selection> getSelection() {
		if (this.selection == null) {
			this.selection = new HashSet<Selection>();
		}
		return this.selection;
	}

	/**
	 * <pre>
	 *           1..1     1..1
	 * Client ------------------------- ParseInstallation
	 *           client        &gt;       parseInstallation
	 * </pre>
	 */
	private ParseInstallation parseInstallation;

	public void setParseInstallation(ParseInstallation value) {
		this.parseInstallation = value;
	}

	public ParseInstallation getParseInstallation() {
		return this.parseInstallation;
	}

	/**
	 * <pre>
	 *           1..1     1..1
	 * Client ------------------------- ParseData
	 *           client        &gt;       parseData
	 * </pre>
	 */
	private ParseData parseData;

	public void setParseData(ParseData value) {
		this.parseData = value;
	}

	public ParseData getParseData() {
		return this.parseData;
	}

	public void save() {
		// TODO Auto-generated method stub

	}

	public void init(String json) {
		// TODO Auto-generated method stub

	}

}
