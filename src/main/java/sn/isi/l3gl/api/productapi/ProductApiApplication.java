package sn.isi.l3gl.api.productapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// ✅ Bon import pour @EntityScan
import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "sn.isi.l3gl.api.productapi",
    "sn.isi.l3gl.core.productcore"
})
@EntityScan(basePackages = {
    "sn.isi.l3gl.core.productcore.entity"
})
@EnableJpaRepositories(basePackages = {
    "sn.isi.l3gl.core.productcore.repository"
})
public class ProductApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApiApplication.class, args);
    }
}