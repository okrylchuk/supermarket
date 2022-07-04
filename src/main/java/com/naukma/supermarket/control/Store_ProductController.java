package com.naukma.supermarket.control;

import com.naukma.supermarket.model.Product;
import com.naukma.supermarket.model.Store_Product;
import com.naukma.supermarket.repository.ProductRepository;
import com.naukma.supermarket.repository.Store_ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Store_ProductController {

    @Autowired
    private Store_ProductRepository store_productRepository;
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/store_products", method = RequestMethod.GET)
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView();
        List<Store_Product> productList = store_productRepository.findAll();
        modelAndView.setViewName("/store_product/Store_ProductDetails");
        modelAndView.addObject("productList", productList);
        return modelAndView;
    }

    @GetMapping("/store_productAddForm")
    public String store_productAddForm(Model model) {
        List<Product> listProducts = productRepository.findAll();
        List <Store_Product> listStoreProducts = store_productRepository.findAll();
        model.addAttribute("product", new Store_Product());
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("listStoreProducts", listStoreProducts);
        return "/store_product/add-store-product";
    }

    @PostMapping("/saveStoreProduct")
    public String saveProduct(@ModelAttribute Store_Product product) {
        store_productRepository.save(product);
        return "redirect:/store_products";
    }

    @GetMapping("/storeProductEditForm")
    public ModelAndView storeProductEditForm(@RequestParam String id) {
        ModelAndView mav = new ModelAndView("/store_product/edit-store-product-form");
        Store_Product product = store_productRepository.findById(id);
        mav.addObject("product", product);
        return mav;
    }

    @PostMapping("/editStoreProduct")
    public String editStoreProduct(@ModelAttribute Store_Product product) {
        store_productRepository.update(product);
        return "redirect:/store_products";
    }
}
