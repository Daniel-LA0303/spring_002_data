package com.la.springboot.webapp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.la.springboot.webapp.dto.PersonDto;
import com.la.springboot.webapp.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

	@Query("select p from com.la.springboot.webapp.entities.Person p where p.id in :ids")
	public List<Person> getPersonsByIds(List<Long> ids);

	@Query("select p.name, length(p.name) from com.la.springboot.webapp.entities.Person p where length(p.name) = (select min(length(p2.name)) from com.la.springboot.webapp.entities.Person p2)")
	public List<Object[]> getShorterName();

	@Query("select p from com.la.springboot.webapp.entities.Person p where p.id = (select max(p2.id) from com.la.springboot.webapp.entities.Person p2)")
	public Optional<Person> getLastRegistration();

	@Query("select min(p.id), max(p.id), sum(p.id), avg(length(p.name)), count(p.id) from com.la.springboot.webapp.entities.Person p")
	public Object getResumeAggregationFunction();

	@Query("select min(length(p.name)) from com.la.springboot.webapp.entities.Person p")
	public Integer getMinLengthName();

	@Query("select max(length(p.name)) from com.la.springboot.webapp.entities.Person p")
	public Integer getMaxLengthName();

	@Query("select p.name, length(p.name) from com.la.springboot.webapp.entities.Person p")
	public List<Object[]> getPersonNameLength();

	@Query("select count(p) from com.la.springboot.webapp.entities.Person p")
	public Long getTotalPerson();

	@Query("select min(p.id) from com.la.springboot.webapp.entities.Person p")
	public Long getMinId();

	@Query("select max(p.id) from com.la.springboot.webapp.entities.Person p")
	public Long getMaxId();

	List<Person> findAllByOrderByNameAscLastnameDesc();

	@Query("select p from com.la.springboot.webapp.entities.Person p order by p.name, p.lastname desc")
	public List<Person> getAllOrdered();

	List<Person> findByIdBetweenOrderByNameAsc(Long id1, Long id2);

	List<Person> findByNameBetweenOrderByNameDescLastnameDesc(String name1, String name2);

	@Query("select p from com.la.springboot.webapp.entities.Person p where p.id between ?1 and ?2 order by p.name desc")
	public List<Person> findAllBetweenId(Long id1, Long id2);

	@Query("select p from com.la.springboot.webapp.entities.Person p where p.name between ?1 and ?2 order by p.name asc, p.lastname desc")
	public List<Person> findAllBetweenName(String c1, String c2);

	@Query("select p.id, upper(p.name), lower(p.lastname), upper(p.programmingLanguage) from com.la.springboot.webapp.entities.Person p")
	public List<Object[]> findAllPersonDataListCase();

	@Query("select upper(p.name || ' ' || p.lastname) from com.la.springboot.webapp.entities.Person p")
	public List<String> findAllFullNameConcatUpper();

	@Query("select lower(concat(p.name, ' ', p.lastname)) from com.la.springboot.webapp.entities.Person p")
	public List<String> findAllFullNameConcatLower();

	// @Query("select CONCAT(p.name, ' ', p.lastname) from Person p")
	@Query("select concat(p.name, ' ', p.lastname) from com.la.springboot.webapp.entities.Person p")
	public List<String> findAllFullNameConcat();

	@Query("select count(distinct(p.programmingLanguage)) from com.la.springboot.webapp.entities.Person p")
	public Long findAllProgrammingLanguageDistinctCount();

	@Query("select distinct(p.programmingLanguage) from com.la.springboot.webapp.entities.Person p")
	public List<String> findAllProgrammingLanguageDistinct();

	@Query("select p.name from com.la.springboot.webapp.entities.Person p")
	public List<String> findAllNames();

	@Query("select distinct(p.name) from com.la.springboot.webapp.entities.Person p")
	public List<String> findAllNamesDistinct();

	@Query("select new com.la.springboot.webapp.dto.PersonDto(p.name, p.lastname) from com.la.springboot.webapp.entities.Person p")
	public List<PersonDto> findAllPersonDto();

	@Query("select new com.la.springboot.webapp.entities.Person(p.name, p.lastname) from com.la.springboot.webapp.entities.Person p")
	public List<Person> findAllObjectPersonPersonalized();

	@Query("select p.name from com.la.springboot.webapp.entities.Person p where p.id=?1")
	public String getNameById(Long id);

	@Query("select p.id from com.la.springboot.webapp.entities.Person p where p.id=?1")
	public Long getIdById(Long id);

	@Query("select CONCAT(p.name, ' ', p.lastname) as fullname from com.la.springboot.webapp.entities.Person p where p.id=?1")
	public String getFullNameById(Long id);

	@Query("select p from com.la.springboot.webapp.entities.Person p where p.id=?1")
	public Optional<Person> findOne(Long id);

	@Query("select p from com.la.springboot.webapp.entities.Person p where p.name=?1")
	public Optional<Person> findOneName(String name);

	@Query("select p from com.la.springboot.webapp.entities.Person p where p.name like %?1%")
	public Optional<Person> findOneLikeName(String name);

	Optional<Person> findByNameContaining(String name);

	List<Person> findByProgrammingLanguage(String programmingLanguage);

	@Query("select p from com.la.springboot.webapp.entities.Person p where p.programmingLanguage=?1 and p.name=?2")
	public List<Person> buscarByProgrammingLanguage(String programmingLanguage, String name);

	List<Person> findByProgrammingLanguageAndName(String programmingLanguage, String name);

	@Query("select p, p.programmingLanguage from com.la.springboot.webapp.entities.Person p")
	public List<Object[]> findAllMixPerson();

	@Query("select p.id, p.name, p.lastname, p.programmingLanguage from com.la.springboot.webapp.entities.Person p")
	public List<Object[]> obtenerPersonDataList();

	@Query("select p.id, p.name, p.lastname, p.programmingLanguage from com.la.springboot.webapp.entities.Person p where p.id=?1")
	public Optional<Object> obtenerPersonDataById(Long id);

	@Query("select p.name, p.programmingLanguage from com.la.springboot.webapp.entities.Person p")
	public List<Object[]> obtenerPersonData();

	@Query("select p.name, p.programmingLanguage from com.la.springboot.webapp.entities.Person p where p.name=?1")
	public List<Object[]> obtenerPersonData(String name);

	@Query("select p.name, p.programmingLanguage from com.la.springboot.webapp.entities.Person p where p.programmingLanguage=?1 and p.name=?2")
	public List<Object[]> obtenerPersonData(String programmingLanguage, String name);

	@Query("select p.name, p.programmingLanguage from com.la.springboot.webapp.entities.Person p where p.programmingLanguage=?1")
	public List<Object[]> obtenerPersonDataByProgrammingLanguage(String programmingLanguage);

}
