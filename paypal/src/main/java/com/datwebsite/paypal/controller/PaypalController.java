package com.datwebsite.paypal.controller;

import com.datwebsite.paypal.service.PaypalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaypalController {
    private final PaypalService paypalService;


}
