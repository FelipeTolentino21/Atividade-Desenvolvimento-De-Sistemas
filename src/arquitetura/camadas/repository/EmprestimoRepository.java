package arquitetura.camadas.repository;

import java.util.ArrayList;
import java.util.HashMap;

import arquitetura.camadas.model.Emprestimo;

public class EmprestimoRepository {
    static int contadorId = 1;

    static HashMap<Integer, Emprestimo> bancoEmprestimos = new HashMap<>();

    public void salvar(Emprestimo emprestimo) {
        bancoEmprestimos.put(contadorId, emprestimo);
        contadorId++;
    }

    public Emprestimo buscarPorId(int id) {
        return bancoEmprestimos.get(id);
    }

    public ArrayList<Emprestimo> buscarPorUsuario(int usuarioId) {
        ArrayList<Emprestimo> resultados = new ArrayList<>();

        for (Emprestimo emprestimo : bancoEmprestimos.values()) {
            if (emprestimo.getUsuarioId() == usuarioId) {
                resultados.add(emprestimo);
            }
        }
        return resultados;
    }

    public ArrayList<Emprestimo> buscarEmprestimosAtivos(int usuarioId) {
        ArrayList<Emprestimo> resultados = new ArrayList<>();

        for (Emprestimo emprestimo : bancoEmprestimos.values()) {
            if (emprestimo.getUsuarioId() == usuarioId && emprestimo.isAtivo()) {
                resultados.add(emprestimo);
            }
        }
        return resultados;
    }

    // Viabilizar alteração para retornar um ArrayList ao invés de void (como em
    // quando retorna a lista resultados)
    public void listarTodos() {
        for (HashMap.Entry<Integer, Emprestimo> entrada : bancoEmprestimos.entrySet()) {
            Integer chave = entrada.getKey();
            Emprestimo emprestimo = entrada.getValue();

            System.out.println("ID: " + chave + " | Emprestimo: " + emprestimo);
        }
    }

    public ArrayList<Emprestimo> listarEmprestimosAtivos() {
        ArrayList<Emprestimo> resultados = new ArrayList<>();

        for (Emprestimo emprestimo : bancoEmprestimos.values()) {
            if (emprestimo.isAtivo()) {
                resultados.add(emprestimo);
            }
        }
        return resultados;
    }

    // Mudar como esse método funciona
    // Ou lembrar que quando for usar esse método chamar algum outro que crie outro
    // emprestimo para substituir esse.
    public boolean atualizar(int id, Emprestimo emprestimo) {
        if (bancoEmprestimos.containsKey(id)) {
            bancoEmprestimos.replace(id, emprestimo);
            return true;
        }
        return false;
    }

    public boolean deletar(int id) {
        if (bancoEmprestimos.containsKey(id)) {
            bancoEmprestimos.remove(id);
            return true;
        }
        return false;
    }
}