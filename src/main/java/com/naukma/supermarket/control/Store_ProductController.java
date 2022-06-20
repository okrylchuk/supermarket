package com.naukma.supermarket.control;

import com.naukma.supermarket.model.Product;
import com.naukma.supermarket.model.Store_Product;
import com.naukma.supermarket.repository.Store_ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Store_ProductController {

    private Store_ProductRepository store_productRepository;
}
