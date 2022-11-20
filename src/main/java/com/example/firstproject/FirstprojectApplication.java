package com.example.firstproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class FirstprojectApplication {
	// swagger http://localhost:8080/swagger-ui/index.html#/
	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}


	/*@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate){
		return args -> {
			Address address =new Address(
					"tunis",
					"tunis",
					"2050"
			);
			List<String> lou = Arrays.asList("math");
			String email="samar.68@gmail.com";
			Student student = new Student(
					"samar",
					"lahmar",
					email,
					Gender.FEMALE,
					address,
					lou,
					BigDecimal.TEN,
					LocalDateTime.now());

			//usingMongoTemplateAndQuery(repository, mongoTemplate, email, student);

			//using repository

			repository.findStudentByEmail(email).ifPresentOrElse(s ->{
				System.out.println(s + "already exist");
			},()->{
				System.out.println("Inserting student"+ student);
				repository.insert(student);
			});


		};

	}

	private static void usingMongoTemplateAndQuery(StudentRepository repository, MongoTemplate mongoTemplate, String email, Student student) {
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(email));

		List<Student> students = mongoTemplate.find(query,Student.class);
		if(students.size()>1){
			throw new IllegalStateException("found many students with email: "+ email);
		}

		if(students.isEmpty()){
			System.out.println("Inserting student"+ student);
			repository.insert(student);
		}else {
			System.out.println(student + "already exist");
		}
	}*/

}
