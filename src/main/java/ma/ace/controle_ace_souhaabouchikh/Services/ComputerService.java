package ma.ace.controle_ace_souhaabouchikh.Services;

import ma.ace.controle_ace_souhaabouchikh.Dao.Entities.Computer;
import ma.ace.controle_ace_souhaabouchikh.Dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    public ComputerDto saveComputer(Computer computer);
    public List<ComputerDto> GetComputerByProc(String proc);
}
