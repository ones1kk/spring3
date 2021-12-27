package hello.proxy.app.v3;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController
public class OrderControllerV3 {

    private final OrderServiceV3 service;

    @GetMapping("/v3/request")
    public String request(String itemId) {
        service.orderItem(itemId);
        return "ok";
    }

    @RequestMapping("/v3/no-log")
    public String noLog() {
        return "ok";
    }

}
