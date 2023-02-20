package br.com.sauderesidence.services.ws;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.sauderesidence.services.controllers.AgendaController;
import br.com.sauderesidence.services.controllers.PacienteController;
import br.com.sauderesidence.services.controllers.PrescricaoEnfermagemController;
import br.com.sauderesidence.services.controllers.PrescricaoMedicaController;
import br.com.sauderesidence.services.controllers.ProcedimentoEnfermagemController;
import br.com.sauderesidence.services.controllers.SolicitacaoPrescricaoEnfermagemController;
import br.com.sauderesidence.services.controllers.SolicitacaoPrescricaoMedicaController;
import br.com.sauderesidence.services.controllers.SolicitacaoProcedimentoEnfermagemController;
import br.com.sauderesidence.services.controllers.UsuarioController;
import br.com.sauderesidence.services.helpers.Criptografia;
import br.com.sauderesidence.services.models.AgendaModel;
import br.com.sauderesidence.services.models.PacienteModel;
import br.com.sauderesidence.services.models.PrescricaoEnfermagemModel;
import br.com.sauderesidence.services.models.PrescricaoMedicaModel;
import br.com.sauderesidence.services.models.ProcedimentoEnfermagemModel;
import br.com.sauderesidence.services.models.SolicitacaoPrescricaoEnfermagemModel;
import br.com.sauderesidence.services.models.SolicitacaoPrescricaoMedicaModel;
import br.com.sauderesidence.services.models.SolicitacaoProcedimentoEnfermagemModel;
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
	
	@GET
	@Path("listarpacientesgeral")
	@Produces(MediaType.APPLICATION_JSON)
	public String listarPacientesGeral() {
		
		PacienteController ctr = new PacienteController();
		Gson gson = new Gson();
		try {
			List<PacienteModel> lista = ctr.listarPacientesGeral();
			return gson.toJson(lista);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return gson.toJson(e.getMessage());
		}
		
	}
	
	@GET
	@Path("listarprescricaomedica/{idadmission}")
	@Produces(MediaType.APPLICATION_JSON)
	public String ListarPrescricaoMedica(@PathParam("idadmission") int idadmission) {
		
		PrescricaoMedicaController ctr = new PrescricaoMedicaController();
		List<PrescricaoMedicaModel> lista = new ArrayList<>();
		Gson gson = new Gson();
		try {
			lista = ctr.listarPrescricaoPorAdmissao(idadmission);
			return gson.toJson(lista);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return gson.toJson(e.getMessage());
		}
		
	}
	
	@POST
	@Path("addprescricaomedica")
	@Produces(MediaType.APPLICATION_JSON)
	public String adicionarPrescricaoMedica(String content) {
	
		SolicitacaoPrescricaoMedicaController ctr = new SolicitacaoPrescricaoMedicaController();
		Gson gson = new Gson();
		try {
			SolicitacaoPrescricaoMedicaModel sol = (SolicitacaoPrescricaoMedicaModel)gson.fromJson(content, SolicitacaoPrescricaoMedicaModel.class);
			boolean resultado = ctr.inserirSolicitacao(sol);
			return gson.toJson(resultado);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return gson.toJson(false);
		}
		
	}
	
	@GET
	@Path("listarprescricaoenfermagem/{idadmission}")
	@Produces(MediaType.APPLICATION_JSON)
	public String ListarPrescricaoEnfermagem(@PathParam("idadmission") int idadmission) {
		
		PrescricaoEnfermagemController ctr = new PrescricaoEnfermagemController();
		List<PrescricaoEnfermagemModel> lista = new ArrayList<>();
		Gson gson = new Gson();
		try {
			lista = ctr.listarPrescricaoPorAdmissao(idadmission);
			return gson.toJson(lista);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return gson.toJson(e.getMessage());
		}
		
	}
	
	@POST
	@Path("addsolicitarmaterial")
	@Produces(MediaType.APPLICATION_JSON)
	public String adicionarPrescricaoEnfermagem(String content) {
	
		SolicitacaoPrescricaoEnfermagemController ctr = new SolicitacaoPrescricaoEnfermagemController();
		Gson gson = new Gson();
		try {
			SolicitacaoPrescricaoEnfermagemModel sol = (SolicitacaoPrescricaoEnfermagemModel)gson.fromJson(content, SolicitacaoPrescricaoEnfermagemModel.class);
			boolean resultado = ctr.inserirSolicitacao(sol);
			return gson.toJson(resultado);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return gson.toJson(false);
		}
		
	}
	
	@GET
	@Path("listarprocedimentoenfermagem/{idadmission}")
	@Produces(MediaType.APPLICATION_JSON)
	public String ListarProcedimentoEnfermagem(@PathParam("idadmission") int idadmission) {
		
		ProcedimentoEnfermagemController ctr = new ProcedimentoEnfermagemController();
		List<ProcedimentoEnfermagemModel> lista = new ArrayList<>();
		Gson gson = new Gson();
		try {
			lista = ctr.listarProcedimentoPorAdmissao(idadmission);
			return gson.toJson(lista);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return gson.toJson(e.getMessage());
		}
		
	}
	
	@POST
	@Path("addsolicitarprocedimento")
	@Produces(MediaType.APPLICATION_JSON)
	public String adicionarProcedimentoEnfermagem(String content) {
	
		SolicitacaoProcedimentoEnfermagemController ctr = new SolicitacaoProcedimentoEnfermagemController();
		Gson gson = new Gson();
		try {
			SolicitacaoProcedimentoEnfermagemModel sol = (SolicitacaoProcedimentoEnfermagemModel)gson.fromJson(content, SolicitacaoProcedimentoEnfermagemModel.class);
			boolean resultado = ctr.inserirSolicitacao(sol);
			return gson.toJson(resultado);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return gson.toJson(false);
		}
		
	}

}
