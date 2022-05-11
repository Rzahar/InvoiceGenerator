package com.company.invoices.invoicesweb.repository.database;

import com.company.invoices.invoicesweb.entity.Invoice;
import com.company.invoices.invoicesweb.repository.InvoiceRepositoryInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    public void create(Invoice invoice){
        /*[…]
        PreparedStatement pstmt=connexion.prepareStatement("INSERT INTO FACTURE (NUMBER,CUSTOMERNAME) VALUES (?,?)");
                […]
        pstmt.executeUpdate();*/
        System.out.println("Database: Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        Invoice invoice1= new Invoice();
        invoice1.setCustomerName("Toto");
        invoice1.setNumber("NUM_1");
        Invoice invoice2= new Invoice();
        invoice2.setCustomerName("Tata");
        invoice2.setNumber("NUM_2");
        return List.of(invoice1, invoice2);
    }

    @Override
    public Invoice getById(String number) {
        Invoice invoice1= new Invoice();
        invoice1.setCustomerName("Test du Get By Id");
        invoice1.setNumber(number);
        invoice1.setOrderNumber("Commande numéro AH_" + number);
        return invoice1;
    }
}
