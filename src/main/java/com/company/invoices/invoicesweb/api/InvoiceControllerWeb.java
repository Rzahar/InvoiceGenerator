package com.company.invoices.invoicesweb.api;

import com.company.invoices.invoicesweb.entity.Invoice;
import com.company.invoices.invoicesweb.form.InvoiceForm;
import com.company.invoices.invoicesweb.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
@RequestMapping("/invoice")
public class InvoiceControllerWeb {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
            return invoiceService;
        }


    public void setInvoiceService(InvoiceServiceInterface invoiceService) {

    }

   /* @PostMapping
    public String createInvoice(@Valid @ModelAttribute InvoiceForm invoiceForm, BindingResult result){
        if (result.hasErrors()){
            return "invoice-create-form";
        }
        Invoice invoice = new Invoice();
        invoice.setCustomerName(invoiceForm.getCustomerName());
        invoice.setOrderNumber(invoiceForm.getOrderNumber());
        invoiceService.createInvoice(invoice);
        System.out.println("Formulaire envoyé");
        return "invoice-created";
    }


    @GetMapping("/home")
    public ModelAndView displayHome() {
        System.out.println("Methode Home invoquée");
        ModelAndView mv = new ModelAndView("invoice-home");
        mv.addObject("invoices",invoiceService.getInvoiceList());
        return mv;
    }

    */
   @GetMapping("/{id}")
    public ModelAndView displayInvoice(@PathVariable("id") String number) {
        System.out.println("Methode displayInvoice invoquée");
        ModelAndView mv = new ModelAndView("invoice-details");
        mv.addObject("invoice",invoiceService.getInvoiceByNumber(number));
  //      List<Invoice> invoices = invoiceService.getInvoiceList();
        return mv;
    }

/*    @GetMapping("/create-form")
    public String displayInvoiceCreateForm(@ModelAttribute InvoiceForm invoice){
        return "invoice-create-form";
    }*/
}
