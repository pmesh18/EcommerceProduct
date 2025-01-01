package dev.prathamesh.EcommerceProducts2024.Client;

import dev.prathamesh.EcommerceProducts2024.Dto.FakeStoreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Component
public class ProductClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fake.store.url}")
    private String FakeStoreProductURL;
    @Value("${fake.store.product.path}")
    private String FakeStoreProductPath;

    public List<FakeStoreDto> getAllProduct(){
        String ProductURL = FakeStoreProductURL.concat(FakeStoreProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreDto[]> FakeStoreProduct =
                restTemplate.getForEntity(ProductURL, FakeStoreDto[].class);
        return List.of(FakeStoreProduct.getBody());

    }

    public FakeStoreDto getProductById(int id){

        String getProductByIDURL =  FakeStoreProductURL.concat(FakeStoreProductPath).concat("/"+ id);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreDto> productByID =
                restTemplate.getForEntity(getProductByIDURL, FakeStoreDto.class);
        return productByID.getBody();
    }
}
