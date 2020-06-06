package com.example.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Import(MyTestConfiguration.class)
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class LoadRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private LoadRepository loadRepository;

    @Test
    public void tetRepository(){

    }

}