package resumemaker.resumeservice;

import javax.ws.rs.GET;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.Path;
import javax.ws.rs.ProduceMime;
import javax.ws.rs.core.MediaType;

import resumemaker.resumeservice.service.PersonService;

@Path("/resumeservice")
public class ResumeResources {
	
	@Autowired
	PersonService person;
	
	@GET
	@ProduceMime(MediaType.TEXT_PLAIN)
    public String getResume() {		
		if (person != null)
			return person.getList().get(0).getName();
		else
			return "Error"; 
	}
	
}