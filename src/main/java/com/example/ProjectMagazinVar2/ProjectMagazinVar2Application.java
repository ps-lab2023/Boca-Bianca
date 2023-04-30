package com.example.ProjectMagazinVar2;

import com.example.ProjectMagazinVar2.Repository.AdminRepository;
import com.example.ProjectMagazinVar2.Repository.ProductRepository;
import com.example.ProjectMagazinVar2.Repository.UserRepository;
import com.example.ProjectMagazinVar2.Service.ServiceImplementation.ProductServiceImplementation;
import com.example.ProjectMagazinVar2.Service.ServiceImplementation.UserServiceImplementation;
import com.example.ProjectMagazinVar2.model.Admin;
import com.example.ProjectMagazinVar2.model.Product;
import com.example.ProjectMagazinVar2.model.User;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.text.SimpleDateFormat;
import java.util.Date;


@EntityScan
@SpringBootApplication
@EnableJpaRepositories
//@ComponentScan({"com.magazin.magazinBunSper.repository"})
public class ProjectMagazinVar2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMagazinVar2Application.class, args);
	}
	@Bean
	CommandLineRunner init (AdminRepository adminRepository, UserRepository userRepository, ProductRepository productRepository){
		return args -> {

			ProductServiceImplementation productServiceImplementation=new ProductServiceImplementation(productRepository);

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String formattedDate = dateFormat.format(new Date());

			Admin adminPrincipal = new Admin();
			//UserService service=new UserService(userRepository);
			adminPrincipal.setId(1);
			adminPrincipal.setNameAdmin("Calina");
			adminPrincipal.setPrenumeAdmin("Popotoiu");
			adminPrincipal.setParolaAdmin("aaab");
//			adminPrincipal.setFunctie("Director");
			adminRepository.save(adminPrincipal);

			User user1=new User();
			user1.setNumeClient("Catalina");
			user1.setPrenumeClient("Bubulina");
			user1.setAdresaEmail("calina@yahoo.com");
			user1.setAdresa("Strada Lalelelor");
			user1.setParola("155");
			user1.setDataLogare(formattedDate);
			userRepository.save(user1);


			User user3=new User();
			user3.setNumeClient("Mitica");
			user3.setPrenumeClient("Larisa");
			user3.setAdresaEmail("miticalarisa24@yahoo.com");
			user3.setParola("mitica");
			user3.setAdresa("Strada Paduchilor");
			user3.setDataLogare(formattedDate);
			userRepository.save(user3);

			Product produs1=new Product();
			produs1.setNameProduct("Geaca primavara-toamna");
			produs1.setQuantity(20);
			produs1.setPretProdus(200);
			produs1.setBrand("Jordan");
			produs1.setImages("assets/images/geacaprimavaratoamna.jpg");
			produs1.setGender("feminin");
			//produs1.setUser(user1);
			productRepository.save(produs1);


			Product produs3=new Product();
			produs3.setNameProduct("Patrizia Palton primava-toamna");
			produs3.setQuantity(40);
			produs3.setPretProdus(150);
			produs3.setBrand("Nike");
			produs3.setImages("assets/images/Patrizia palton primava-toamna.jpg");
			produs3.setGender("feminin");
			productRepository.save(produs3);
//
			Product produs4=new Product();
			produs4.setNameProduct("Pantaloni Tappered");
			produs4.setQuantity(20);
			produs4.setPretProdus(100);
			produs4.setBrand("Nike");
			produs4.setImages("assets/images/Pantaloni Tappered.jpg");
			produs4.setGender("feminin");
			//produs4.setUser(user1);
			productRepository.save(produs4);

			Product produs5=new Product();
			produs5.setNameProduct("Adidas Original ");
			produs5.setQuantity(20);
			produs5.setPretProdus(120);
			produs5.setBrand("Adidas");
			produs5.setImages("assets/images/hanorac.jpg");
			produs5.setGender("feminin");
			//produs6.setUser(user1);
			productRepository.save(produs5);

			Product produs6=new Product();
			produs6.setNameProduct("Pulover Caleb");
			produs6.setQuantity(30);
			produs6.setPretProdus(150);
			produs6.setBrand("Adidas");
			produs6.setImages("assets/images/pulover caleb.jpg");
			produs6.setGender("masculin");

			//produs6.setUser(user1);
			productRepository.save(produs6);

			Product produs7=new Product();
			produs7.setNameProduct("Geaca primavara-toamna ");
			produs7.setQuantity(20);
			produs7.setPretProdus(40);
			produs7.setBrand("Nike");
			produs7.setImages("assets/images/Barbati Geaca primavara-toamna.jpg");
			produs7.setGender("masculin");
			productRepository.save(produs7);

			Product produs8=new Product();
			produs8.setNameProduct("Pulover Zayn");
			produs8.setQuantity(20);
			produs8.setPretProdus(200);
			produs8.setBrand("Adidas");
			produs8.setImages("assets/images/pulover zayn.jpg");
			produs8.setGender("masculin");
			//produs8.setUser(user1);
			productRepository.save(produs8);

			Product produs9=new Product();
			produs9.setNameProduct("Regular Fit Camasa");
			produs9.setQuantity(20);
			produs9.setPretProdus(200);
			produs9.setBrand("Adidas");
			produs9.setImages("assets/images/Regular Fit Camasa.jpg");
			produs9.setGender("masculin");
			//produs9.setUser(user1);
			productRepository.save(produs9);

			Product produs10=new Product();
			produs10.setNameProduct("Bluza Molton");
			produs10.setQuantity(20);
			produs10.setPretProdus(720);
			produs10.setBrand("Jordan");
			produs10.setImages("assets/images/bluza de molton jordan copi.jpg");
			//produs10.setUser(user1);
			produs10.setGender("kids");
			productRepository.save(produs10);

			Product produs11=new Product();
			produs11.setNameProduct("Bluza de Molton Urban Kids");
			produs11.setQuantity(20);
			produs11.setPretProdus(80);
			produs11.setBrand("Jordan");
			produs11.setImages("assets/images/bluza de molton urban kids.jpg");
			//produs11.setUser(user1);
			produs11.setGender("kids");
			productRepository.save(produs11);

			Product produs12=new Product();
			produs12.setNameProduct("Bluza Molton Kids");
			produs12.setQuantity(20);
			produs12.setPretProdus(100);
			produs12.setBrand("Jordan");
			produs12.setImages("assets/images/bluza molton copi.jpg");
			//produs11.setUser(user1);
			produs12.setGender("kids");
			productRepository.save(produs12);

			Product produs13=new Product();
			produs13.setNameProduct("Tricou Ionni");
			produs13.setQuantity(20);
			produs13.setPretProdus(50);
			produs13.setBrand("Jordan");
			produs13.setImages("assets/images/tricou lonni copi.jpg");
			//produs11.setUser(user1);
			produs13.setGender("kids");
			productRepository.save(produs13);
			//System.out.println(productServiceImplementation.findGenderKids("kids"));

//			System.out.println(productServiceImplementation.compareProductsDescendent());
		};
	}
}
