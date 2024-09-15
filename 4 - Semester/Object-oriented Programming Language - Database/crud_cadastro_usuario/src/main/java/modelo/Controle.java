package modelo;

import DAL.UsuarioDAO;
import java.util.List;

public class Controle {

    public String mensagem;

    public void cadastrar(List<String> listUsuario) {
        Validacao val = new Validacao();

        val.validar(listUsuario);

        if (val.mensagem.equals("")) {
            if (listUsuario.size() >= 3) {

                Usuario user = new Usuario();
                user.setNome(listUsuario.get(0));
                user.setCpf(listUsuario.get(1));
                user.setRg(listUsuario.get(2));

                UsuarioDAO userD = new UsuarioDAO();
                userD.cadastrarUsuario(user);

                this.mensagem = userD.mensagem;
            } 
        } else {

            this.mensagem = val.mensagem;
        }
    }
}
