package com.example.ecommercesystem.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/add")
    String add(
             @RequestParam(value = "name") String name
            , @RequestParam(value = "description") String description
            , @RequestParam(value = "price") double price
            , @RequestParam(value = "quantity_in_stock") int quantity_in_stock
            , @RequestParam(value = "image_url") String image_url) {

        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setQuantity(quantity_in_stock);
        product.setImage(image_url);
        productService.createProduct(product);
        return "redirect:/products/products_management";
    }

    @GetMapping("/view")
    public String view(Model model) {
         model.addAttribute("products",productService.allProducts());
        return "products";
    }
    @GetMapping("/products_management")
    public String products_dashboard(Model model) {
        model.addAttribute("products" , productService.allProducts());
        return "products_management";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Product product = productService.getProduct(id);
        productService.deleteProduct(product);
        return "redirect:/products/products_management";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") int id) {
        Product product = productService.getProduct(id);
        model.addAttribute("product", product);
        return "edit_product";
    }
    @GetMapping("/add")
    public String addNewProduct() {
        return "add_new_product";
    }

    @PostMapping("/update")
    public String update(@RequestParam(value = "id") int id
            , @RequestParam(value = "name") String name
            , @RequestParam(value = "description") String description
            , @RequestParam(value = "price") double price
            , @RequestParam(value = "quantity_in_stock") int quantity_in_stock
            , @RequestParam(value = "image_url") String image_url) {
        Product product = productService.getProduct(id);
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setQuantity(quantity_in_stock);
        product.setImage(image_url);
        product = productService.createProduct(product);
        return "redirect:/products/products_management";
    }
}
