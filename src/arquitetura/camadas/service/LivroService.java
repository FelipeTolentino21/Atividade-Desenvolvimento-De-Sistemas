package arquitetura.camadas.service;

import java.util.ArrayList;

import arquitetura.camadas.model.Livro;
import arquitetura.camadas.repository.LivroRepository;

public class LivroService {
    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public void cadastrar(Livro livro, int id, String nome, String autor, int edicao, int quantidade) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID deve ser maior que 0");
        }
    
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
    
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("Autor não pode ser nulo ou vazio");
        }
    
        if (edicao <= 0) {
            throw new IllegalArgumentException("Edição deve ser maior que 0");
        }
    
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
    
        livro.setId(id);
        livro.setNome(nome);
        livro.setAutor(autor);
        livro.setEdicao(edicao);
        livro.setQuantidade(quantidade);
        
        livroRepository.salvar(livro);
    }

    public Livro buscarPorId(int id) {
        return livroRepository.buscarPorId(id);
    }

    public ArrayList<Livro> buscarPorNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        return livroRepository.buscarPorNome(nome);
    }

    public ArrayList<Livro> listarTodos() {
        return null;
    }

    public void alterar(Livro livro) {
    }

    public void remover(int id) {
    }
}
