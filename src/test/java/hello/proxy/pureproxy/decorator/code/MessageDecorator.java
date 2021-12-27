package hello.proxy.pureproxy.decorator.code;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class MessageDecorator implements Component {

    private final Component component;

    @Override
    public String operation() {
        log.info("MessageDecorator 실행");

        String result = component.operation();
        String decoResult = "*********" + result + "*********";

        log.info("MessageDecorator 구미기 적용전 = {} , 적용 후 = {} ", result, decoResult);

        return decoResult;
    }
}
