package ma.ace.controle_ace_souhaabouchikh.Web;

import ma.ace.controle_ace_souhaabouchikh.Dao.Entities.Computer;
import ma.ace.controle_ace_souhaabouchikh.Dao.Repositories.ComputerRepository;
import ma.ace.controle_ace_souhaabouchikh.Dto.ComputerDto;
import ma.ace.controle_ace_souhaabouchikh.Services.ComputerManager;
import ma.ace.controle_ace_souhaabouchikh.Services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerGraphQlController {

    @Autowired
    ComputerService computerService;

    @MutationMapping
    public ComputerDto saveComputer(@Argument Computer computer) {
        return computerService.saveComputer(computer);
    }

    @QueryMapping
    public List<ComputerDto> GetComputerByProc(@Argument String proc) {
        return computerService.GetComputerByProc(proc);
    }


}
