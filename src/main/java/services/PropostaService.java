package services;

import dto.PropostaRequestDto;
import dto.PropostaResponseDto;
import entities.Proposta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repositories.PropostaRepository;

@AllArgsConstructor
@Service
public class PropostaService {

    private PropostaRepository propostaRepository;

    public PropostaResponseDto criar(PropostaRequestDto requestDto){
        propostaRepository.save(new Proposta());
        return null;
    }
}
