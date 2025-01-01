package dev.prathamesh.EcommerceProducts2024.Controller;

import dev.prathamesh.EcommerceProducts2024.Dto.FakeStoreDto;
import dev.prathamesh.EcommerceProducts2024.Service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServices productServices;



    @GetMapping("/product")
    public ResponseEntity getAllProducts(){
        List<FakeStoreDto> allProduct =
                productServices.getAllProduct();
        
        return ResponseEntity.ok(allProduct);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity getProductByID(@PathVariable("id") int id ){
        FakeStoreDto fakeStoreResponseProductByID =  productServices.getProductByID(id);
        return ResponseEntity.ok(fakeStoreResponseProductByID);
    }
}
