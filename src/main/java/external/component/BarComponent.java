package external.component;

import org.springframework.stereotype.Component;

/**
 * @author Carl Lu
 */
@Component
public class BarComponent {

    public String greetingBar() {
        return "bar";
    }

}
