package dev.prathamesh.EcommerceProducts2024.Service;

import dev.prathamesh.EcommerceProducts2024.Dto.FakeStoreDto;
import dev.prathamesh.EcommerceProducts2024.Dto.ProductResponseDto;

import java.util.List;

public interface ProductServices {
    List<FakeStoreDto> getAllProduct();
    FakeStoreDto getProductByID(int id);
}
