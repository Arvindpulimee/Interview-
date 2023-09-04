/*
 * Creation : 4 Sep 2023
 */
package com.interview.spring.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

    @GetMapping("/orders")
    public String createOrders() {
        return null;

    }

}
