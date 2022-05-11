package com.company.invoices.invoicesweb.controller.web;

import com.company.invoices.invoicesweb.controller.InvoiceControllerInterface;
import com.company.invoices.invoicesweb.entity.Invoice;
import com.company.invoices.invoicesweb.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/invoice")
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
            return invoiceService;
        }

    @Override
    public void setInvoiceService(InvoiceServiceInterface invoiceService) {

    }

    @Override
    public String createInvoice(org.example.core.entity.Invoice invoice) {
        return null;
    }

    @PostMapping("")
    public String createInvoice(@ModelAttribute Invoice invoice){

        invoiceService.createInvoice(invoice);
        return "invoice-created";
    }


    @GetMapping("/home")
    public ModelAndView displayHome() {
        System.out.println("Methode Home invoquée");
        ModelAndView mv = new ModelAndView("invoice-home");
        mv.addObject("invoices",invoiceService.getInvoiceList());
        return mv;
    }

    @GetMapping("/{id}")
    public ModelAndView displayInvoice(@PathVariable("id") String number) {
        System.out.println("Methode displayInvoice invoquée");
        ModelAndView mv = new ModelAndView("invoice-details");
        mv.addObject("invoice",invoiceService.getInvoiceByNumber(number));
  //      List<Invoice> invoices = invoiceService.getInvoiceList();
        return mv;
    }

    @GetMapping("/create-form")
    public String displayInvoiceCreateForm(@ModelAttribute Invoice invoice){
        return "invoice-create-form";
    }
}
