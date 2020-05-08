package com.example.demo;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class FileControllerTest extends ControllerTestBase {
    @Test
    public void fileTest() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get("/getfile") // 测试的相对地址
                        .accept(MediaType.APPLICATION_JSON_UTF8) // accept response content type
                )
                .andExpect(status().isOk()) // 期待返回状态吗码200
                .andDo(MockMvcResultHandlers.print()); // 打印返回的 http response 信息
    }
}
