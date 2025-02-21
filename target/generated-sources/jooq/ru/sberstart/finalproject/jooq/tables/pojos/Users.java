/*
 * This file is generated by jOOQ.
 */
package ru.sberstart.finalproject.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String phoneNumber;
    private String passportNumber;
    private String status;

    public Users() {}

    public Users(Users value) {
        this.id = value.id;
        this.name = value.name;
        this.surname = value.surname;
        this.birthdate = value.birthdate;
        this.phoneNumber = value.phoneNumber;
        this.passportNumber = value.passportNumber;
        this.status = value.status;
    }

    public Users(
        UUID id,
        String name,
        String surname,
        LocalDate birthdate,
        String phoneNumber,
        String passportNumber,
        String status
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.passportNumber = passportNumber;
        this.status = status;
    }

    /**
     * Getter for <code>PUBLIC.USERS.ID</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>PUBLIC.USERS.ID</code>.
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for <code>PUBLIC.USERS.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>PUBLIC.USERS.NAME</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>PUBLIC.USERS.SURNAME</code>.
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * Setter for <code>PUBLIC.USERS.SURNAME</code>.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Getter for <code>PUBLIC.USERS.BIRTHDATE</code>.
     */
    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    /**
     * Setter for <code>PUBLIC.USERS.BIRTHDATE</code>.
     */
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Getter for <code>PUBLIC.USERS.PHONE_NUMBER</code>.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Setter for <code>PUBLIC.USERS.PHONE_NUMBER</code>.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for <code>PUBLIC.USERS.PASSPORT_NUMBER</code>.
     */
    public String getPassportNumber() {
        return this.passportNumber;
    }

    /**
     * Setter for <code>PUBLIC.USERS.PASSPORT_NUMBER</code>.
     */
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    /**
     * Getter for <code>PUBLIC.USERS.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>PUBLIC.USERS.STATUS</code>.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Users other = (Users) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.surname == null) {
            if (other.surname != null)
                return false;
        }
        else if (!this.surname.equals(other.surname))
            return false;
        if (this.birthdate == null) {
            if (other.birthdate != null)
                return false;
        }
        else if (!this.birthdate.equals(other.birthdate))
            return false;
        if (this.phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        }
        else if (!this.phoneNumber.equals(other.phoneNumber))
            return false;
        if (this.passportNumber == null) {
            if (other.passportNumber != null)
                return false;
        }
        else if (!this.passportNumber.equals(other.passportNumber))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.surname == null) ? 0 : this.surname.hashCode());
        result = prime * result + ((this.birthdate == null) ? 0 : this.birthdate.hashCode());
        result = prime * result + ((this.phoneNumber == null) ? 0 : this.phoneNumber.hashCode());
        result = prime * result + ((this.passportNumber == null) ? 0 : this.passportNumber.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Users (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(surname);
        sb.append(", ").append(birthdate);
        sb.append(", ").append(phoneNumber);
        sb.append(", ").append(passportNumber);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
