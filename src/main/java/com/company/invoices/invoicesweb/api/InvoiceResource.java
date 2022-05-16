package com.company.invoices.invoicesweb.api;

import com.company.invoices.invoicesweb.entity.Invoice;
import com.company.invoices.invoicesweb.form.InvoiceForm;
import com.company.invoices.invoicesweb.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/invoice")
public class InvoiceResource {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
            return invoiceService;
        }


    public void setInvoiceService(InvoiceServiceInterface invoiceService) { this.invoiceService = invoiceService;
    }

    @PostMapping
    public Invoice create (@RequestBody Invoice invoice){
        return invoiceService.createInvoice(invoice);
    }


    @GetMapping
    public List<Invoice> list() {
        System.out.println("Methode Home invoquée");
        return invoiceService.getInvoiceList();
    }


   @GetMapping("/{id}")
    public Invoice get(@PathVariable("id") String number){
       System.out.println("Méthode display nvoice a été appelée");
       return invoiceService.getInvoiceByNumber(number);
    }

/*    @GetMapping("/create-form")
    public String displayInvoiceCreateForm(@ModelAttribute InvoiceForm invoice){
        return "invoice-create-form";
    }*/

}
