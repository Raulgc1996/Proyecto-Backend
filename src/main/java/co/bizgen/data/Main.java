package co.bizgen.data;

import java.util.List;

import co.bizgen.data.dao.RoleDAO;
import co.bizgen.data.dao.UserDAO;
import co.bizgen.data.dao.impl.HibernateRoleDAO;
import co.bizgen.data.dao.impl.HibernateUserDAO;
import co.bizgen.data.model.Role;
import co.bizgen.data.model.User;

/**
 * Hello world!sdasdasd
 *
 */
public class Main 
{
 
    		public static void showAll(RoleDAO roleDAO) {
    			// SELECT ALL DATA
//    			List<Role> roles = roleDAO.selectAll();
//    			System.out.println("--- Role ----- table contents	-----------");
//    			for (Role role : roles) {
//    				System.out.println("Id: " + role.getId());
//    				System.out.println(" - Name: " + role.getName());
//    				System.out.println(" - Description: " + role.getDescription());
//    			}
//    			System.out.println("Total Customers: " + roles .size());
//    		}
//
//    		public static void main(String[] args) {
//    			RoleDAO roleDAO = new HibernateRoleDAO();
//    			showAll(roleDAO);
//
//			// INSERT NEW DATA
//			Role newRoles = new Role(null,"aaa","aaaa");
//			roleDAO.insert(newRoles);
//			System.out.println("Inserted id: " + newRoles.getId());
//			newRoles = new Role(null,"ddd","ddd");
//			roleDAO.insert(newRoles);
//			System.out.println("Inserted id: " + newRoles.getId());		
//			System.out.println("\nShow data after new insert");
//			showAll(roleDAO);
//    			
////    			// SELECT JUST ONE
////    			Role onerRole = roleDAO.selectById(Long.valueOf(1));
////    			System.out.println("\nShow the customer with ID=1");
////    			System.out.println("--- ROLE ----- table contents	-----------");
////    			System.out.println("Selected Name: " + onerRole.getName());
////
////    			// UPDATE DATA
////    			newRoles.setDescription("sss");
////    			roleDAO.update(newRoles);
////    			System.out.println("\nShow data after update");
////    			showAll(roleDAO);
//
//    			// DELETE DATA
//    			roleDAO.delete(newRoles);
//    			System.out.println("\nShow data after deletion");
//    			showAll(roleDAO);
    		}
    }


//