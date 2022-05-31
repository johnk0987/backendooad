/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project.controller;

import final_project.model.Payment;
import final_project.service.PaymentServiceImplement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PhucNguyen
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentServiceImplement paymentServiceImplement;

    @CrossOrigin
    @GetMapping("/getAll")
    public List<Payment> getAll() {
        return paymentServiceImplement.getAll();
    }

    @CrossOrigin
    @GetMapping("/getPaymentById/{id}")
    public Payment getPaymentById(@PathVariable int id) {
        return paymentServiceImplement.getPaymentById(id);
    }

    @CrossOrigin
    @PostMapping("/addPayment")
    public Payment addPayment(@RequestBody Payment payment) {
        return paymentServiceImplement.savePayment(payment);
    }

    @CrossOrigin
    @PostMapping("/addListPayment")
    public List<Payment> addListPayment(@RequestBody List<Payment> listPayment) {
        return paymentServiceImplement.saveListPayment(listPayment);
    }

    @CrossOrigin
    @DeleteMapping("/deletePayment/{id}")
    public String deletePayment(@PathVariable int id) {
        return paymentServiceImplement.deletePayment(id);
    }

    @CrossOrigin
    @PutMapping("/updatePayment")
    public Payment updatePayment(@RequestBody Payment payment) {
        return paymentServiceImplement.savePayment(payment);
    }
    
    @CrossOrigin
    @PutMapping("/updateListPayment")
    public List<Payment> updateListPayment(@RequestBody List<Payment> listPayment){
        return paymentServiceImplement.saveListPayment(listPayment);
    }
}
