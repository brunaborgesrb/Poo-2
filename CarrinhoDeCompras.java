import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  
    //atributos
     private String usuario;
    private List<String> itens;

    //construtor
    public CarrinhoDeCompras(String usuario) {
        this.usuario = usuario;
        this.itens = new ArrayList<>();
    }

    // método para adicionar um item ao carrinho
    public void adicionarItem(String item) {
        if (this.usuario.equals(usuarioLogado())) {
            itens.add(item);
            System.out.println("Item '" + item + "' adicionado ao carrinho de " + this.usuario);
        } else {
            System.out.println("Apenas o usuário " + this.usuario + " pode modificar seu próprio carrinho.");
        }
    }

    // método para remover um item do carrinho
    public void removerItem(String item) {
        if (this.usuario.equals(usuarioLogado())) {
            if (itens.contains(item)) {
                itens.remove(item);
                System.out.println("Item '" + item + "' removido do carrinho de " + this.usuario);
            } else {
                System.out.println("O item '" + item + "' não está no carrinho de " + this.usuario);
            }
        } else {
            System.out.println("Apenas o usuário " + this.usuario + " pode modificar seu próprio carrinho.");
        }
    }

    // método para listar os itens no carrinho
    public void listarItens() {
        if (this.usuario.equals(usuarioLogado())) {
            System.out.println("Itens no carrinho de " + this.usuario + ":");
            for (String item : itens) {
                System.out.println("- " + item);
            }
        } else {
            System.out.println("Apenas o usuário " + this.usuario + " pode visualizar seu próprio carrinho.");
        }
    }

    private String usuarioLogado() {
        return "usuario123"; 
    }
}

