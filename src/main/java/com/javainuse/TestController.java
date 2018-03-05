package com.javainuse;



import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.jxls.template.SimpleExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;
import com.mypurecloud.sdk.v2.model.OrganizationProductEntityListing;

import net.minidev.json.JSONObject;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

@RestController
public class TestController {
	
	private static final String APPLICATION_JSON = "application/json";
	@Autowired	private PersonRepository pPersonRepository;

	@RequestMapping(
			value = "/iniciar", 
			method = RequestMethod.GET, 
			produces=APPLICATION_JSON)
	public IniciarResponse firstPage() {		
		IniciarResponse rta = new IniciarResponse();
		List<Person> listaDePersonas = pPersonRepository.findAll();
		rta.setId("00000_X");
		rta.setNombre("00000_Y");
		rta.setPersonas(listaDePersonas);		
		return rta;
	}
	
	@RequestMapping(
			value = "/crearPDF", 
			method = RequestMethod.POST, 
			consumes ="application/json")
	@CrossOrigin(origins = "*")
	public JSONObject crearPDF(@RequestBody(required = true) DtoEntrada dto,HttpServletResponse response) {
		JSONObject jsonResponse = new JSONObject();
		response.setContentType("application/pdf");
		//--
		try {
			ServletOutputStream servletOutputStream = response.getOutputStream();
	        servletOutputStream.flush();
	        //--
			Resource plantillaCompilada = new ClassPathResource("/reportes/jasper/reporte000001.jasper");
			//--
			Map<String, Object> parametrosZ = new HashMap<>();		
			parametrosZ.put("DEVELOPER", "Valor a remplazar en el PARAM: DEVELOPER");
			//--
			JasperRunManager.runReportToPdfStream(plantillaCompilada.getInputStream(), servletOutputStream, parametrosZ, new JREmptyDataSource());
			//--
	        servletOutputStream.flush();
	        servletOutputStream.close();			
		} catch (JRException | IOException e1) {
			
		} 
		return jsonResponse;
	}
	
	@RequestMapping(
			value = "/crearXLS", 
			method = RequestMethod.POST, 
			consumes ="application/json")
	@CrossOrigin(origins = "*")
	public JSONObject crearXLS(@RequestBody(required = true) DtoEntrada dto,HttpServletResponse response) {
		JSONObject jsonResponse = new JSONObject();
		List<Person> persons = pPersonRepository.findAll();
		List<String> headers = Arrays.asList("First Name", "Last Name");
		try {
			response.addHeader("Content-disposition", "attachment; filename=People.xls");
			response.setContentType("application/vnd.ms-excel");
			new SimpleExporter().gridExport(headers, persons, "firstName, lastName, ", response.getOutputStream());
			response.flushBuffer();
		} catch (IOException e) {

		}
		return jsonResponse;
	}
	
	@RequestMapping(value = "/export", method = RequestMethod.GET)
	public void export(HttpServletResponse response) {
		List<Person> persons = pPersonRepository.findAll();
		List<String> headers = Arrays.asList("First Name", "Last Name");
		try {
			response.addHeader("Content-disposition", "attachment; filename=People.xls");
			response.setContentType("application/vnd.ms-excel");
			new SimpleExporter().gridExport(headers, persons, "firstName, lastName, ", response.getOutputStream());
			response.flushBuffer();
		} catch (IOException e) {

		}
	}
	
	@RequestMapping(value = "/exportXLS", method = RequestMethod.GET)
	public void exportXLS(HttpServletResponse response) {
		List<Person> persons = pPersonRepository.findAll();
		List<String> headers = Arrays.asList("First Name", "Last Name");
		try {
			response.addHeader("Content-disposition", "attachment; filename=People.xls");
			response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
			new SimpleExporter().gridExport(headers, persons, "firstName, lastName, ", response.getOutputStream());
			response.flushBuffer();
		} catch (IOException e) {

		}
	}
	
	
	@RequestMapping(
			value = "/llamarPC", 
			method = RequestMethod.GET, 
			produces=APPLICATION_JSON)
	public IniciarResponse llamarPC() {		
		//--
		IniciarResponse rta = new IniciarResponse();
		List<Person> listaDePersonas = pPersonRepository.findAll();
		rta.setId("00000_X");
		rta.setNombre("00000_Y");
		rta.setPersonas(listaDePersonas);		
		//--
		AuthorizationApi apiInstance = new AuthorizationApi();
		try {
		    OrganizationProductEntityListing result = apiInstance.getAuthorizationProducts();
		    System.out.println(result);
		} catch (ApiException | IOException e) {
		    System.err.println("Exception when calling AuthorizationApi#getAuthorizationProducts");
		    e.printStackTrace();
		}
		//--		
		return rta;
	}
	
}
