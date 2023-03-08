package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jpa.test.dao.UserRepo;
import com.jpa.test.entities.User;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class},scanBasePackages ="com.jpa.test")
//@EnableJpaRepositories("com.jpa.test") 
public class SpringBootJpacrudApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBootJpacrudApplication.class, args);
		UserRepo ur = con.getBean(UserRepo.class);

		// User 1

		User u1 = new User();
		u1.setName("pavan");
		u1.setSalary(363);
		ur.save(u1);
		 System.out.println(u1);
		 

		// user2
		User u2 = new User();
		u2.setName("kavan");
		u2.setSalary(143);
	//	User ur2 = ur.save(u2);
//		System.out.println(ur2);

		// saving multiple users
		/*
		 * List<User> users = List.of(u1,u2); 
		 * Iterable<User> resulset =ur.saveAll(users);
		 *  resulset.forEach(user-> { 
		 * System.out.println(user); 
		 * } );
		 */
		
		
		//updating -update the user of id 52
		
		
		 /* Optional<User> findById = ur.findById(52);
		  if(!findById.isEmpty()) {
		  User user = findById.get();
		  user.setName("kavann"); 
		  User updated = ur.save(user);
		  
		  System.out.println(updated);
		  }
		  else
		  {
			  System.out.println("does not exists");
		  }
		*/
		
		//ur.findbyid
		//retrieving one object
		
		/* Optional<User> findById = ur.findById(52); 
		 User user = findById.get();
		 System.out.println(user);
		 */
		
		//retrieving all objects
	/*	
		Iterable<User> findAll = ur.findAll();
		for(User u : findAll)
		{
			System.out.println(u);
		}
		*/
		
		//deleting the obj
		
		// ur.deleteById(53);
		 //System.out.println("deleted");
		 //ur.deleteAll();
		
		//Custom Methods
		   //findByName()
		/*System.out.println("find by name");
		List<User> findByName = ur.findByName("pavan");
		for (User u : findByName)
		{
			System.out.println(u);
		}
		
		   //findBySalary
		System.out.println("find by sal ");
		List<User> findBySalary = ur.findBySalary(143);
		for (User k : findBySalary)
		{
			System.out.println(k);
		}
		
		System.out.println("finding by name and salary");
		List<User> fbnas = ur.findByNameAndSalary("pavan", 363);
		for(User a : fbnas)
		{
			System.out.println(a);
		}
		System.out.println("finding by name or salary");
		List<User> fbnos = ur.findByNameOrSalary("pavan", 143);
		for(User o : fbnos)
		{
			System.out.println(o);
		}
		
		System.out.println("fetching the names starting with k");
		List<User> fbnsw = ur.findByNameStartingWith("k");
		for(User s : fbnsw)
		{
			System.out.println(s.getName());
		}
		
		//same with ending with 
		
		
		//conditions query
		 	//less than
		List<User> fbslt = ur.findBySalaryLessThan(300);
		
		for(User s : fbslt)
		{
			System.out.println(s.getName()+"  "+ s.getSalary());
		}
		//same with greater than 
		//same with greaterThanEqual
		 
		 */
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("ener the name");
//		String name = scan.next();
		
		
		
		//using Query annotation method
		
	/*	System.out.println("getting users using Query annotation");
		List<User> gau = ur.getAllUsers();
		for(User s :gau)
		{
			System.out.println(s.getName());
		}
		
		System.out.println("getallbyname fetch");
		List<User> abn = ur.getAllByName("pavan");
		for(User av :abn)
		{
			System.out.println(av);
		}
		System.out.println("getallbynameorsalary fetch");
		List<User> allByNameOrSalary = ur.getAllByNameOrSalary("pavan", 143);
		
		for(User res: allByNameOrSalary)
		{
			System.out.println(res);
		}
		*/
		
	}

}
