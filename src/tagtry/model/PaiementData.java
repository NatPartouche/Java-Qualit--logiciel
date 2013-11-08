package tagtry.model;


public class PaiementData {
private String cardnumber;

public void setCardnumber(String value) {
   this.cardnumber = value;
}

public String getCardnumber() {
   return this.cardnumber;
}

private String cardid;

public void setCardid(String value) {
   this.cardid = value;
}

public String getCardid() {
   return this.cardid;
}

private String expirationdate;

public void setExpirationdate(String value) {
   this.expirationdate = value;
}

public String getExpirationdate() {
   return this.expirationdate;
}

private String securitycode;

public void setSecuritycode(String value) {
   this.securitycode = value;
}

public String getSecuritycode() {
   return this.securitycode;
}

/**
 * <pre>
 *           1..1     1..1
 * PaiementData ------------------------- Client
 *           paiementData        &lt;       user
 * </pre>
 */
private Client user;

public void setUser(Client value) {
   this.user = value;
}

public Client getUser() {
   return this.user;
}

}
