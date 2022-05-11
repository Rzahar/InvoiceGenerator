package com.company.invoices.invoicesweb.controller;

import com.company.invoices.invoicesweb.entity.Invoice;
import com.company.invoices.invoicesweb.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {

    String createInvoice(Invoice invoice);

    void setInvoiceService(InvoiceServiceInterface invoiceService);

    String createInvoice(org.example.core.entity.Invoice invoice);
}
