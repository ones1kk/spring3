package hello.proxy.app.v2;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Slf4j
@RequestMapping
@ResponseBody
public class OrderControllerV2 {

    private final OrderServiceV2 service;

    @GetMapping("/v2/request")
    public String request(String itemId) {
        service.orderItem(itemId);
        return "ok";
    }

    @RequestMapping("/v2/no-log")
    public String noLog() {
        return "ok";
    }
}
