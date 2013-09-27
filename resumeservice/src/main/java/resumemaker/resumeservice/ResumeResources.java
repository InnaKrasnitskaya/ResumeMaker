package resumemaker.resumeservice;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import resumemaker.resumeservice.entity.Person;
import resumemaker.resumeservice.service.PersonService;

@Component
@Path("/resumeservice")
public class ResumeResources {
	
	@Inject
    PersonService personService;
	
//    @Inject
//    private SessionFactory sessionFactory;
    	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
    public String getResume() {			
		/*if (sessionFactory == null)
			return "Error sessionFactory";
		else
			return "OK sessionFactory";*/
		if (personService != null)
			return personService.getList().get(0).getName();
		else
			return "Error";	
	}
	
}