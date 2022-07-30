package com.example.demo.Service;
import com.example.demo.Model.Meal;
import com.example.demo.Model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    List<Order> userLis=new ArrayList<>();

    public OrderService() {
       super();
        List<Meal> meals=new ArrayList<>();
        meals.add(new Meal("hamburger","good",123));

        this.userLis.add(new Order(1,1000,"david",meals));
        this.userLis.add(new Order(2,3000,"david",meals));
    }
    public Order getip(int seq) {
        for(int i=0;i<this.userLis.size();i++){
        if(this.userLis.get(i).getSeq()==seq){
            return this.userLis.get(i);
        }
    }
        return null;
    }
    public int getTotal(){
        int total = 0;
        for(int i=0;i<this.userLis.size();i++){
            total += userLis.get(i).getTotalPrice();
        }
        return total;
    }
    public List<Order> getOrderList(){
        return this.userLis;
    }

    }
