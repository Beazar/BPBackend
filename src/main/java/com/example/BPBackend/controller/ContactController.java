/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BPBackend.controller;

import com.example.BPBackend.Contact;
import com.example.BPBackend.service.ContactService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sander Beazar
 */
@RestController
@CrossOrigin
public class ContactController {
    
    private final ContactService contactService;
    
    ContactController(ContactService contactService){
        this.contactService = contactService;
    }
    
    @GetMapping("/contacts")
    List<Contact> findAll(){
        return contactService.findAll();
    }
    
    @PostMapping("/contacts")
    Contact newContact(@RequestBody Contact contact){
        return contactService.save(contact);
    }
    
    @GetMapping("/contacts/{id}")
    Optional<Contact> findVehicleById(@PathVariable int id){
        return contactService.findContactById(id);
                
    }
    
}
