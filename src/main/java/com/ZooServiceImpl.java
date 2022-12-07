package com;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ZooServiceImpl {
    private final CamelZooRepository camelZooRepository;
    private final LamaZooRepository lamaZooRepository;

    public List<MoscowZooDto> generateConfiguration(long projectId, long cageId) {
        List<Camel> camelList = camelZooRepository.findAllBy(projectId, cageId, "select * from _camel(?,?)", Camel.class);
        List<Lama> lamaList = lamaZooRepository.findAllBy(projectId, cageId, "select * from _lama(?,?)", Lama.class);

        List<MoscowZooDto> moscowZooDtos = new ArrayList<>();
        return moscowZooDtos;
    }
}
