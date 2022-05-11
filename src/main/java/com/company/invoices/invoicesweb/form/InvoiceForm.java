package com.company.invoices.invoicesweb.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class InvoiceForm {

    private String number;
    @NotBlank(message="Le nom du client est obligatoire")
    private String customerName;
    @Size(min=5,max=13, message="Le numéro de commande n'a pas la bonne longueur")
    private String orderNumber;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
