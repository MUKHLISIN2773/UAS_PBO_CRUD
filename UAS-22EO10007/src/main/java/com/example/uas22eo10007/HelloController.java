import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class ApotekController {

    @FXML
    private TextField kodeObatField;

    @FXML
    private TextField namaObatField;

    @FXML
    private TextField idKategoriField;

    @FXML
    private TextField kodeSatuanField;

    @FXML
    private TableView<Obat> tableView;

    @FXML
    private TableColumn<Obat, String> kodeObatColumn;

    @FXML
    private TableColumn<Obat, String> namaObatColumn;

    @FXML
    private TableColumn<Obat, String> idKategoriColumn;

    @FXML
    private TableColumn<Obat, String> kodeSatuanColumn;

    @FXML
    private Button btnTambah;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnHapus;

    @FXML
    private Button btnReset;

    private ObservableList<Obat> dataList;

    @FXML
    public void initialize() {
        dataList = FXCollections.observableArrayList();
        kodeObatColumn.setCellValueFactory(new PropertyValueFactory<>("kodeObat"));
        namaObatColumn.setCellValueFactory(new PropertyValueFactory<>("namaObat"));
        idKategoriColumn.setCellValueFactory(new PropertyValueFactory<>("idKategori"));
        kodeSatuanColumn.setCellValueFactory(new PropertyValueFactory<>("kodeSatuan"));

        tableView.setItems(dataList);

        btnTambah.setOnAction(event -> tambahData());
        btnEdit.setOnAction(event -> editData());
        btnHapus.setOnAction(event -> hapusData());
        btnReset.setOnAction(event -> resetData());
    }

    private void tambahData() {
        Obat obat = new Obat(kodeObatField.getText(), namaObatField.getText(), idKategoriField.getText(), kodeSatuanField.getText());
        dataList.add(obat);
        clearFields();
    }

    private void editData() {
        Obat selectedObat = tableView.getSelectionModel().getSelectedItem();
        if (selectedObat != null) {
            selectedObat.setKodeObat(kodeObatField.getText());
            selectedObat.setNamaObat(namaObatField.getText());
            selectedObat.setIdKategori(idKategoriField.getText());
            selectedObat.setKodeSatuan(kodeSatuanField.getText());
            tableView.refresh();
            clearFields();
        }
    }

    private void hapusData() {
        Obat selectedObat = tableView.getSelectionModel().getSelectedItem();
        if (selectedObat != null) {
            dataList.remove(selectedObat);
        }
    }

    private void resetData() {
        dataList.clear();
    }

    private void clearFields() {
        kodeObatField.clear();
        namaObatField.clear();
        idKategoriField.clear();
        kodeSatuanField.clear();
    }
}
