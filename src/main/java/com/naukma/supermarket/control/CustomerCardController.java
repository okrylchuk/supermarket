package com.naukma.supermarket.control;

import com.naukma.supermarket.model.CustomerCard;
import com.naukma.supermarket.repository.CustomerCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerCardController {

    @Autowired
    private CustomerCardRepository customerCardRepository;
    private String oldKey;


    @RequestMapping(value = "/customer_cards", method = RequestMethod.GET)
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView();
        List<CustomerCard> customerCardList = customerCardRepository.findAll();
        modelAndView.setViewName("/customer_card/CustomerCardDetails");
        modelAndView.addObject("customerCardList", customerCardList);
        return modelAndView;
    }

    @GetMapping({"/CustomerCardAddForm"})
    public ModelAndView CustomerCardAddForm() {
        ModelAndView mav = new ModelAndView("/customer_card/customer_card-add-form");
        CustomerCard customerCard = new CustomerCard();
        mav.addObject("customerCard", customerCard);
        return mav;
    }

    @PostMapping("/saveCustomerCard")
    public String saveCustomerCard(@ModelAttribute CustomerCard card) {
        customerCardRepository.save(card);
        return "redirect:/customer_cards";
    }

    @GetMapping("/customerCardEditForm")
    public ModelAndView customerCardEditForm(@RequestParam String id) {
        ModelAndView mav = new ModelAndView("/customer_card/customer_card-edit-form");
        CustomerCard card = customerCardRepository.findById(id);
        oldKey = id;
        mav.addObject("card", card);
        return mav;
    }

    @PostMapping("/editCustomerCard")
    public String editCustomerCard(@ModelAttribute CustomerCard card) {
        customerCardRepository.update(card, oldKey);
        return "redirect:/customer_cards";
    }

    @GetMapping("/deleteCard")
    public String deleteCard(@RequestParam String id) {
        customerCardRepository.deleteById(id);
        return "redirect:/customer_cards";
    }
}
