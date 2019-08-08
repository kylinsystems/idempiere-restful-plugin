/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Copyright (C) 2019 INGEINT <https://www.ingeint.com> and contributors (see README.md file).
 */

package com.ingeint.ws.controller;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/partner")
public class PartnerController {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		return "get";
	}
	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String put() {
		return "put";
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String post() {
		return "post";
	}
	
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String delete() {
		return "delete";
	}

}