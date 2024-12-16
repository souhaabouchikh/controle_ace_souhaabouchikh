package ma.ace.controle_ace_souhaabouchikh.Dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ComputerDto {
    private String proc;
    private String ram;
    private String hardDrive;
    private double price;

}
