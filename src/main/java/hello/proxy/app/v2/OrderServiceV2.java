package hello.proxy.app.v2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderServiceV2 {

    private final OrderRepositoryV2 repository;

    public void orderItem(String itemId) {
        repository.save(itemId);
    }

}
