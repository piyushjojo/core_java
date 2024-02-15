package utils;

import static utils.CustomerValidationRules.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Customer;

import custom_exceptions.CustomerHandlingException;

public class CMSUtils {
//add a static method for user authentication(login)
	public static Customer autheticateCustomer(String email, String dob, String pwd, ArrayList<Customer> custs)
			throws CustomerHandlingException, ParseException {
		Customer customer = findByPK(email, dob, custs);
		// email n dob : valid , now validate n then chk pwd
		validatePassword(pwd);
		if (!pwd.equals(customer.getPassword()))
			throw new CustomerHandlingException("Mismatched Password");
		return customer;
	}

	// add a static method to find a customer by it's PK
	public static Customer findByPK(String email, String dob, ArrayList<Customer> customers)
			throws CustomerHandlingException, ParseException {
		validateEmail(email);
		Date d1 = validateDob(dob);
		// public int indexOf(Object o)
		Customer c = new Customer(email, d1);
		int index = customers.indexOf(c);
		if (index == -1)
			throw new CustomerHandlingException("Invalid Email or DoB");
		// => email n dob is valid , so get customer details from the AL
		return customers.get(index);
	}

	// add a method to change pwd
	public static String changePassword(String email, String dob, String oldPass, String newPass,
			ArrayList<Customer> list) throws CustomerHandlingException, ParseException {
		Customer autheticatedCustomer = autheticateCustomer(email, dob, oldPass, list);
		//customer logged in successfully !
		if(autheticatedCustomer.getCard() == null)//=> card not yet linked)
				throw new CustomerHandlingException("Can't change Pwd : Adhar Card not yet linked!!!!!!!!");
		//card linked , validate new pwd n update it!
		validatePassword(newPass);
		//new pwd is valid
		autheticatedCustomer.setPassword(newPass);
		return "Changed Password successfully.....";
	}

}
