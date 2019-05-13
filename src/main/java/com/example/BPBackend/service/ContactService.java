/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BPBackend.service;

import com.example.BPBackend.Contact;
import com.example.BPBackend.repository.ContactRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sander Beazar
 */
@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;
    
    public Optional<Contact> findContactById(int id){
        return contactRepository.findById(id);
    }
    
    public List<Contact> findAll(){
        return contactRepository.findAll();
    }
    
    public void deleteById(int id){
        contactRepository.deleteById(id);
    }
    
    public Contact save(Contact contact){
        return contactRepository.save(contact);
    }
    
}
