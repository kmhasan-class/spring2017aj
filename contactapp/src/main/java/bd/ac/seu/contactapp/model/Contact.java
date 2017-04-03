/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.contactapp.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author kmhasan
 */
@Entity
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailAddress;
    @Embedded
    private Name name;
    private Date dob;
    @Embedded
    @AttributeOverrides(
            {
                @AttributeOverride(
                        name = "streetAddress",
                        column = @Column(name = "presentStreetAddress")
                ),
                @AttributeOverride(
                        name = "city",
                        column = @Column(name = "presentCity")
                ),
                @AttributeOverride(
                        name = "country",
                        column = @Column(name = "presentCountry")
                )
            }
    )
    private Address presentAddress;
    @Embedded
    @AttributeOverrides(
            {
                @AttributeOverride(
                        name = "streetAddress",
                        column = @Column(name = "permanentStreetAddress")
                ),
                @AttributeOverride(
                        name = "city",
                        column = @Column(name = "permanentCity")
                ),
                @AttributeOverride(
                        name = "country",
                        column = @Column(name = "permanentCountry")
                )
            }
    )    
    private Address permanentAddress;

    public Contact() {
        emailAddress = "somebody@somewhere.com";
        name = new Name();
        dob = new Date();
        presentAddress = new Address();
        permanentAddress = new Address();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bd.ac.seu.contactapp.model.Contact[ id=" + id + " ]";
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Address getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(Address presentAddress) {
        this.presentAddress = presentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

}
