package table;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLTableViewController implements Initializable {
    CSVWork model;

    public void setModel(CSVWork _model) {
        model = _model;

        ArrayList<Person> l = null;
        try {
            l = model.parseCSV();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Person p: l) {
            getData().add(p);
        }
    }

    public void writeModel() throws IOException {
        model.writeCsvFile(data);
    }

    @FXML private TableView<Person> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;
    @FXML private TextField statusField;
	private ObservableList<Person> data = null;
    @FXML
    protected void addPerson(ActionEvent event) {
        getData().add(new Person(firstNameField.getText(), lastNameField.getText(), emailField.getText(), statusField.getText()));
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        statusField.setText("");
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {

		setData(tableView.getItems());

    }

	public ObservableList<Person> getData() {
		return data;
	}

	private void setData(ObservableList<Person> data) {
		this.data = data;
	}
}
