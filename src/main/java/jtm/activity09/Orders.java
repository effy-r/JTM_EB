package jtm.activity09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import jtm.activity10.Person;

//public Iterator<Orders> orders;

/*- TODO #2
 * Implement Iterator interface with Orders class
 * Hint! Use generic type argument of iterateable items in form: Iterator<Order>
 * 
 * TODO #3 Override/implement public methods for Orders class:
 * - Orders()                — create new empty Orders
 * - add(Order item)            — add passed order to the Orders
 * - List<Order> getItemsList() — List of all customer orders
 * - Set<Order> getItemsSet()   — calculated Set of Orders from list (look at description below)
 * - sort()                     — sort list of orders according to the sorting rules
 * - boolean hasNext()          — check is there next Order in Orders
 * - Order next()               — get next Order from Orders, throw NoSuchElementException if can't
 * - remove()                   — remove current Order (order got by previous next()) from list, throw IllegalStateException if can't
 * - String toString()          — show list of Orders as a String
 * 
 * Hints:
 * 1. To convert Orders to String, reuse .toString() method of List.toString()
 * 2. Use built in List.sort() method to sort list of orders
 * 
 * TODO #4
 * When implementing getItemsSet() method, join all requests for the same item from different customers
 * in following way: if there are two requests:
 *  - ItemN: Customer1: 3
 *  - ItemN: Customer2: 1
 *  Set of orders should be:
 *  - ItemN: Customer1,Customer2: 4
 */

public class Orders implements Iterator<Order> {

	public List<Order> orderList;
	public ListIterator<Order> orderIterator;

	public Orders() {
		orderList = new ArrayList<Order>();
		// this.orderIterator = orderIterator;
		orderIterator = orderList.listIterator();

	}

	public void add(Order item) {
		
		orderIterator.add(item);
		
			orderIterator.previous();
		
		//orderIterator.previous();
	}

	public List<Order> getItemsList() {

		List <Order> copyList = new ArrayList<Order>();
		Collections.copy(orderList, copyList);

		return copyList;

	}

	

	public Set<Order> getItemsSet() {

		// Set copySet = null;

		Set<Order> copySet = new HashSet<Order>();

		for (int i = 0; i < orderList.size(); i++) {
			copySet.add(orderList.get(i));
		}

		return copySet;

	}

	public void sort() {

		Collections.sort(orderList);
	}

	@Override
	public boolean hasNext() {

		return orderIterator.hasNext();

	}

	@Override
	public Order next() {
		
		//order = orderIterator.next();
		
		return (Order) this.orderIterator.next();

	}

	public void remove() {
		orderIterator.remove();

	}

	@Override
	public String toString() {

		return Arrays.toString(orderList.toArray());

	}

	// missing methods
//	public java.lang.Object jtm.activity09.Orders.next()
//	public java.lang.String jtm.activity09.Orders.toString()
//	public java.util.List jtm.activity09.Orders.getItemsList()
//	public java.util.Set jtm.activity09.Orders.getItemsSet()
//	public jtm.activity09.Order jtm.activity09.Orders.next()

	/*-
	 * TODO #1
	 * Create data structure to hold:
	 *   1. some kind of collection of Orders (e.g. some List)
	 *   2. index to the current order for iterations through the Orders in Orders
	 *   Hints:
	 *   1. you can use your own implementation or rely on .iterator() of the List
	 *   2. when constructing list of orders, set number of current order to -1
	 *      (which is usual approach when working with iterateable collections).
	 */
}
