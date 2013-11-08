package tagtry.model;

import java.util.Set;
import java.util.HashSet;

public class Owner implements DatabaseInterface {
	/**
	 * <pre>
	 *           1..1     1..1
	 * Owner ------------------------- User
	 *           owner        &gt;       user
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
	 *           0..1     0..*
	 * Owner ------------------------- Store
	 *           owner        &gt;       store
	 * </pre>
	 */
	private Set<Store> store;

	public Set<Store> getStore() {
		if (this.store == null) {
			this.store = new HashSet<Store>();
		}
		return this.store;
	}

	private String facebookid;

	public void setFacebookid(String value) {
		this.facebookid = value;
	}

	public String getFacebookid() {
		return this.facebookid;
	}

	private String facebookSecret;

	public void setFacebookSecret(String value) {
		this.facebookSecret = value;
	}

	public String getFacebookSecret() {
		return this.facebookSecret;
	}

	public void save() {
		// TODO Auto-generated method stub

	}

	public void init(String json) {
		// TODO Auto-generated method stub

	}

}
