package ma.ace.controle_ace_souhaabouchikh;

import ma.ace.controle_ace_souhaabouchikh.Dao.Entities.Computer;
import ma.ace.controle_ace_souhaabouchikh.Dto.ComputerDto;
import ma.ace.controle_ace_souhaabouchikh.Services.ComputerManager;
import ma.ace.controle_ace_souhaabouchikh.Services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControleAceSouhaabouchikhApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ControleAceSouhaabouchikhApplication.class, args);
    }

    @Autowired
    private ComputerManager computerManager;
    @Override
    public void run(String... args) throws Exception {
        Computer computer = Computer.builder().proc("i7").ram("16").price(10000).hardDrive("256GB").macAddress("HVBUHYBGKY").build();
        computerManager.saveComputer(computer);
        Computer computer4 = Computer.builder().proc("i7").ram("25").price(10000).hardDrive("128GB").macAddress("HVBUHYBGKY").build();
        computerManager.saveComputer(computer4);

        Computer computer1 = Computer.builder().proc("i5").ram("8").price(8000).hardDrive("256GB").macAddress("DHDIHZKO").build();
        computerManager.saveComputer(computer1);

        Computer computer2 = Computer.builder().proc("i3").ram("4").price(6000).hardDrive("256GB").macAddress("FHBHIBKIK").build();
        computerManager.saveComputer(computer2);

        Computer computer3 = Computer.builder().proc("i9").ram("32").price(15000).hardDrive("256GB").macAddress("JHIEBINIJU").build();
        computerManager.saveComputer(computer3);

        System.out.println("Computer with i7 processor: " + computerManager.GetComputerByProc("i7").toString());
    }
}
