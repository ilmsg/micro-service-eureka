package com.ilmsg.eurekaclientstore.consumers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ilmsg.eurekaclientstore.entities.Product;
import com.ilmsg.eurekaclientstore.entities.ProductList;

@Component
public class ProductConsumer {

    @Autowired
    private DiscoveryClient client;

    public List<Product> getProducts() {
        List<ServiceInstance> serviceList = client.getInstances("eureka-client-product");
        ServiceInstance serviceInstance = serviceList.get(0);
        String url = serviceInstance.getUri() + "/products";
        System.out.println(url);
        for (ServiceInstance si : serviceList) {
            System.out.println(si);
        }

        RestTemplate restTemplate = new RestTemplate();
        ProductList response = restTemplate.getForObject(url, ProductList.class);
        return response.getProducts();

        // return (List<Product>) restTemplate.getForEntity(url, List.class).getBody();
        // var ps = restTemplate.getForEntity(url, List.class).getBody();
        // return ps.stream().map(p -> (Product) p).collect(Collectors.toList());
    }
}
