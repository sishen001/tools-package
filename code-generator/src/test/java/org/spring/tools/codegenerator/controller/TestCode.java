package org.spring.tools.codegenerator.controller;

import org.junit.Test;
import org.spring.tools.codegenerator.CodeGeneratorApplicationTests;
import org.spring.tools.codegenerator.service.impl.ControllerGenerator;
import org.spring.tools.codegenerator.service.impl.ModelAndMapperGenerator;
import org.springframework.beans.factory.annotation.Autowired;

public class TestCode extends CodeGeneratorApplicationTests {

    @Autowired
    private ControllerGenerator controllerGenerator;

    @Autowired
    private ModelAndMapperGenerator modelAndMapperGenerator;

    @Test
    public void testController(){
        controllerGenerator.genCode("keke_role");
    }

    @Test
    public void testModelAndMapper(){
        modelAndMapperGenerator.genCode("keke_role");
    }
}
