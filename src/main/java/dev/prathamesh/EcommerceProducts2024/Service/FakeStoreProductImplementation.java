package dev.prathamesh.EcommerceProducts2024.Service;

import dev.prathamesh.EcommerceProducts2024.Client.ProductClient;
import dev.prathamesh.EcommerceProducts2024.Dto.FakeStoreDto;
import dev.prathamesh.EcommerceProducts2024.Dto.ProductResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FakeStoreProductImplementation implements ProductServices{

    @Autowired
    private ProductClient productClient;
    @Override
    public List<FakeStoreDto> getAllProduct() {
        List<FakeStoreDto> allProduct = productClient.getAllProduct();

        return allProduct;
    }

    @Override
    public ProductResponseDto getProductByID(int id) {
        ProductResponseDto productByID = productClient.getProductById( id);
        return productByID;
    }
}
