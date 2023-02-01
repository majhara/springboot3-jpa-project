/*classe de configuração do profile teste*/

package com.personal.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.personal.course.entities.User;
import com.personal.course.repositories.UserRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	/*anotação @autowired associa uma instância 
	 * do UserRepository ao TestConfig
	*/

	@Autowired

	private UserRepository userRepository;
	
	/*método que executa quando a aplicação for iniciada */
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		/*método para salvar no banco de dados*/
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
}