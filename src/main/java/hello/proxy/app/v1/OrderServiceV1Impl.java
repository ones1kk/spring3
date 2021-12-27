package hello.proxy.app.v1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderServiceV1Impl implements OrderServiceV1 {

    private final OrderRepositoryV1 repository;

    @Override
    public void orderItem(String itemId) {
        repository.save(itemId);
    }
}
