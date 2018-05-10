package webservice;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("calculadora") public class CalculadoraRest {

	@GET
	@Path("/somarInt/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public Calculadora somarInt(@PathParam("a") int a, @PathParam("b") int b){
		Calculadora soma = new Calculadora(a, b, "+");
		return soma;
	}


	@GET
	@Path("/multiplicarInt/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public Calculadora multiplicarInt(@PathParam("a") int a, @PathParam("b") int b){
		Calculadora mult = new Calculadora(a, b, "*");
		return mult;
	}   

}
