package br.com.sauderesidence.services.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/srhcws")
public class SaudeResidenceWs {
	
	@GET
	@Path("testewebservice")
	@Produces(MediaType.APPLICATION_JSON)
	public String testeWebService() {
		return "SEJA BEM-VINDO AO WEBSERVICE DA SAÚDE RESIDENCE.";
	}

}
