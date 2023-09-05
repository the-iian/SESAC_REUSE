package com.sesac.reuse.security;

import com.sesac.reuse.security.service.CustomMemberDetailsService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
public class CustomMemberDetailServiceTest {

    @Autowired
    private CustomMemberDetailsService memberDetailsService;

}
