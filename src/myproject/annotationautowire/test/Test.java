package myproject.annotationautowire.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.annotationautowire.beans.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/annotationautowire/resources/applicationContext.xml");
		Employee employee = (Employee) context.getBean("employee");
		employee.getEmpDetails();
	}
}
