package br.com.sauderesidence.services.ws;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.sauderesidence.services.controllers.AgendaController;
import br.com.sauderesidence.services.controllers.UsuarioController;
import br.com.sauderesidence.services.helpers.Criptografia;
import br.com.sauderesidence.services.models.AgendaModel;
import br.com.sauderesidence.services.models.UsuarioModel;

@Path("/srhcws")
public class SaudeResidenceWs {
	
	@GET
	@Path("testewebservice")
	@Produces(MediaType.APPLICATION_JSON)
	public String testeWebService() {
		return "SEJA BEM-VINDO AO WEBSERVICE DA SAÚDE RESIDENCE.";
	}
	
	@GET
	@Path("validarloginsenha/{login}/{senha}")
	@Produces(MediaType.APPLICATION_JSON)
	public String validaLoginSenha(@PathParam("login")String login, @PathParam("senha")String senha) {
		
		UsuarioController ctr = new UsuarioController();
		Gson gson = new Gson();
		try {
			List<UsuarioModel> usuarios = ctr.validarLoginSenha(login, Criptografia.criptografar(senha));
			return gson.toJson(usuarios);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return gson.toJson(e.getMessage());
		}
		
	}
	
	@GET
	@Path("listaragendaporprofissional/{idperson}")
	@Produces(MediaType.APPLICATION_JSON)
	public String listarAgendaPorProfissional(@PathParam("idperson") int idperson) {
		
		AgendaController ctr = new AgendaController();
		Gson gson = new Gson();
		try {
			List<AgendaModel> lista = ctr.listarAgendaPorProfissional(idperson);
			return gson.toJson(lista);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return gson.toJson(e.getMessage());
		}
		
	}

}
