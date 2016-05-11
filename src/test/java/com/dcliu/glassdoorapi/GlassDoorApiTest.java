package com.dcliu.glassdoorapi;

import static org.junit.Assert.assertNotNull;

import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dcliu.glassdoorapi.rest.GlassDoorServiceImp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GlassDoorApiTest {

    @Autowired
    private GlassDoorServiceImp gdserviceImp;

    @Test
    public void test() throws InterruptedException, ExecutionException {

        System.out.println("---------------");

        String responseString1 = gdserviceImp.getCompaniesInfo("Havas").get().readEntity(String.class);
        System.out.println(responseString1);

        assertNotNull(responseString1);

    }

}
