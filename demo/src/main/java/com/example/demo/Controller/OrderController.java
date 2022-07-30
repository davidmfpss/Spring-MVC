package com.example.demo.Controller;

import com.example.demo.Model.Meal;
import com.example.demo.Model.Order;
import com.example.demo.Service.OrderService;
import com.example.demo.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/order")
public class OrderController {
    @Autowired
    OrderService Orderservice;

    @GetMapping("/{seq}")
    public String gerUserById(@PathVariable int seq, Model model){
        Order order=this.Orderservice.getip(seq);
        model.addAttribute("order",order);
        return "123";
    }


}
