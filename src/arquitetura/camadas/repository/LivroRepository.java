package arquitetura.camadas.repository;

import java.util.ArrayList;
import java.util.HashMap;

import arquitetura.camadas.model.Livro;

public class LivroRepository {
    static int contadorId = 1;

    static HashMap<Integer, Livro> banco = new HashMap<>();

    public void salvar(Livro livro) {
        banco.put(contadorId, livro);
        contadorId++;
    }

    public Livro buscarPorId(int id) {
        return banco.get(id);
    }

    public ArrayList<Livro> buscarPorNome(String nome) {
        ArrayList<Livro> resultados = new ArrayList<>();
        String busca = nome.toLowerCase();

        for (HashMap.Entry<Integer, Livro> entrada : banco.entrySet()) {
            Livro livro = entrada.getValue();

            if (livro.getNome().toLowerCase().contains(busca)) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

    public void listarTodos() {
        for (HashMap.Entry<Integer, Livro> entrada : banco.entrySet()) {
            Integer chave = entrada.getKey();
            Livro livro = entrada.getValue();

            System.out.println("ID: " + chave + " | Livro: " + livro);
        }
    }

    public boolean atualizar(int id, Livro livro) {
        if (banco.containsKey(id)) {
            banco.replace(id, livro);
            return true;
        }
        return false;
    }

    public boolean deletar(int id) {
        if (banco.containsKey(id)) {
            banco.remove(id);
            return true;
        }
        return false;
    }
}