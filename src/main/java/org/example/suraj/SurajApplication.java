package org.example.suraj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SurajApplication {

	public static void main(String[] args) {
	ApplicationContext context = 	SpringApplication.run(SurajApplication.class, args);
	 EmployeeRepository emp =	context.getBean(EmployeeRepository.class);

		LaptopRepository lap = context.getBean(LaptopRepository.class);

		coursRepository crs =	context.getBean(coursRepository.class);
		studentRepository std = context.getBean(studentRepository.class);
		//EMPLOYEE
//		Employee emp1 = new Employee();
//		emp1.setId(20);
//		emp1.setName("Ranu");
//		emp1.setState("cuttack");




		//Laptop
//		Laptop lap1 = new Laptop();
//		lap1.setId(260);
//		lap1.setModel_name("HP");
//		lap1.setPrice(85000);
//
//		// Connect one to one
//		lap1.setEmployee(emp1);
//		emp1.setLaptop(lap1);



//		Laptop laps =lap.save(lap1);
//		System.out.println(laps);

//		Employee e=emp.save(emp1);
//		System.out.println(e);
        // delete  employee with laptop
		emp.deleteById(16);
        //bidirectional
		Employee e = emp.findById(15).get();
		System.out.println(e.getName());
		System.out.println(e.getLaptop());

		Course c1=new Course();
		c1.setCourseId(1);
		c1.setCourseName("hindi");
		crs.save(c1);


		Student s1 = new Student();
		s1.setStudent_id(2);
		s1.setName("Dheeraj");
		s1.setAge(22);
		s1.setAddress("Bihar");
		s1.setCourses(c1);

		std.save(s1);
        // unidirectional
		Student std1 = std.findById(2).get();
		System.out.println(std1.getName());
		Course cs=std1.getCourses();
		System.out.println(cs.getCourseName());




		Course courget = crs.findById(1).get();
		System.out.println(courget.getCourseName());






















	}

}
