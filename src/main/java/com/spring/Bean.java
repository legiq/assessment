package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Bean {

    private SomeBean someBean;

    public Bean (SomeBean someBean) {
        this.someBean = someBean;
    }

    public String getStaff() {
        return someBean.doStaff();
    }

    public void setSomeBean(SomeBean someBean) {
        this.someBean = someBean;
    }
}
