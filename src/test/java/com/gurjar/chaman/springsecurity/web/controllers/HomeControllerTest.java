package com.gurjar.chaman.springsecurity.web.controllers;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class HomeControllerTest extends BaseTest {


    /**
     *  @WithMockUser("anyUserMocking") - This will not check that this is a valid user or not
     *  this will inject the user in context and that will pass the test case
     * @throws Exception
     */
    @WithMockUser("anyUserMocking")
    @Test
    void ping() throws Exception {
        mockMvc.perform(get("/ping"))
                .andExpect(status().isOk());
    }

    @Test
    void pingWithSecurity() throws Exception {
        mockMvc.perform(get("/ping").with(httpBasic("chaman", "chaman123")))
                .andExpect(status().isOk());
    }

}
