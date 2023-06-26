package org.br.mineradora.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.br.mineradora.dto.CurrencyPriceDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@Path("/last")
@RegisterRestClient(configKey="extensions-api")
@ApplicationScoped
public interface CurrencyPriceClient {

    // vai conectar numa api externa e retornar um objeto do tipo CurrencyPriceDTO
    @GET
    @Path("/{pair}")
    CurrencyPriceDTO getPriceByPair(@PathParam("pair") String pair);
}
