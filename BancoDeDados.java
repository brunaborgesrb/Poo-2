
import java.util.HashMap;
import java.util.Map;

public class BancoDeDados {
    private Map<String, String> dados; // simulando um banco de dados simples
    private String usuarioAutenticado;

    public BancoDeDados() {
        this.dados = new HashMap<>();
        this.usuarioAutenticado = null;
    }

    // método para autenticar um usuário
    public void autenticarUsuario(String usuario, String senha) {
        // simule a lógica de autenticação, por exemplo, comparando com dados em um sistema real
        if (usuario.equals("usuario123") && senha.equals("senha123")) {
            this.usuarioAutenticado = usuario;
            System.out.println("Usuário autenticado com sucesso.");
        } else {
            System.out.println("Falha na autenticação. Verifique as credenciais.");
        }
    }

    // método para adicionar um registro (autorizado apenas para o usuário autenticado)
    public void adicionarRegistro(String chave, String valor) {
        if (usuarioAutenticado != null) {
            dados.put(chave, valor);
            System.out.println("Registro adicionado com sucesso.");
        } else {
            System.out.println("Apenas usuários autenticados podem adicionar registros.");
        }
    }

    // método para atualizar um registro (autorizado apenas para o usuário autenticado)
    public void atualizarRegistro(String chave, String novoValor) {
        if (usuarioAutenticado != null) {
            if (dados.containsKey(chave)) {
                dados.put(chave, novoValor);
                System.out.println("Registro atualizado com sucesso.");
            } else {
                System.out.println("Registro não encontrado.");
            }
        } else {
            System.out.println("Apenas usuários autenticados podem atualizar registros.");
        }
    }

    // método para excluir um registro (autorizado apenas para o usuário autenticado)
    public void excluirRegistro(String chave) {
        if (usuarioAutenticado != null) {
            if (dados.containsKey(chave)) {
                dados.remove(chave);
                System.out.println("Registro excluído com sucesso.");
            } else {
                System.out.println("Registro não encontrado.");
            }
        } else {
            System.out.println("Apenas usuários autenticados podem excluir registros.");
        }
    }

    // método para listar todos os registros (autorizado apenas para o usuário autenticado)
    public void listarRegistros() {
        if (usuarioAutenticado != null) {
            System.out.println("Registros no banco de dados:");
            for (Map.Entry<String, String> registro : dados.entrySet()) {
                System.out.println(registro.getKey() + ": " + registro.getValue());
            }
        } else {
            System.out.println("Apenas usuários autenticados podem listar registros.");
        }
    }

    // método para deslogar o usuário autenticado
    public void deslogarUsuario() {
        this.usuarioAutenticado = null;
        System.out.println("Usuário deslogado.");
    }
}
