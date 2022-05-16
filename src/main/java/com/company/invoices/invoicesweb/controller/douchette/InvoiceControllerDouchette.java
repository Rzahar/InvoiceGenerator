package com.company.invoices.invoicesweb.controller.douchette;

import com.company.invoices.invoicesweb.controller.InvoiceControllerInterface;
import org.example.core.entity.Invoice;
import org.example.core.service.InvoiceServiceInterface;


public class InvoiceControllerDouchette implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @Override
    public String createInvoice(com.company.invoices.invoicesweb.entity.Invoice invoice) {
        return null;
    }

    @Override
    public void setInvoiceService(com.company.invoices.invoicesweb.service.InvoiceServiceInterface invoiceService) {

    }


}
