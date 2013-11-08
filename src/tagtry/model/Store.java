package tagtry.model;

import java.util.HashSet;
import java.util.Set;

public class Store {
/**
 * <pre>
 *           0..*     0..1
 * Store ------------------------- Owner
 *           store        &lt;       owner
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
 *           1..1     1..1
 * Store ------------------------- Visite
 *           store        &lt;       visite
 * </pre>
 */
private Visite visite;

public void setVisite(Visite value) {
   this.visite = value;
}

public Visite getVisite() {
   return this.visite;
}

private String name;

public void setName(String value) {
   this.name = value;
}

public String getName() {
   return this.name;
}

private String adress;

public void setAdress(String value) {
   this.adress = value;
}

public String getAdress() {
   return this.adress;
}

private String city;

public void setCity(String value) {
   this.city = value;
}

public String getCity() {
   return this.city;
}

private String country;

public void setCountry(String value) {
   this.country = value;
}

public String getCountry() {
   return this.country;
}
private Set<Item> item;

public Set<Item> getItem() {
   if (this.item == null) {
this.item = new HashSet<Item>();
   }
   return this.item;
}


}
