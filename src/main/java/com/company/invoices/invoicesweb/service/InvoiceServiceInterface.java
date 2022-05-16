package com.company.invoices.invoicesweb.service;

import com.company.invoices.invoicesweb.entity.Invoice;
import com.company.invoices.invoicesweb.repository.InvoiceRepositoryInterface;

import java.util.List;

public interface InvoiceServiceInterface {
    Invoice createInvoice(Invoice invoice);
    List<Invoice> getInvoiceList();
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
    Invoice getInvoiceByNumber(String number);
}
