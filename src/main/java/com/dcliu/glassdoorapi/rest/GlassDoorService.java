package com.dcliu.glassdoorapi.rest;

import java.util.concurrent.Future;

import javax.ws.rs.core.Response;

public interface GlassDoorService {

    Future<Response> getCompaniesInfo(String query);

}
