package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import custom_exceptions.CustomerHandlingException;
import static com.app.core.Customer.sdf;

public class CustomerValidationRules {
	public static Date endDate;
	static {
		try {
			endDate = sdf.parse("1-1-1995");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

//add a static method , to validate all customer i/ps
	public static Customer validateAllInputs(String name, String email, String password, double regAmount, String dob,
			String plan, ArrayList<Customer> customers) throws CustomerHandlingException,ParseException {
		validateEmail(email);
		validatePassword(password);
		ServicePlan servicePlan = validateServicePlanRegAmount(plan, regAmount);
		Date customerDob = validateDob(dob);
		checkForDup(email, customerDob, customers);
		// => all inputs are valid
		return new Customer(name, email, password, regAmount, customerDob, servicePlan);

	}

	public static void validatePassword(String password) throws CustomerHandlingException {
		// password must be min 4 max 10 chars long. Must contain atleast 1 special
		// character : # @ $ % * -
		if (password.length() < 4 || password.length() > 10)
			throw new CustomerHandlingException("Invalid Password length!!!!!!!!!!!!!!");
		String regEx = ".*[#@$%*\\-]+.*";
		if (!password.matches(regEx))
			throw new CustomerHandlingException("Password not sufficiently strong!!!!!!!!!!!");
	}

	public static void validateEmail(String email) throws CustomerHandlingException {
		// email must contain "@" & should be end with either ".com" or ".org" domain
		if ((email.contains("@")) && (email.endsWith(".com") || email.endsWith(".org")))
			return;
		// => invalid email
		throw new CustomerHandlingException("Invalid Email !!!!!!!!!");

	}

	public static void checkForDup(String email, Date customerDob, ArrayList<Customer> customers) {
		// TODO Auto-generated method stub

	}

	public static Date validateDob(String dob) throws ParseException, CustomerHandlingException {
		Date d1 = sdf.parse(dob);
		// parsing success
		// dob should be before 1st Jan 1995
		if (d1.before(endDate))
			return d1;
		throw new CustomerHandlingException("Invalid DoB!!!!!!!!!!!!!!!");
	}

	public static ServicePlan validateServicePlanRegAmount(String plan, double regAmount)
			throws IllegalArgumentException, CustomerHandlingException {
		// parse string ---> enum (plan)
		ServicePlan servicePlan = ServicePlan.valueOf(plan.toUpperCase());
		// valid plan
		if (regAmount == servicePlan.getPlanCharges())
			return servicePlan;
		// invalid reg amount
		throw new CustomerHandlingException("Invalid Reg Amount : doesn't support the chosen plan !!!!!!!!!");
	}

}
