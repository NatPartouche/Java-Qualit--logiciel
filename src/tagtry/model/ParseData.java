package tagtry.model;


public class ParseData extends ParseBasic {
private String surname;

public void setSurname(String value) {
   this.surname = value;
}

public String getSurname() {
   return this.surname;
}

private String password;

public void setPassword(String value) {
   this.password = value;
}

public String getPassword() {
   return this.password;
}

private String email;

public void setEmail(String value) {
   this.email = value;
}

public String getEmail() {
   return this.email;
}

private String authdata;

public void setAuthdata(String value) {
   this.authdata = value;
}

public String getAuthdata() {
   return this.authdata;
}

private boolean emailverified;

public void setEmailverified(boolean value) {
   this.emailverified = value;
}

public boolean isEmailverified() {
   return this.emailverified;
}

/**
 * <pre>
 *           1..1     1..1
 * ParseData ------------------------- Client
 *           parseData        &lt;       client
 * </pre>
 */
private Client client;

public void setClient(Client value) {
   this.client = value;
}

public Client getClient() {
   return this.client;
}

private String phone;

public void setPhone(String value) {
   this.phone = value;
}

public String getPhone() {
   return this.phone;
}

}
