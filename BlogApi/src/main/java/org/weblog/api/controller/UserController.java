package org.weblog.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "user", description = "用户管理")
@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation("创建用户")
    @ApiResponses({
            @ApiResponse(code = 200, message = "操作成功")
    })
    public String test() {
        return "hello";
    }
}
