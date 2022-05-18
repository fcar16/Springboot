package com.proyecto.proyectoWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Este archivo no tenéis que tocarlo. Para ejecutar el proyecto tenéis que poneros en la raíz del mismo y ejecutar ./mvnw spring-boot:run.
//No olvidéis manipular application.properties para poner la información de vuestra propia base de datos.
//Este proyecto está hecho para una versión de java que quizás no utilicéis. La versión de java está indicada en el pom.xml junto al resto de dependencias.
//Este proyecto no funcionará de manera independiente pues se eliminado el código para que lo desarrolléis vosotros en vuestro propio proyecto
//El proyecto ya definiré en una tarea qué requisitos debe tener pero como mínimo deberéis trabajar con una tabla en la base de datos, y por lo tanto como mínimo una clase en el modelo.
@SpringBootApplication
public class ProyectoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoWebApplication.class, args);
	}

}
