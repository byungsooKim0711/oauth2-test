package byngs.k.oauth2.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

//    private ClientRegistration clientRegistration() {
//        return CommonOAuth2Provider.GITHUB
//                .getBuilder("github")
//                .clientId("${your-client-id}")
//                .clientSecret("${your-client-secret}")
//                .build();
//    }
//
//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository() {
//        ClientRegistration clientRegistration = clientRegistration();
//
//        return new InMemoryClientRegistrationRepository(clientRegistration);
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//        http.oauth2Login(c -> c.clientRegistrationRepository(clientRegistrationRepository()));
        http.oauth2Login();

        http.authorizeHttpRequests(r -> r.anyRequest().authenticated());

        return http.build();
    }
}
