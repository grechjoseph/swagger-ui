package com.jg.swaggerui;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Controller description.")
public class TestController {

    @ApiOperation(value = "Brief description of the operation")
    @GetMapping
    public TestModel getTestModel(@RequestBody final TestModel testModel) {
        return testModel;
    }
}
