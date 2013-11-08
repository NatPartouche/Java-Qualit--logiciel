package tagtry.model;


public class Facebook {
private String facebookId;

public void setFacebookId(String value) {
   this.facebookId = value;
}

public String getFacebookId() {
   return this.facebookId;
}

private String facebookToken;

public void setFacebookToken(String value) {
   this.facebookToken = value;
}

public String getFacebookToken() {
   return this.facebookToken;
}

/**
 * <pre>
 *           1..1     1..1
 * Facebook ------------------------- Social
 *           facebook        &lt;       social
 * </pre>
 */
private Social social;

public void setSocial(Social value) {
   this.social = value;
}

public Social getSocial() {
   return this.social;
}

}
