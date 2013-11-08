package tagtry.model;

import java.util.Set;
import java.util.HashSet;

public class Visite implements DatabaseInterface {
	/**
	 * <pre>
	 *           1..1     1..1
	 * Visite ------------------------- Selection
	 *           visite        &gt;       selection
	 * </pre>
	 */
	private Selection selection;

	public void setSelection(Selection value) {
		this.selection = value;
	}

	public Selection getSelection() {
		return this.selection;
	}

	/**
	 * <pre>
	 *           1..1     1..1
	 * Visite ------------------------- Store
	 *           visite        &gt;       store
	 * </pre>
	 */
	private Store store;

	public void setStore(Store value) {
		this.store = value;
	}

	public Store getStore() {
		return this.store;
	}

	public void save() {
		// TODO Auto-generated method stub

	}

	public void init(String json) {
		// TODO Auto-generated method stub

	}

	/**
	 * <pre>
	 *           1..1     0..*
	 * Visite ------------------------- Client
	 *           visite        &gt;       client
	 * </pre>
	 */

}
