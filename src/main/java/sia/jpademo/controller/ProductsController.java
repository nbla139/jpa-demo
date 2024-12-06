package sia.jpademo.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import sia.jpademo.model.ProductService;

@Controller
public class ProductsController {

    @GetMapping("/products")
    public String products() {
        return "products";
    }

}
