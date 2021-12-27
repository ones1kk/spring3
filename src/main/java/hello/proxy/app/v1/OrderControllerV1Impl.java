package hello.proxy.app.v1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderControllerV1Impl implements OrderControllerV1 {

    private final OrderServiceV1 service;

    @Override
    public String request(String itemId) {
        service.orderItem(itemId);
        return "ok";
    }

    @Override
    public String noLog() {
        return "ok";
    }
}
