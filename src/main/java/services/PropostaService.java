package services;

import Mapper.PropostaMapper;
import dto.PropostaRequestDto;
import dto.PropostaResponseDto;
import entities.Proposta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repositories.PropostaRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class PropostaService {

    private PropostaRepository propostaRepository;

    public PropostaResponseDto criar(PropostaRequestDto requestDto){
        Proposta proposta = PropostaMapper.INSTANCE.convertDtoToProposta(requestDto);
        propostaRepository.save(proposta);

        return PropostaMapper.INSTANCE.convertEntityToDto(proposta);
    }

    public List<PropostaResponseDto> obterProposta() {
       return PropostaMapper.INSTANCE.convertListEntityToListDto(propostaRepository.findAll());
    }
}
