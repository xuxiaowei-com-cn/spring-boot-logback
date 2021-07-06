package cn.com.xuxiaowei.a.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * A 模块
 *
 * @author 徐晓伟
 */
@Slf4j
@RestController
public class AmoduleRestController {

    @RequestMapping("/a")
    public String a(HttpServletRequest request) {
        log.debug("A Module - " + MDC.get("serial"));
        log.info("A Module - " + MDC.get("serial"));
        log.error("A Module - " + MDC.get("serial"));
        return request.getSession().getId();
    }

}
