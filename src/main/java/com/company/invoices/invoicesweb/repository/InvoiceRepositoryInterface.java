package com.company.invoices.invoicesweb.repository;

import com.company.invoices.invoicesweb.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    Invoice create(Invoice invoice);
    List<Invoice>list();

    Invoice getById(String number);
}
