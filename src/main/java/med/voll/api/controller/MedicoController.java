package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.DadosListagemMedicos;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid DadosCadastroMedico dadosCadastroMedico){
        medicoRepository.save(new Medico(dadosCadastroMedico));
    }
    @GetMapping
    public Page<DadosListagemMedicos> listar(@PageableDefault(size = 10, page = 0, sort = {"nome"}) Pageable pageable) {
        return medicoRepository.findAll(pageable).map(DadosListagemMedicos::new);
    }
}
