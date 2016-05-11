package com.dcliu.glassdoorapi.rest;

import java.util.concurrent.Future;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcliu.glassdoorapi.dto.ApiSettings;

@Service
public class GlassDoorServiceImp implements GlassDoorService {

    private final WebTarget target = ClientBuilder.newClient().target("http://api.glassdoor.com/api/api.htm");

    @Autowired
    private ApiSettings apiSettings;

    @Override
    public Future<Response> getCompaniesInfo(String query) {

        Future<Response> responseFuture = target.queryParam("v", "1").queryParam("format", "json")
                .queryParam("t.p", apiSettings.getPassword()).queryParam("t.k", apiSettings.getKey())
                .queryParam("userip", "0.0.0.0").queryParam("useragent", "Mozilla/5.0")
                .queryParam("action", "employers").queryParam("q", query).request().async().get();

        return responseFuture;
    }

}
