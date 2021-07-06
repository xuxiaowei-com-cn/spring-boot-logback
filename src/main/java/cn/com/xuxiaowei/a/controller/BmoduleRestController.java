package cn.com.xuxiaowei.a.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * B 模块
 *
 * @author 徐晓伟
 */
@Slf4j
@RestController
public class BmoduleRestController {

    @RequestMapping("/b")
    public String b(HttpServletRequest request) {
        log.debug("B Module - " + MDC.get("serial"));
        log.info("B Module - " + MDC.get("serial"));
        log.error("B Module - " + MDC.get("serial"));
        return request.getSession().getId();
    }

}
