/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BPBackend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Contact {
        
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String image;
    private String phone;    

    public Contact(String firstName, String lastName, String image, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    
    
    
}
