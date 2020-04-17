package com.jg.swaggerui;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Test Model", description = "A description of the model.")
public class TestModel {

    @ApiModelProperty(value = "Property Field description.")
    private final String property;

}
