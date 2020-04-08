package com.test.service;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.bean.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Nawed Alam 26/03/2020
 *
 */

@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "UserService")
public interface UserService {

	@POST
	@Path("/register")
	@ApiOperation(value = "userRegister")
	public Response userRegister(User user);

	@POST
	@Path("/verify")
	@ApiOperation(value = "userVerifications")
	public Response userVerifications(User user);

	@POST
	@Path("reset")
	@ApiOperation(value = "userReset")
	public Response userReset(User user);

	@POST
	@Path("deleteUser")
	@ApiOperation(value = "userDelete")
	public Response userDelete(User user);
	
	@GET
	@Path("/{id}")
	@ApiOperation(value = "findById")
	User findById(@PathParam("id") @NotNull Long id);
	
}
