/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.contactapp.controller;

import bd.ac.seu.contactapp.model.Contact;
import bd.ac.seu.contactapp.util.HibernateUtil;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import org.hibernate.Session;

/**
 *
 * @author kmhasan
 */
@ManagedBean
@ViewScoped
public class ContactController {

    private Contact contact;
    private String phoneNumber;
    
    public ContactController() {
        contact = new Contact();
    }
    
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void addContact(ActionEvent event) {
        System.out.println("Saving entry");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(contact);
        session.getTransaction().commit();
        session.close();
        contact = new Contact();
    }
    
    public void addPhone(ActionEvent event) {
        System.out.println("We're supposed to add " + phoneNumber);
        contact.getPhonesList().add(phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

/*
Hometasks: 
1. Add a authentication page. Use this api: http://my.seu.ac.bd/~kmhasan/__WebServices/usscse/user_auth_json.php
Use post method. Pass student id with "username" and password with "password" fields.
2. Add a growl to show inform the user that contact information has been saved
3. Add a browse option with proper features for browsing all the contacts.

*/
