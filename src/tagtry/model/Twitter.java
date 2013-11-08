package tagtry.model;


public class Twitter {
private String twitterToken;

public void setTwitterToken(String value) {
   this.twitterToken = value;
}

public String getTwitterToken() {
   return this.twitterToken;
}

private String twitterId;

public void setTwitterId(String value) {
   this.twitterId = value;
}

public String getTwitterId() {
   return this.twitterId;
}

/**
 * <pre>
 *           1..1     1..1
 * Twitter ------------------------- Social
 *           twitter        &lt;       social
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
