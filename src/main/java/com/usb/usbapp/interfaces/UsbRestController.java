package com.usb.usbapp.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsbRestController {

    @RequestMapping("/rest")
    public String usbModel() {
        return "Hello USB!!!";
    }
}
