package com.helloworld.quickstart.service;

import com.helloworld.quickstart.dto.FormRequestDto;
import com.helloworld.quickstart.connected.Form;
import com.helloworld.quickstart.repository.FormRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FormService {

    private final FormRepository formRepository;

    public Form saveForm(FormRequestDto requestDto) {
        Form form = requestDto.toEntity();
        return formRepository.save(form);
    }
}
