package tagtry.model;

public class User {
	@Override
	public String toString() {
		return "{ \"owner\": " + owner + ", \"client\":" + client
				+ ", \"name\":" + name + ", \"firstname:\"" + firstname
				+ ", \"age\":" + age + ", \"gender\":" + gender + "}";
	}

	/**
	 * <pre>
	 *           1..1     1..1
	 * User ------------------------- Owner
	 *           user        &lt;       owner
	 * </pre>
	 */
	private Owner owner;

	public void setOwner(Owner value) {
		this.owner = value;
	}

	public Owner getOwner() {
		return this.owner;
	}

	/**
	 * <pre>
	 *           0..1     1..1
	 * User ------------------------- Client
	 *           user        &lt;       client
	 * </pre>
	 */
	private Client client;

	public void setClient(Client value) {
		this.client = value;
	}

	public Client getClient() {
		return this.client;
	}

	private String name;

	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return this.name;
	}

	private String firstname;

	public void setFirstname(String value) {
		this.firstname = value;
	}

	public String getFirstname() {
		return this.firstname;
	}

	private int age;

	public void setAge(int value) {
		this.age = value;
	}

	public int getAge() {
		return this.age;
	}

	private String gender;

	public void setGender(String value) {
		this.gender = value;
	}

	public String getGender() {
		return this.gender;
	}

}
