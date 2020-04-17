package com.springboot.test.springbootweb.controller;

import com.springboot.test.springbootweb.common.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("**.html")
public class NewTestController {

    /**
     * 测试页面
     *
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/crawler", produces = "text/html;charset=utf-8")
    public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
        return "Crawler";
    }

    /**
     * 测试页面
     *
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/test")
    @ResponseBody
    public Response<String> test(HttpServletRequest request, HttpServletResponse response, Model model) {
        Response<String> result = new Response<String>();
        result.setData("success");
        result.setCode("0000");
        return result;
    }



}
