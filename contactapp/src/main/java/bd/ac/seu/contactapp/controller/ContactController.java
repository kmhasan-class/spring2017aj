/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.contactapp.controller;

import bd.ac.seu.contactapp.model.Contact;
import bd.ac.seu.contactapp.util.HibernateUtil;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import org.hibernate.Session;

/**
 *
 * @author kmhasan
 */
@ManagedBean
public class ContactController {

    private Contact contact;

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
    }

}
