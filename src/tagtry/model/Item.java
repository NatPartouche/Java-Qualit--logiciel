package tagtry.model;


public class Item {
/**
 * <pre>
 *           0..*     0..1
 * Item ------------------------- Selection
 *           item        &lt;       selection
 * </pre>
 */
private Selection selection;

public void setSelection(Selection value) {
   this.selection = value;
}

public Selection getSelection() {
   return this.selection;
}

public void setStore(Store value) {
   this.store = value;
}

private String title;

public void setTitle(String value) {
   this.title = value;
}

public String getTitle() {
   return this.title;
}

private String subtitle;

public void setSubtitle(String value) {
   this.subtitle = value;
}

public String getSubtitle() {
   return this.subtitle;
}

private String description;

public void setDescription(String value) {
   this.description = value;
}

public String getDescription() {
   return this.description;
}

/**
 * <pre>
 *           0..*     1..1 * Item ------------------------- Store
 *           item        &gt;       store
 * </pre>
 */
private Store store;

public Store getStore() {
   return this.store;
}


}
