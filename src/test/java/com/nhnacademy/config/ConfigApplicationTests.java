package com.nhnacademy.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(
        classes = ConfigApplication.class
)
@AutoConfigureMockMvc
class ConfigApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ConfigApplication configApplication;

    @Test
    void contextLoads() {
        assertThat(configApplication).isNotNull();
    }

    @Test
    void healthEndpointUp() throws Exception {
        mockMvc.perform(get("/actuator/health"))
                .andExpect(status().isOk());
    }
}
