package byngs.k.oauth2.sample;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(OAuth2AuthenticationToken authentication) throws Exception {
        return "Hello, " + new ObjectMapper().writeValueAsString(authentication);
    }
}
