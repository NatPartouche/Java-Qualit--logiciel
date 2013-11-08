package tagtry.model;


public class Social {
/**
 * <pre>
 *           1..1     1..1
 * Social ------------------------- Client
 *           social        &lt;       user
 * </pre>
 */
private Client user;

public void setUser(Client value) {
   this.user = value;
}

public Client getUser() {
   return this.user;
}

/**
 * <pre>
 *           1..1     1..1
 * Social ------------------------- Twitter
 *           social        &gt;       twitter
 * </pre>
 */
private Twitter twitter;

public void setTwitter(Twitter value) {
   this.twitter = value;
}

public Twitter getTwitter() {
   return this.twitter;
}

/**
 * <pre>
 *           1..1     1..1
 * Social ------------------------- Facebook
 *           social        &gt;       facebook
 * </pre>
 */
private Facebook facebook;

public void setFacebook(Facebook value) {
   this.facebook = value;
}

public Facebook getFacebook() {
   return this.facebook;
}

}
