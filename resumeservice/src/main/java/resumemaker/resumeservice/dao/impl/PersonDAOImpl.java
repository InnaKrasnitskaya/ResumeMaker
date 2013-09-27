package resumemaker.resumeservice.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import resumemaker.resumeservice.dao.PersonDAO;
import resumemaker.resumeservice.entity.Person;

@Repository("personDAO")
@Transactional
public class PersonDAOImpl extends CommonDAOImpl<Person> implements PersonDAO {
	
	public PersonDAOImpl() {
		super(Person.class);
	}
}
