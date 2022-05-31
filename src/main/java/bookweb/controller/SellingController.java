/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookweb.controller;

import bookweb.model.Selling;
import bookweb.service.SellingServiceImplement;
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
@RequestMapping("/selling")
public class SellingController {

    @Autowired
    private SellingServiceImplement sellingServiceImplement;

    @CrossOrigin
    @GetMapping("/getAll")
    public List<Selling> getAll() {
        return sellingServiceImplement.getAll();
    }

    @CrossOrigin
    @GetMapping("/getSellingById/{id}")
    public Selling getSellingById(@PathVariable int id) {
        return sellingServiceImplement.getSellingById(id);
    }

    @CrossOrigin
    @PostMapping("/addSelling")
    public Selling addAccount(@RequestBody Selling selling) {
        return sellingServiceImplement.saveSelling(selling);
    }

    @CrossOrigin
    @PostMapping("/addListSelling")
    public List<Selling> addListSelling(@RequestBody List<Selling> listSelling) {
        return sellingServiceImplement.saveListSelling(listSelling);
    }

    @CrossOrigin
    @DeleteMapping("/deleteSelling/{id}")
    public String deleteSelling(@PathVariable int id) {
        sellingServiceImplement.deleteSelling(id);
        return "Đã xóa thành công !";
    }

    @CrossOrigin
    @PutMapping("/updateSelling")
    public Selling updateAccount(@RequestBody Selling selling) {
        return sellingServiceImplement.saveSelling(selling);
    }
}
