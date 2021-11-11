package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Bean {

    private ValidBean someBean;

    public Bean (ValidBean someBean) {
        this.someBean = someBean;
    }

    public String getStaff() {
        return someBean.doStaff();
    }

    public void setSomeBean(ValidBean someBean) {
        this.someBean = someBean;
    }
}
