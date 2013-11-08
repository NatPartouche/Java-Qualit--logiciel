package tagtry.model;

import java.util.Set;
import java.util.HashSet;

public class Selection {
/**
 * <pre>
 *           0..1     0..*
 * Selection ------------------------- Item
 *           selection        &gt;       item
 * </pre>
 */
private Set<Item> item;

public Set<Item> getItem() {
   if (this.item == null) {
this.item = new HashSet<Item>();
   }
   return this.item;
}

/**
 * <pre>
 *           1..1     1..1
 * Selection ------------------------- Visite
 *           selection        &lt;       visite
 * </pre>
 */
private Visite visite;

public void setVisite(Visite value) {
   this.visite = value;
}

public Visite getVisite() {
   return this.visite;
}

private String paiementmode;

public void setPaiementmode(String value) {
   this.paiementmode = value;
}

public String getPaiementmode() {
   return this.paiementmode;
}

private int amount;

public void setAmount(int value) {
   this.amount = value;
}

public int getAmount() {
   return this.amount;
}

/**
 * <pre>
 *           0..*     1..1
 * Selection ------------------------- Client
 *           selection        &lt;       client
 * </pre>
 */
private Client client;

public void setClient(Client value) {
   this.client = value;
}

public Client getClient() {
   return this.client;
}

private boolean validate;

public void setValidate(boolean value) {
   this.validate = value;
}

public boolean isValidate() {
   return this.validate;
}

}
