package com.naukma.supermarket.control;


import com.naukma.supermarket.model.Checks;
import com.naukma.supermarket.model.Receipt;
import com.naukma.supermarket.repository.ChecksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CheckController {

    @Autowired
    private ChecksRepository checksRepository;

    @RequestMapping(value = "/receipt", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('category:read')")
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView();
        List<Receipt> checksList = checksRepository.findAll();
        modelAndView.setViewName("ChecksDetails");
        modelAndView.addObject("checksList", checksList);
        return modelAndView;
    }


    /*@GetMapping("/checkAddForm")
    public String store_productAddForm(Model model) {
        List<Product> listProducts = productRepository.findAll();
        List <Store_Product> listStoreProducts = store_productRepository.findAll();
        model.addAttribute("sale", new Sale());
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("listStoreProducts", listStoreProducts);
        return "/store_product/add-store-product";
    }*/
}
