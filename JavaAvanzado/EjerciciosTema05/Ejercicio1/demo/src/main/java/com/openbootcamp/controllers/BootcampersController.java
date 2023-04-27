package com.openbootcamp.controllers;

import com.openbootcamp.models.Bootcamper;
import com.openbootcamp.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private final BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Jose", "Alamar", "Java", "22584612P"));
        this.bootcamperService.add(new Bootcamper("Victor", "Roman", "Python", "45692314M"));
        this.bootcamperService.add(new Bootcamper("Jorge", "Garrido", "PHP", "12345678P"));
        this.bootcamperService.add(new Bootcamper("Victor", "Cuenca", "JavaScript", "12345598M"));
        this.bootcamperService.add(new Bootcamper("Jaume", "Ferrandis", "C++", "32345678N"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos() {
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre) {
        return bootcamperService.get(nombre);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);
        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())
                ).build();
    }

    @DELETE
    @Path("/bootcampers/{dni}")
    @Produces("application/json")
    public Response borrarBootcamper(@PathParam("dni") String dni) {
        Bootcamper bootcamperEliminado = bootcamperService.delete(dni);
        if (bootcamperEliminado != null) {
            return Response.ok(bootcamperEliminado).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    @Path("/bootcampers/{dni}")
    @Produces("application/json")
    @Consumes("application/json")
    public Response actualizarBootcamper(@PathParam("dni") String dni, Bootcamper bootcamper){
        Bootcamper bootcamperActualizado = bootcamperService.update(dni, bootcamper);
        if (bootcamperActualizado != null) {
            return Response.ok(bootcamperActualizado).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }



}
