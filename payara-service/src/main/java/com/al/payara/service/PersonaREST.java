package com.al.payara.service;

import com.al.model.Persona;
import com.al.model.PersonaRepository;
import java.util.Collection;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("persona")
public class PersonaREST {
     @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        Collection<Persona> pers = PersonaRepository.findAll();
        return Response.ok(pers).build();
    }

    @POST
    public Response insert(@FormParam("nombre") String nombre, @FormParam("edad") int edad) {
        PersonaRepository.addPersona(nombre, edad);
        return Response.ok().build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") int id) {
        Persona persona = PersonaRepository.getById(id);
        return Response.ok(persona).build();
    }
}
