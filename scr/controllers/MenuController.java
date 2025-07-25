package scr.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class MenuController {

    @FXML
    private void abrirCadastroEspaco(ActionEvent event) {
        // Aqui você pode carregar uma nova tela FXML para o cadastro de espaços
        System.out.println("Abrindo cadastro de espaço...");
        mostrarMensagem("Cadastro de Espaço", "Tela de cadastro ainda não implementada.");
    }

    @FXML
    private void abrirReservas(ActionEvent event) {
        System.out.println("Abrindo visualização de reservas...");
        mostrarMensagem("Visualizar Reservas", "Tela de reservas ainda não implementada.");
    }

    @FXML
    private void gerarRelatorios(ActionEvent event) {
        System.out.println("Gerando relatórios...");
        mostrarMensagem("Relatórios", "Funcionalidade de relatórios ainda não implementada.");
    }

    @FXML
    private void sairSistema(ActionEvent event) {
        System.exit(0);
    }

    private void mostrarMensagem(String titulo, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
