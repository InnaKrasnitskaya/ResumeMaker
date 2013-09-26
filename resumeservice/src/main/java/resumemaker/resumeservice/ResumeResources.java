package resumemaker.resumeservice;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import resumemaker.resumeservice.service.PersonService;

@Path("/resumeservice")
public class ResumeResources {
	
	@Inject
    PersonService personService;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
    public String getResume() {		
		if (personService != null)
			return personService.getList().get(0).getName();
		else
			return "Error"; 		
	}
	
}