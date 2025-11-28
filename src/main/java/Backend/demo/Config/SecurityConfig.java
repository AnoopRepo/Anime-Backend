package Backend.demo.Config;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> ff70a699b3f2b62dd736b67afd0a384027bea02a
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
<<<<<<< HEAD
=======
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
>>>>>>> ff70a699b3f2b62dd736b67afd0a384027bea02a

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
<<<<<<< HEAD
        http
                .csrf(csrf -> csrf.disable())
                .cors(cors -> {})
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()
=======

        http
                .csrf(csrf -> csrf.disable())   // modern syntax
                .cors(cors -> {})               // enable CORS
                .authorizeHttpRequests(auth ->  // new syntax (no warning)
                        auth.anyRequest().permitAll()
>>>>>>> ff70a699b3f2b62dd736b67afd0a384027bea02a
                );

        return http.build();
    }
<<<<<<< HEAD
=======

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(List.of("http://localhost:5173"));
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
        config.setAllowedHeaders(List.of("*"));
        config.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }
>>>>>>> ff70a699b3f2b62dd736b67afd0a384027bea02a
}
