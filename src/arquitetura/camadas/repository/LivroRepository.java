package arquitetura.camadas.repository;

import java.util.ArrayList;
import java.util.HashMap;

import arquitetura.camadas.model.Livro;

public class LivroRepository {
    static int contadorId = 1;

    static HashMap<Integer, Livro> bancoLivros = new HashMap<>();

    public void salvar(Livro livro) {
        bancoLivros.put(contadorId, livro);
        contadorId++;
    }

    public Livro buscarPorId(int id) {
        return bancoLivros.get(id);
    }

    public ArrayList<Livro> buscarPorNome(String nome) {
        ArrayList<Livro> resultados = new ArrayList<>();
        String busca = nome.toLowerCase();

        for (HashMap.Entry<Integer, Livro> entrada : bancoLivros.entrySet()) {
            Livro livro = entrada.getValue();

            if (livro.getNome().toLowerCase().contains(busca)) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

    public void listarTodos() {
        for (HashMap.Entry<Integer, Livro> entrada : bancoLivros.entrySet()) {
            Integer chave = entrada.getKey();
            Livro livro = entrada.getValue();

            System.out.println("ID: " + chave + " | Livro: " + livro);
        }
    }

    // Mudar como esse método funciona
    // Ou lembrar que quando for usar esse método chamar algum outro que crie outro
    // livro para substituir esse.
    public boolean atualizar(int id, Livro livro) {
        if (bancoLivros.containsKey(id)) {
            bancoLivros.replace(id, livro);
            return true;
        }
        return false;
    }

    public boolean deletar(int id) {
        if (bancoLivros.containsKey(id)) {
            bancoLivros.remove(id);
            return true;
        }
        return false;
    }
}