package com.proyecto.proyectoWeb.repository;

import com.proyecto.proyectoWeb.models.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


//Este es el repostorio de estudiantes donde hacemos las consultas a base de datos con @Query.
public interface RepositoryStudent extends JpaRepository<Student, Long> {

//Aquí deben ir todas las consultas con este aspecto
    //@Query(consulta en SQL)
    //void funcion(); o con parámetros, con el tipo de return que devuelva...etc.

}

