package com.siparisProject.siparis.business;

import com.siparisProject.siparis.dataAccess.OrderRepository;
import com.siparisProject.siparis.dataAccess.OutletRepository;
import com.siparisProject.siparis.dataAccess.ProductRepository;
import com.siparisProject.siparis.model.dto.request.CreateOrderRequest;
import com.siparisProject.siparis.model.dto.response.CreateOrderResponse;
import com.siparisProject.siparis.model.dto.response.CreateOutletResponse;
import com.siparisProject.siparis.model.dto.response.CreateProductListResponse;
import com.siparisProject.siparis.model.entity.Order;
import com.siparisProject.siparis.model.entity.Outlet;
import com.siparisProject.siparis.model.entity.Product;
import com.siparisProject.siparis.model.entity.Status;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderManager {

    private final OrderRepository orderRepository;
    private final OutletRepository outletRepository;
    private final ProductRepository productRepository;

    public void createOrder(CreateOrderRequest orderRequest)
    {
        List<CreateProductListResponse> productList = orderRequest.getProducts();
        Outlet outlet = outletRepository.findByOutletCode(orderRequest.getOutletCode());
        for (CreateProductListResponse product : productList)
        {
            Product tempProduct = productRepository.findByProductCode(product.getProductCode());
            Order order = new Order();
            order.setOrderCode(orderRequest.getOrderCode());
            order.setOutletId(outlet.getId());
            order.setProductId(tempProduct.getId());
            order.setQuantity(product.getQuantity());
            order.setStatus(Status.PENDING);
            orderRepository.save(order);
        }
    }

    public CreateOrderResponse getByOrderCode(String orderCode)
    {
        List<Order> orderList = orderRepository.findByOrderCode(orderCode);
        List<CreateProductListResponse> productList = new ArrayList<>();

        for (Order order : orderList)
        {
            Product product = productRepository.findById(order.getProductId()).orElseThrow();
            CreateProductListResponse productResponse = new CreateProductListResponse();
            productResponse.setProductCode(product.getProductCode());
            productResponse.setQuantity(order.getQuantity());
            productList.add(productResponse);
        }

        Order order = orderList.get(0);
        Outlet outlet = outletRepository.findById(order.getOutletId()).orElseThrow();
        CreateOrderResponse orderResponse = new CreateOrderResponse();
        orderResponse.setOrderCode(order.getOrderCode());
        orderResponse.setOutletCode(outlet.getOutletCode());
        orderResponse.setStatus(Status.PENDING);
        orderResponse.setProducts(productList);

        return orderResponse;
    }

    public CreateOutletResponse getByOutletCode(String outletCode)
    {
        Outlet outlet = outletRepository.findByOutletCode(outletCode);
        CreateOutletResponse outletResponse = new CreateOutletResponse();

        outletResponse.setOutletCode(outlet.getOutletCode());
        outletResponse.setSignName(outlet.getSignName());
        outletResponse.setAddress(outlet.getAddress());
        outletResponse.setLongitude(outlet.getLongitude());
        outletResponse.setLatitude(outlet.getLatitude());

        return outletResponse;
    }

    public void orderAccept(String orderCode)
    {
        List<Order> orders = orderRepository.findByOrderCode(orderCode);
        for (Order order : orders)
        {
            order.setStatus(Status.ACCEPTED);
            orderRepository.save(order);
        }

    }

    public void orderReject(String orderCode)
    {
        List<Order> orders = orderRepository.findByOrderCode(orderCode);
        for (Order order : orders)
        {
            order.setStatus(Status.ACCEPTED);
            orderRepository.save(order);
        }

    }

}
