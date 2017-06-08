
import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

public class BigIntTest {

	@Test
	public void testAllCases() {
		List<BigInteger> testList = new BigIntArrayList(), 
				test2List = new BigIntArrayList(),
						test3List = new BigIntArrayList();
		String number = "13565732131213123125792835672564872368476283842312312312312345643234543245643245324532453245324532145324532453";
		
//		add(index, bigint)
//		addall(index, collection)
//		containsAll
//		get(index)
//		indexOf
		test2List.add(new BigInteger(number));
		boolean p = testList.add(new BigInteger(number));
		//System.out.println(res.get(0).getName());
		assertNotNull("Result can't be null", p);
		assertEquals(new BigInteger(number), testList.get(0));
		assertTrue(testList.containsAll(test2List));
		assertEquals(0, testList.indexOf(testList.get(0)));
		assertTrue(test3List.isEmpty());
		
		
		
		for(int i=0; i<15; i++){
			test3List.add(new BigInteger(number));
		}
		Iterator<BigInteger> iter = test3List.iterator();
		int j=0;

		while(iter.hasNext()){
			iter.next();
			
			j++;
		}
		assertEquals(14, j);
		assertEquals(14, test3List.lastIndexOf(new BigInteger(number)));
		j=0;
		ListIterator<BigInteger> listIter = test3List.listIterator(5);
		while(listIter.hasNext()){
			listIter.next();
			j++;
		}
		assertEquals(9, j);
		assertTrue(listIter.hasPrevious());
		assertEquals(15, listIter.nextIndex());
		listIter.remove();
		assertEquals(14, test3List.size());
		listIter.previous();
		listIter.set(new BigInteger("1"));
		assertEquals(14, test3List.size());
		listIter.add(new BigInteger("1"));
		assertEquals(15, test3List.size());
		
		List<BigInteger> sublistTest = test3List.subList(5, 7);
		assertEquals(3, sublistTest.size());
		
	}
	
//	@Test
//	public void testFindByField() throws NoSuchFieldException, SecurityException {
//		CustomerServiceInterface cs = new CustomerService(DataProducer.getTestData(10));
//		
//		List<Customer> res = cs.findByField("email", "email");
//		//System.out.println(res.get(0).getName());
//		assertNotNull("Result can't be null", res);
//		assertEquals(10, res.size());
//	}
//	
//	@Test
//	public void testCustomersWhoBoughtMoreThan() {
//		CustomerServiceInterface cs = new CustomerService(DataProducer.getTestData(10));
//		
//		List<Customer> res = cs.customersWhoBoughtMoreThan(2);
//
//		assertNotNull("Result can't be null", res);
//		assertEquals(5, res.size());
//	}
//	
//	@Test
//	public void testCustomersWhoSpentMoreThan() {
//		CustomerServiceInterface cs = new CustomerService(DataProducer.getTestData(10));
//		
//		List<Customer> res = cs.customersWhoSpentMoreThan(2);
//		
//		assertNotNull("Result can't be null", res);
//		assertEquals(4, res.size());
//	}
//	
//	@Test
//	public void testCustomersNoOrders() {
//		CustomerServiceInterface cs = new CustomerService(DataProducer.getTestData(10));
//		
//		List<Customer> res = cs.customersWithNoOrders();
//
//		assertNotNull("Result can't be null", res);
//		assertEquals(3, res.size());
//	}
//	
//	@Test
//	public void testAddProductsToAllAndWasProductBought() {
//		CustomerServiceInterface cs = new CustomerService(DataProducer.getTestData(10));
//		Product xxx = new Product(185, "13 ziaren piasku" , 2.99);
//		cs.addProductToAllCustomers(xxx);
//		
//		int res = cs.countBuys(xxx);
////		System.out.println(res.size());
//		assertNotNull("Result can't be null", res);
//		assertEquals(10, res);
//	}
//	
//	@Test
//	public void testCountOfProducts() {
//		CustomerServiceInterface cs = new CustomerService(DataProducer.getTestData(10));
//		Product xxx = new Product(186, "17 ziaren piasku" , 2.98);
//		cs.addProductToAllCustomers(xxx);
//		
//		int res = cs.countCustomersWhoBought(xxx);
////		System.out.println(res.size());
//		assertNotNull("Result can't be null", res);
//		assertEquals(10, res);
//	}
//	
//	@Test
//	public void testAvgProducts() {
//		CustomerServiceInterface cs = new CustomerService(DataProducer.getTestData(10));
//	
//		
//		double res = cs.avgOrders(false);
//		System.out.println(res);
//		assertNotNull("Result can't be null", res);
//		assertEquals(4.0, res, 0.5);
//	}
//	
//	@Test
//	public void testMostPopular() {
//		CustomerServiceInterface cs = new CustomerService(DataProducer.getTestData(10));
//	
//		
//		List<Product> res = cs.mostPopularProduct();
//		assertNotNull("Result can't be null", res);
//		assertEquals(1, res.size());
//	}

}