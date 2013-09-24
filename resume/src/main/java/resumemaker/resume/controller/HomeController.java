package resumemaker.resume.controller;

import java.io.IOException;
import java.net.URI;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		Client client = Client.create();
		WebResource service = client.resource(getBaseURI("http://localhost:8080/resumeservice/resumeservice"));
		ClientResponse clientResponse = service.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class);
		if (clientResponse.getStatus() != 200)
			System.out.println(clientResponse.getEntity(String.class));
		else
			System.out.println("Error");
		
		return new ModelAndView("home");
	}
	
	private static URI getBaseURI(String uri) {
		return UriBuilder.fromUri(uri).build();
	}
}
