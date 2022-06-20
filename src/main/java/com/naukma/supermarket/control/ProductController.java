package com.naukma.supermarket.control;

import com.naukma.supermarket.model.Category;
import com.naukma.supermarket.model.Product;
import com.naukma.supermarket.repository.CategoryRepository;
import com.naukma.supermarket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView();
        List<Product> productList = productRepository.findAll();
        modelAndView.setViewName("/product/ProductDetails");
        modelAndView.addObject("productList", productList);
        return modelAndView;
    }

    @GetMapping("/productAddForm")
    public String productAddForm(Model model) {
        List<Category> listCategories = categoryRepository.findAll();
        model.addAttribute("product", new Product());
        model.addAttribute("listCategories", listCategories);
        return "product/add-product-form";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/products";
    }

    @GetMapping("/productEditForm")
    public ModelAndView productEditForm(@RequestParam Long id) {
        ModelAndView mav = new ModelAndView("/product/edit-product-form");
        //List<Category> listCategories = categoryRepository.findAll();
        Product product = productRepository.findById(id);
        mav.addObject("product", product);
        //mav.addObject("listCategories", listCategories);
        return mav;
    }

    @PostMapping("/editProduct")
    public String editProduct(@ModelAttribute Product product) {
        productRepository.update(product);
        return "redirect:/products";
    }

    @GetMapping("/deleteProduct")
    public String deleteProduct(@RequestParam Long id) {
        productRepository.deleteById(id);
        return "redirect:/products";
    }
}
