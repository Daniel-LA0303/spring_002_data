package com.mx.jpa.proc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mx.jpa.proc.entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    /* SIN PARAMETROS */

    // Forma #1
    @Procedure(procedureName = "Person.verPersonas")
    List<Person> verPersonas();
    

    // Forma #2
    //@Query(value = "CALL verPersonas()", nativeQuery = true)
    //List<Person> verPersonas();
     

    // Forma #3
    //@Procedure(procedureName = "verPersonas")
    //List<Person> verPersonas();
     

    // Forma #4
    //@Procedure
    //List<Person> verPersonas();


    /* CON PARAMETROS */

    // Forma #1
    //@Procedure(procedureName = "Person.buscarPersona")
    //Person buscarPersona(@Param("person_id") Long personId);


    // Forma #2
    /* @Procedure(name = "Customer.buscarPersona")
    Person buscarPersona(@Param("person_id") Long personId);
     */

    // Forma #3
    @Query(value = "CALL buscarPersona(:person_id)", nativeQuery = true)
    Person buscarPersona(@Param("person_id") Long personId);
    

    // Forma #4
    /* @Procedure
    Person buscarPersona(Long personId);
     */
    
    /* crear */
    //forma 1
    //@Procedure(procedureName = "insertarPersona")
    //void insertarPersona(@Param("p_name") String name, @Param("p_last_name") String lastName);
    
    //forma 2
    @Modifying
    @Query(value = "CALL insertarPersona(:p_name, :p_last_name)", nativeQuery = true)
    void insertarPersona(@Param("p_name") String name, @Param("p_last_name") String lastName);
   
    /* modificar*/
    //forma 1
    //@Procedure(procedureName = "actualizarPersona")
    //void actualizarPersona(@Param("p_id") Long id, @Param("p_name") String name, @Param("p_last_name") String lastName);
   
    //forma 2
    @Modifying
    @Query(value = "CALL actualizarPersona(:p_id, :p_name, :p_last_name)", nativeQuery = true)
    void actualizarPersona(@Param("p_id") Long id, @Param("p_name") String name, @Param("p_last_name") String lastName);
    
    /* Eliminar */
    //forma 1
    //@Procedure(procedureName = "eliminarPersona")
    //void eliminarPersona(@Param("person_id") Long id);
    
    @Modifying
    @Query(value = "CALL eliminarPersona(:person_id)", nativeQuery = true)
    void eliminarPersona(@Param("person_id") Long id);
}
