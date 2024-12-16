package ma.ace.controle_ace_souhaabouchikh.Services;

import lombok.Setter;
import ma.ace.controle_ace_souhaabouchikh.Dao.Entities.Computer;
import ma.ace.controle_ace_souhaabouchikh.Dao.Repositories.ComputerRepository;
import ma.ace.controle_ace_souhaabouchikh.Dto.ComputerDto;
import ma.ace.controle_ace_souhaabouchikh.Mappers.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerManager implements ComputerService {

    @Autowired
    private ComputerMapper computerMapper;

    @Autowired
    ComputerRepository computerRepository;


    @Override
    public ComputerDto saveComputer(Computer computer) {
        return computerMapper.FromEntitytoComputerDto(computerRepository.save(computer));
    }

    @Override
    public List<ComputerDto> GetComputerByProc(String proc) {
        List<ComputerDto>listDto=new ArrayList<>();
        List<Computer> computers = computerRepository.findByProc(proc);
        for (Computer computer : computers) {
            listDto.add(computerMapper.FromEntitytoComputerDto(computer));
        }
        return listDto;



    }
}
