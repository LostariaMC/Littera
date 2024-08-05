package fr.lostaria.littera.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public void index(HttpServletResponse httpResponse) throws IOException {
        httpResponse.sendRedirect("/swagger-ui.html");
    }
}
