package com.example.BPBackend.repository;

import com.example.BPBackend.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Sander Beazar
 */
public interface ContactRepository extends JpaRepository<Contact,Integer>{
    
    
}
