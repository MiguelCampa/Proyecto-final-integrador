/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.kaiba.entities;

import com.google.gson.Gson;
import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author MASTER1
 */
public class Transaction {

    /**
     * @return the transactions
     */
    public List<UsserData> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<UsserData> transactions) {
        this.transactions = transactions;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the accountHolder
     */
    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    /**
     * @param accountHolder the accountHolder to set
     */
    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }


    
    private String product;
    @SerializedName ("account-number")
    private String accountNumber;
    private String currency;
    @SerializedName ("account-holder")
    private AccountHolder accountHolder;
    private List<UsserData> transactions;
    

    public static Transaction deserialize(String json){
    Transaction a = new Transaction();
    try{
        Gson gson = new Gson();
        a = gson.fromJson(json, Transaction.class);
    } catch (Exception ex){
        System.err.println("Error: " + ex.getMessage());
    } return a;  
    }
    public static Transaction interes(double porcentaje){

        return null;
    
}
}