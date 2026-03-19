package br.ceub.repository;

import java.util.ArrayList;
import java.util.List;

import br.ceub.model.Livro;

public class LivroRepository {
	ArrayList<Livro> listaLivro = new ArrayList<>();

    public Livro salvar(Livro livro) {
    	listaLivro.add(livro);
        return null;
    }

    public Livro buscarPorId(int id) {
    	for (Livro livro : listaLivro) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public List<Livro> buscarPorNome(String nome) {
    	ArrayList<Livro> resultado = new ArrayList<>();
    	for (Livro livro : listaLivro) {
            if (livro.getNome().equals(nome)) {
               resultado.add(livro);
            }
        }
        return resultado;
    }

    public List<Livro> listarTodos() {
        return listaLivro;
    }

    public void atualizar(Livro livro) {
        for (Livro l : listaLivro) {
            if (l.getId() == livro.getId()) {
                l.setNome(livro.getNome());
                //Fill
                return;
            }
        }
    }

    public void deletar(int id) {
    	  for (Livro livro : listaLivro) {
    	        if (livro.getId() == id) {
    	            listaLivro.remove(livro);
    	            return;
    	        }
    	    }
    }
}
