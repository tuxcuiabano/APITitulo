package edu.ifmt.cobrancaifmt2.controller;

import edu.ifmt.cobrancaifmt2.model.titulo.Titulo;
import edu.ifmt.cobrancaifmt2.repository.TitulosRepository;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/titulos")
public class TituloController {

    private final TitulosRepository tituloRepository; 

    public TituloController(TitulosRepository tituloRepository) {
        this.tituloRepository = tituloRepository;
    }

    @GetMapping
    public List<Titulo> getAllTitulos() {
        return tituloRepository.findAll();
    }
    
    
    //http://localhost:9010/titulos  GET mostra todos

    @GetMapping("/{codigo}")
    public Optional<Titulo> getTituloByCodigo(@PathVariable Long codigo) {
        return tituloRepository.findById(codigo);
    }

    //http://localhost:9010/titulos/2 GET mostra item de codigo 2 
    
    
    @PostMapping
    public Titulo addTitulo(@RequestBody Titulo newTitulo) {
        return tituloRepository.save(newTitulo);
    }

    
    /*
     * Exemplo de método POST
{
   "descricao": "Descrição do Título",
   "dataVencimento": "2023-10-10",
   "valor": 100.50,
   "status": "PENDENTE"  
}
     */
    
    
    
    @PutMapping("/{codigo}")
    public Titulo updateTitulo(@RequestBody Titulo updatedTitulo, @PathVariable Long codigo) {
        updatedTitulo.setCodigo(codigo);
        return tituloRepository.save(updatedTitulo);
    }
    

    
    /*
     * 
   http://localhost:9010/titulos/1
   {
   "descricao": "Nova Descrição do Título",
   "dataVencimento": "2023-11-10",
   "valor": 150.75,
   "status": "PENDENTE"  
}
     */

    @DeleteMapping("/{codigo}")
    public void deleteTitulo(@PathVariable Long codigo) {
        tituloRepository.deleteById(codigo);
    }
    
    
    //http://localhost:9010/titulos/2  DELETA item codigo 2
    
    
    
    
}