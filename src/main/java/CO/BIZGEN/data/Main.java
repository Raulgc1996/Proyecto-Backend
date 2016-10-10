package CO.BIZGEN.data;

import java.util.List;



import CO.BIZGEN.data.dao.UserDAO;
import CO.BIZGEN.data.dao.impl.HibernateUserDAO;

import CO.BIZGEN.data.model.User;

public class Main {

	/**
	 * App entry point.
	 * 
	 * @param userDAO
	 */
	public static void showAll(UserDAO userDAO) {
		// SELECT ALL DATA
		List<User> users = userDAO.selectAll();
		System.out.println("--- CUSTOMER ----- table contents	-----------");
		for (User customer : users) {
			System.out.println("Id: " + customer.getId());
			System.out.println(" - Name: " + customer.getUsername());
			System.out.println(" - Password: " + customer.getPassword());
		}
		System.out.println("Total Users: " + users.size());
	}
	public static void main(String[] args) {
		UserDAO userDAO = new HibernateUserDAO();
		showAll(userDAO);
	}}