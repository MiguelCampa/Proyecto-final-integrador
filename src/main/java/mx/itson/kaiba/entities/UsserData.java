/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.kaiba.entities;

import java.util.Date;
import mx.itson.kaiba.enums.TransactionVariant;

/**
 *
 * @author MASTER1
 */
public class UsserData {

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the type
     */
    public TransactionVariant getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TransactionVariant type) {
        this.type = type;
    }
    
   private Date date;
   private String description;
   private String reference;
   private float amount;
   private TransactionVariant type;

    
}
