package com.mx.jpa.proc;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.mx.jpa.proc.entity.Person;
import com.mx.jpa.proc.repository.PersonRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	// Declarar el logger
    private static final Logger log = LoggerFactory.getLogger(Application.class);
	
    private final PersonRepository personRepository;

    // Constructor que inyecta el repositorio
    public Application(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
    	
    	List<Person> personList = this.personRepository.verPersonas();
    	log.info("Lista de personas: {}", personList);
    	
    	// Logging de nivel INFO
        log.info("Buscando persona con ID 1");

        Person person = this.personRepository.buscarPersona(2L);

        if (person != null) {
            log.info("Persona encontrada: " + person.toString());
        } else {
            log.warn("No se encontró ninguna persona con el ID 1");
        }
        
        //insertar
        //personRepository.insertarPersona("Gratsby", "daniel");
        
        //actualizar
        //personRepository.actualizarPersona(10L, "Luis", "Daniel Editada");
        
        //eliminar
        //personRepository.eliminarPersona(11L);
        
    }
}

