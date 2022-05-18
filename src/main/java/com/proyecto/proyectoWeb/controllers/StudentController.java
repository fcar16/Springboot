package com.proyecto.proyectoWeb.controllers;

import com.proyecto.proyectoWeb.models.Student;
import com.proyecto.proyectoWeb.repository.RepositoryStudent;
import com.proyecto.proyectoWeb.services.ServicesStudent;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    //Se inicializa el servicio.
    ServicesStudent c;

    //Variables utilizadas si las hay

    public StudentController(ServicesStudent c){
    	c=new ServicesStudent();

        //Constructor de la clase donde inicializamos el servicio y las variables.

    }

    //A continuación todos los GetMapping y PostMapping de tu proyecto. Dejo aquí dos Holas mundos de ejemplo.

    @GetMapping("/hola")
    public ResponseEntity<List<Student>> getAllClient() {
        List<Student> list = c.getall();
        return new ResponseEntity<List<Student>>(list, new HttpHeaders(), HttpStatus.OK);
    }
    
    @GetMapping("/welcome/{nombre}")
    public String welcome(Model model, @PathVariable String nombre){
        model.addAttribute("persona", nombre); 
        return "welcome";
    }

    @GetMapping("/welcome")
    public String welcomeDefault(Model model){
        model.addAttribute("persona", "desconocido");
        return "welcome";
    }
}
