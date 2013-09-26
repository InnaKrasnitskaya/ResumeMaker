package resumemaker.resumeservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import resumemaker.resumeservice.dao.PersonDAO;
import resumemaker.resumeservice.entity.Person;
import resumemaker.resumeservice.service.PersonService;

import javax.inject.Inject;

@Service
public class PersonServiceImpl implements PersonService {

	@Inject
	private PersonDAO personDAO;
	
	public List<Person> getList() {
		return personDAO.getList();
	}
}
