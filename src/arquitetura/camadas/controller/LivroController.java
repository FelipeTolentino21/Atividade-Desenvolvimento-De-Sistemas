package arquitetura.camadas.controller;

import java.util.List;

import arquitetura.camadas.model.Livro;
import arquitetura.camadas.service.LivroService;

public class LivroController {
    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    public void cadastrar(Livro livro) {
    }

    public Livro buscarPorId(int id) {
        return null;
    }

    public List<Livro> buscarPorNome(String nome) {
        return null;
    }

    public List<Livro> listarTodos() {
        return null;
    }

    public void alterar(Livro livro) {
    }

    public void remover(int id) {
    }
}
