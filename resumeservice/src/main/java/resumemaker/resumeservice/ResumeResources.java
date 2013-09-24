package resumemaker.resumeservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.ProduceMime;
import javax.ws.rs.core.MediaType;

@Path("/resumeservice")
public class ResumeResources {
	
	@GET
	@ProduceMime(MediaType.TEXT_PLAIN)
    public String getResume() {
		return "Resume Maker";
	}
}