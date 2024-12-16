package ma.ace.controle_ace_souhaabouchikh.Dao.Repositories;

import ma.ace.controle_ace_souhaabouchikh.Dao.Entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> findByProc(String proc);
}
