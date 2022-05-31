/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project.controller;

import final_project.model.Orders;
import final_project.service.OrderServiceImplement;
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
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderServiceImplement orderServiceImplement;

    @CrossOrigin
    @GetMapping("/getAll")
    public List<Orders> getAll() {
        return orderServiceImplement.getAll();
    }

    @CrossOrigin
    @GetMapping("/getOrderById/{id}")
    public Orders getOrderById(@PathVariable int id) {
        return orderServiceImplement.getOrdersById(id);
    }

    @CrossOrigin
    @PostMapping("/addOrder")
    public Orders addOrder(@RequestBody Orders order) {
        return orderServiceImplement.saveOrders(order);
    }

    @CrossOrigin
    @PostMapping("/addListOrder")
    public List<Orders> addListOrder(@RequestBody List<Orders> listOrder) {
        return orderServiceImplement.saveListOrders(listOrder);
    }

    @CrossOrigin
    @DeleteMapping("/deleteOrder/{id}")
    public String deleteOrder(@PathVariable int id) {
        return orderServiceImplement.deleteOrders(id);
    }

    @CrossOrigin
    @PutMapping("/updateOrder")
    public Orders updateOrder(@RequestBody Orders order) {
        return orderServiceImplement.saveOrders(order);
    }
}
