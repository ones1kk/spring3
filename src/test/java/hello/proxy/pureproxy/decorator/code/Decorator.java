package hello.proxy.pureproxy.decorator.code;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Decorator implements Component{

    protected final Component component;
}
