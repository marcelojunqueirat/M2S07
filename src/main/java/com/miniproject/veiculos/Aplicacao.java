package com.miniproject.veiculos;

import com.miniproject.veiculos.model.Veiculo;
import com.miniproject.veiculos.model.enums.TipoVeiculo;
import com.miniproject.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aplicacao {

    @Autowired
    private VeiculoRepository veiculoRepo;

    public void executar() {
        Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculo.AUTOMOVEL, "Bat-Movel", 2022, "preto");
        Veiculo veiculo2 = new Veiculo("BCA-4321", TipoVeiculo.ONIBUS, "Enterprise", 1960, "prata");
        veiculoRepo.save(veiculo1);
        veiculoRepo.save(veiculo2);
    }
}
