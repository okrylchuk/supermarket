package com.naukma.supermarket.control;

import com.naukma.supermarket.model.Category;
import com.naukma.supermarket.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('category:read')")
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView();
        List<Category> categoryList = categoryRepository.findAll();
        modelAndView.setViewName("category/CategoryDetails");
        modelAndView.addObject("categoryList", categoryList);
        return modelAndView;
    }

    @GetMapping({"/addCategoryForm"})
    @PreAuthorize("hasAuthority('category:write')")
    public ModelAndView addCategoryForm() {
        ModelAndView mav = new ModelAndView("category/add-category-form");
        Category newCategory = new Category();
        mav.addObject("category", newCategory);
        return mav;
    }

    @PostMapping("/saveCategory")
    @PreAuthorize("hasAuthority('category:write')")
    public String saveCategory(@ModelAttribute Category category) {
        categoryRepository.save(category);
        return "redirect:/categories";
    }

    @GetMapping("/showEditForm")
    @PreAuthorize("hasAuthority('category:write')")
    public ModelAndView showEditForm(@RequestParam Long id) {
        ModelAndView mav = new ModelAndView("/category/edit-category-form");
        Category category = categoryRepository.findById(id);
        mav.addObject("category", category);
        return mav;
    }

    @PostMapping("/editCategory")
    @PreAuthorize("hasAuthority('category:write')")
    public String editCategory(@ModelAttribute Category category) {
        categoryRepository.update(category);
        return "redirect:/categories";
    }

    @GetMapping("/deleteCategory")
    @PreAuthorize("hasAuthority('category:write')")
    public String deleteCategory(@RequestParam Long id) {
        categoryRepository.deleteById(id);
        return "redirect:/categories";
    }
}
