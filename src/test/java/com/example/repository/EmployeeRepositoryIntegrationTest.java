package com.example.repository;


import com.example.controller.EmployeeRestController;
import com.example.service.EmployeeService;
import com.example.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class EmployeeRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    // write test cases here
}


@ExtendWith(SpringExtension.class)
class EmployeeServiceImplIntegrationTest {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {

        @Bean
        public EmployeeService employeeService() {
            return new EmployeeServiceImpl();
        }

    }

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    // write test cases here

}


@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeRestController.class)
class EmployeeRestControllerIntegrationTest2 {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private EmployeeService service;

// write test cases here

}

--------------------------------------------
        --------------------------------------------

        Inegration Test

        --------------------------------------------
        --------------------------------------------

@RunWith(SpringRunner.class)
@SpringBootTest(
          SpringBootTest.WebEnvironment.MOCK,
          classes = Application.class)
@AutoConfigureMockMvc
@TestPropertySource(
          locations = "classpath:application-integrationtest.properties")
public class EmployeeRestControllerIntegrationTest {

   
    @Autowired
   
    private MockMvc mvc;

   
    @Autowired
   
    private EmployeeRepository repository;

    // write test cases here

}



