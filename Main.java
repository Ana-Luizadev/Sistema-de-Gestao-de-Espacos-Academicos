import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;

import java.util.ArrayList;

public class Main extends Application {

    private final ArrayList<Espaco> espacos = new ArrayList<>();
    private final ListView<String> listView = new ListView<>();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sistema de Gestão de Espaços Acadêmicos");

        // Campos para cadastro
        TextField tfNome = new TextField();
        tfNome.setPromptText("Nome da sala");

        TextField tfCapacidade = new TextField();
        tfCapacidade.setPromptText("Capacidade");

        TextField tfLocalizacao = new TextField();
        tfLocalizacao.setPromptText("Localização");

        TextField tfCarteiras = new TextField();
        tfCarteiras.setPromptText("Número de carteiras");

        Button btnCadastrar = new Button("Cadastrar Sala de Aula");

        btnCadastrar.setOnAction(e -> {
            try {
                String nome = tfNome.getText();
                int capacidade = Integer.parseInt(tfCapacidade.getText());
                String localizacao = tfLocalizacao.getText();
                int numCarteiras = Integer.parseInt(tfCarteiras.getText());

                SalaDeAula sala = new SalaDeAula(nome, capacidade, localizacao, numCarteiras);
                espacos.add(sala);
                listView.getItems().add(sala.toString());

                tfNome.clear();
                tfCapacidade.clear();
                tfLocalizacao.clear();
                tfCarteiras.clear();
            } catch (NumberFormatException ex) {
                mostrarAlerta("Erro", "Capacidade e número de carteiras devem ser números inteiros.");
            }
        });

        VBox form = new VBox(10, tfNome, tfCapacidade, tfLocalizacao, tfCarteiras, btnCadastrar);
        form.setPadding(new Insets(10));

        VBox layout = new VBox(10, form, new Label("Espaços cadastrados:"), listView);
        layout.setPadding(new Insets(10));

        primaryStage.setScene(new Scene(layout, 400, 450));
        primaryStage.show();
    }

    private void mostrarAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
