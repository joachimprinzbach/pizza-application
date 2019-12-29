package com.pizza.app.application;

import com.pizza.app.domain.PizzaInventoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PizzaInventoryRestController.class)
public class PizzaInventoryRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PizzaInventoryService pizzaInventoryService;

    @Test
    public void name() throws Exception {
        doReturn(new PizzaDto("Salami")).when(pizzaInventoryService).getAll();
        mockMvc.perform(get("/api/inventory"))
                .andExpect(status().isOk()).
                andExpect(content().json("{\"name\": \"Joe\", \"greeting\": \"Hej\"}"));
    }
}