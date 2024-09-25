package com.siparisProject.siparis.webApi.controllers;

import com.siparisProject.siparis.business.OrderManager;
import com.siparisProject.siparis.model.dto.request.CreateOrderRequest;
import com.siparisProject.siparis.model.dto.response.CreateOrderResponse;
import com.siparisProject.siparis.model.dto.response.CreateOutletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrdersController {

    private final OrderManager orderManager;

    @PostMapping("/order")
    public void createOrder(@RequestBody CreateOrderRequest orderRequest)
    {
        orderManager.createOrder(orderRequest);
    }

    @GetMapping("/order/orderCode")
    public CreateOrderResponse getByOrderCode(@RequestParam String orderCode)
    {
        return orderManager.getByOrderCode(orderCode);
    }

    @GetMapping("/order/outletCode")
    public CreateOutletResponse getByOutletCode(@RequestParam String outletCode)
    {
        return orderManager.getByOutletCode(outletCode);
    }

    @PutMapping("/order/accept")
    public void orderAccept(@RequestParam String orderCode)
    {
        orderManager.orderAccept(orderCode);
    }

    @PutMapping("/order/reject")
    public void orderReject(@RequestParam String orderCode)
    {
        orderManager.orderReject(orderCode);
    }
}
