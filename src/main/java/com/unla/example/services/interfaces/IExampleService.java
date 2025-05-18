package com.unla.example.services.interfaces;

import com.unla.example.models.dtos.requests.ExampleRequestDTO;
import com.unla.example.models.dtos.responses.ExampleResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IExampleService {

    ExampleResponseDTO save(ExampleRequestDTO exampleRequestDTO);

    ExampleResponseDTO findById(Integer id);

    //Find By ID not deleted
    ExampleResponseDTO findByIdNotDeleted(Integer id);

    // FindAll
    Page<ExampleResponseDTO> findAll(Pageable pageable);

    // FindAll not deleted
    Page<ExampleResponseDTO> findAllNotDeleted(Pageable pageable);

    ExampleResponseDTO update(Integer id, ExampleRequestDTO exampleRequestDTO);

    void deleteById(Integer id);

    ExampleResponseDTO restoreById(Integer id);
}