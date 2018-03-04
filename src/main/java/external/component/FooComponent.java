package external.component;

import org.springframework.stereotype.Component;

/**
 * @author Carl Lu
 */
@Component
public class FooComponent {

    public String greetingFoo() {
        return "foo";
    }

}
