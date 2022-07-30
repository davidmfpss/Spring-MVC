package com.example.demo.Controller;

import com.example.demo.Model.Order;
import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/order")
public class TotalController {
    @Autowired
    OrderService userService;

    @GetMapping("/gg")
    public String get(Model model){
        int total = this.userService.getTotal();
        model.addAttribute("total",total);
        List<Order> orderList = this.userService.getOrderList();
        model.addAttribute("orderList",userService);
        return "321";
    }

}
