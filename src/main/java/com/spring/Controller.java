package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Bean bean;

    public void setBean(Bean bean) {
        this.bean = bean;
    }

    @GetMapping("/staff")
    public ResponseEntity<String> getProductsInfo() {
        return ResponseEntity.ok(bean.getStaff());
    }
}
