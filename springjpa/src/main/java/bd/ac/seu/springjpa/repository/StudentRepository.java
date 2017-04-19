/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.springjpa.repository;

import bd.ac.seu.springjpa.model.Student;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author kmhasan
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
    
}
