package com.company.invoices.invoicesweb.repository.memory;

import com.company.invoices.invoicesweb.entity.Invoice;
import com.company.invoices.invoicesweb.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {
    private static List<Invoice> invoices = new ArrayList<>();

    public Invoice create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Facture créé  en mémoire pour le client " + invoice.getCustomerName() + " et la facture numéro " + invoice.getNumber());
        return invoice;
    }

    @Override
    public List<Invoice> list() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Invoice getById(String number) {
        throw new UnsupportedOperationException();
    }
}
