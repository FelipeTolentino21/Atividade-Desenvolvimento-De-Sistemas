package arquitetura.camadas.repository;

import java.util.ArrayList;
import java.util.List;

import arquitetura.camadas.model.Usuario;

public class UsuarioRepository {
    ArrayList<Usuario> listaUsuario = new ArrayList<>();

    public Usuario salvar(Usuario usuario) {
        listaUsuario.add(usuario);
        return null;
    }

    public Usuario buscarPorId(int id) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarPorCpf(String cpf) {
        return null;
    }

    public Usuario buscarPorEmail(String email) {
        return null;
    }

    public List<Usuario> buscarPorNome(String nome) {
        ArrayList<Usuario> resultado = new ArrayList<>();
        for (Usuario usuario : listaUsuario) {
            if (usuario.getNome().contains(nome)) {
                resultado.add(usuario);
            }
        }
        return resultado;
    }

    public List<Usuario> listarTodos() {
        return listaUsuario;
    }

    public void atualizar(Usuario usuario) {

    }

    public void deletar(int id) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getId() == id) {
                listaUsuario.remove(usuario);
            }
        }
    }
}
