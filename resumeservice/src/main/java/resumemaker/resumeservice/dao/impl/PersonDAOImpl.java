package resumemaker.resumeservice.dao.impl;

import org.springframework.stereotype.Repository;
import resumemaker.resumeservice.dao.PersonDAO;
import resumemaker.resumeservice.entity.Person;

@Repository("personDAO")
public class PersonDAOImpl extends CommonDAOImpl<Person> implements PersonDAO {

}
