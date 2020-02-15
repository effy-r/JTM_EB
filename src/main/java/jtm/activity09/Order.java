package jtm.activity09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

/*- TODO #1
 * Implement Comparable interface with Order class
 * Hint! Use generic type of comparable items in form: Comparable<Order>
 * 
 * TODO #2 Override/implement necessary methods for Order class:
 * - public Order(String orderer, String itemName, Integer count) — constructor of the Order
 * - public int compareTo(Order order) — comparison implementation according to logic described below
 * - public boolean equals(Object object) — check equality of orders
 * - public int hashCode() — to be able to handle it in some hash... collection 
 * - public String toString() — string in following form: "ItemName: OrdererName: Count"
 * 
 * Hints:
 * 1. When comparing orders, compare their values in following order:
 *    - Item name
 *    - Customer name
 *    - Count of items
 * If item or customer is closer to start of alphabet, it is considered "smaller"
 * 
 * 2. When implementing .equals() method, rely on compareTo() method, as for sane design
 * .equals() == true, if compareTo() == 0 (and vice versa).
 * 
 * 3. Also Ensure that .hashCode() is the same, if .equals() == true for two orders.
 * 
 */

public class Order implements Comparable<Order> {
	String customer; // Name of the customer
	String name; // Name of the requested item
	int count; // Count of the requested items
	private List<Order> hashCodeInt;

	public Order(String orderer, String itemName, Integer count) {
		customer = orderer;
		name = itemName;
		this.count = count;

	}

//	public boolean equals(Object object) {
//
//		System.out.println("Objekts: " + object);
//		System.out.println("Order: " + Order.this);
//
//		if (this.toString().contentEquals(object.toString())) {
//
//			System.out.println("True statement");
//
//			return true;
//
//		} else {
//
//			System.out.println("False statement");
//
//			return false;
//		}
//	}
//
//	
//	@Override
//	public int hashCode() {
//
//		int hash = 0;
//
//		if (equals(this)) {
//			
//			hash = 5;
//		}
//		else {
//			hash = (count*15)-3;
//			
//
//	}
//		return hash;
//	}

	@Override
	public String toString() {
		return "ItemName: " + name + " OrdererName: " + customer + " Count " + count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((hashCodeInt == null) ? 0 : hashCodeInt.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (count != other.count)
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (hashCodeInt == null) {
			if (other.hashCodeInt != null)
				return false;
		} else if (!hashCodeInt.equals(other.hashCodeInt))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Order order) {
		// TODO Auto-generated method stub

		if ((Order.this.name.compareTo(order.name) != 0)) {

			return ((Order.this.name.compareTo(order.name)) > 0) ? 1 : -1;
		}

		else if ((Order.this.customer.compareTo(order.customer) != 0)) {

			return ((Order.this.customer.compareTo(order.customer)) > 0) ? 1 : -1;
		} else if ((Order.this.count != (order.count))) {

			return (Order.this.count > order.count) ? 1 : -1;
		}

		return 0;

	}
}

/*
 * java.lang.AssertionError: 'ItemName: ItemNameA OrdererName: OrdererACount
 * 10'. compareTo('ItemName: ItemNameA OrdererName: OrdererBCount 10') customer
 * comparison error. expected:<-1> but was:<0>
 * 
 */