package com.miniproject.veiculos;

import com.miniproject.veiculos.model.Multa;
import com.miniproject.veiculos.model.Veiculo;
import com.miniproject.veiculos.model.enums.TipoVeiculo;
import com.miniproject.veiculos.repository.MultaRepository;
import com.miniproject.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Aplicacao {

    @Autowired
    private VeiculoRepository veiculoRepo;

    @Autowired
    private MultaRepository multaRepo;

    public void executar() {
        Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculo.AUTOMOVEL, "Bat-Movel", 2022, "preto");
        Veiculo veiculo2 = new Veiculo("BCA-4321", TipoVeiculo.ONIBUS, "Enterprise", 1960, "prata");
        veiculoRepo.save(veiculo1);
        veiculoRepo.save(veiculo2);

        Multa multa1 = new Multa("Farol apagado", "Gothan City", 250F, veiculo1);
        Multa multa2 = new Multa("Insulfilm", "Gothan City", 100F, veiculo1);
        Multa multa3 = new Multa("Excesso velocidade", "Hiper-espaço", 400F, veiculo2);
        multaRepo.save(multa1);
        multaRepo.save(multa2);
        multaRepo.save(multa3);

        multa3.setValor(380F);
        multaRepo.save(multa3);

        System.out.println("Listando veiculos e multas:");
        System.out.println();
        List<Veiculo> veiculos = veiculoRepo.findAll();
        veiculos.forEach(System.out::println);
        System.out.println("---------------------------");
    }
}
