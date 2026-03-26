package arquitetura.camadas.repository;

import java.util.ArrayList;
import java.util.HashMap;

import arquitetura.camadas.model.Usuario;

public class UsuarioRepository {
    static int contadorId = 1;

    static HashMap<Integer, Usuario> bancoUsuarios = new HashMap<>();

    public void salvar(Usuario usuario) {
        bancoUsuarios.put(contadorId, usuario);
        contadorId++;
    }

    public Usuario buscarPorId(int id) {
        return bancoUsuarios.get(id);
    }

    public Usuario buscarPorCpf(String cpf) {
        for (Usuario usuario : bancoUsuarios.values()) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarPorEmail(String email) {
        for (Usuario usuario : bancoUsuarios.values()) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }

    public ArrayList<Usuario> buscarPorNome(String nome) {
        ArrayList<Usuario> resultados = new ArrayList<>();
        String busca = nome.toLowerCase();

        for (HashMap.Entry<Integer, Usuario> entrada : bancoUsuarios.entrySet()) {
            Usuario usuario = entrada.getValue();

            if (usuario.getNome().toLowerCase().contains(busca)) {
                resultados.add(usuario);
            }
        }
        return resultados;
    }

    // Viabilizar alteração para retornar um ArrayList ao invés de void (como em
    // quando retorna a lista resultados)
    public void listarTodos() {
        for (HashMap.Entry<Integer, Usuario> entrada : bancoUsuarios.entrySet()) {
            Integer chave = entrada.getKey();
            Usuario usuario = entrada.getValue();

            System.out.println("ID: " + chave + " | Usuario: " + usuario);
        }
    }

    // Mudar como esse método funciona
    // Ou lembrar que quando for usar esse método chamar algum outro que crie outro
    // usuario para substituir esse.
    public boolean atualizar(int id, Usuario usuario) {
        if (bancoUsuarios.containsKey(id)) {
            bancoUsuarios.replace(id, usuario);
            return true;
        }
        return false;
    }

    public boolean deletar(int id) {
        if (bancoUsuarios.containsKey(id)) {
            bancoUsuarios.remove(id);
            return true;
        }
        return false;
    }
}
