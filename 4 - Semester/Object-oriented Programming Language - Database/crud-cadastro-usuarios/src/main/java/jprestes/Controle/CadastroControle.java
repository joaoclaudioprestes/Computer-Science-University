package jprestes.Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CadastroControle {

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextField txfCpf;

    @FXML
    private TextField txfNome;

    @FXML
    private TextField txfRg;

    @FXML
    void cadastrarUsuario(ActionEvent event) {
      String usuario = txfNome.getText();
      String cpf = txfCpf.getText();
      String rg = txfRg.getText();

      System.out.println("Usuário: " + usuario);
      System.out.println("CPF: " + cpf);
      System.out.println("RG: " + rg);
    }

}
