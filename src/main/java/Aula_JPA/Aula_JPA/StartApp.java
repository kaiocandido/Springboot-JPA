package Aula_JPA.Aula_JPA;

import Aula_JPA.Aula_JPA.model.User;
import Aula_JPA.Aula_JPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Kaio");
        user.setUserName("Kaiozackk");
        user.setPassword("232131231");

        repository.save(user);

        for (User u : repository.findAll()){
            System.out.println(u);
        }
    }
}
