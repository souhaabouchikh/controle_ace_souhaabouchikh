package ma.ace.controle_ace_souhaabouchikh.Mappers;

import ma.ace.controle_ace_souhaabouchikh.Dao.Entities.Computer;
import ma.ace.controle_ace_souhaabouchikh.Dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    ModelMapper modelMapper = new ModelMapper();

    public ComputerDto FromEntitytoComputerDto(Computer computer) {
        return modelMapper.map(computer, ComputerDto.class);
    }

    public Computer FromComputerDtoToEntity(ComputerDto computerDto) {
        return modelMapper.map(computerDto, Computer.class);
    }
}
