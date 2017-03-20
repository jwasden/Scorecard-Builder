package scorecardBuilder;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.awt.Button;
import java.util.Objects;

public class Controller {

    @FXML
    public RadioButton scheduleWavering;

    @FXML
    public RadioButton behindSchedule;

    @FXML
    public RadioButton onSchedule;
    public DatePicker scorecardDate;

    @FXML
    //table columns
    public TableColumn nameCol;
    public TableColumn descCol;
    public TableColumn completeCol;
    public TableColumn healthCol;
    public TableColumn orderCol;
    public TableColumn removeCol;
    public TableView tableView;
    public String defaultComplete;

    @FXML
    private Button addProject;

    @FXML
    private TextField projectName;

    @FXML
    private TextArea ProjectDescription;

    @FXML
    private ComboBox percentComplete;
//
//    @FXML
//    private ResourceBundle resources;
//
//    @FXML
//    private DocFlavor.URL location;
//
    @FXML
    private ToggleGroup Health;

    private Scorecard scorecard;
    @FXML
    void handleAddProject(MouseEvent event) {

        //Set scorecard if needed
        if (scorecard == null) {
            scorecard = new Scorecard("Key Initiatives Scorecard for City of Las Vegas Information Technologies", "MM/DD/YYYY");
        }

        //set variables to a
        String name = projectName.getText();
        String desc = ProjectDescription.getText();
        int complete;
        String health = "Schedule unknown";

        //remove percent character from complete and normalize output
        String completeStr = percentComplete.getValue().toString();
        completeStr = completeStr.replaceAll("[^\\d.]", "");
        complete = Integer.parseInt(completeStr);

        //normalize health status output
        Object healthObj = Health.getSelectedToggle();

        if (healthObj == onSchedule) {
            health = "On Schedule";
        } else if (healthObj == scheduleWavering) {
            health = "Schedule Wavering";
        } else if (healthObj == behindSchedule) {
            health = "Behind Schedule";
        }

        //add to tableview
        ObservableList<Project> data = tableView.getItems();
        data.add(new Project(name, desc, complete, health));

        //clear fields
        ProjectDescription.setText("");
        projectName.setText("");
        percentComplete.setValue(defaultComplete);
        Health.selectToggle(onSchedule);

        //create project
        Project project = new Project(name, desc, complete, health);

        //Print the project attributes
        System.out.println("The Project Name is: " + project.getName());
        System.out.println("The Project Description is: " + project.getDescription());
        System.out.println("The Project Completion is: " + project.getPercentComplete());
        System.out.println("The Project Health is: " + project.getHealth());

//        //add to column -- review docs.oracle.com/javafx/2/ui_controls/table-view.htm
//        nameCol.setCellValueFactory(new PropertyValueFactory<Project, String>("name"));
//        descCol.setCellValueFactory(new PropertyValueFactory<Project, String>("desc"));
//        completeCol.setCellValueFactory(new PropertyValueFactory<Project, Integer>("name"));
//        healthCol.setCellValueFactory(new PropertyValueFactory<Project, String>("health"));

        //add project to scorecard
        scorecard.addProjectToScorecard(project);

        System.out.println(scorecard.getScorecardProjects());

    }

    @FXML
    void handlePublishScorecard(MouseEvent event) {
        System.out.println("the scorecard was added!");
        System.out.println(scorecard.getDescription());
        System.out.println(scorecard.getDate());

        for(Project project : scorecard.getScorecardProjects()) {
            System.out.println("The Project Name is: " + project.getName());
            System.out.println("The Project Description is: " + project.getDescription());
            System.out.println("The Project Completion is: " + project.getPercentComplete() + "%");
            System.out.println("The Project Health is: " + project.getHealth());
            System.out.println("The Project Index is: " + scorecard.getScorecardProjects().indexOf(project) );
            System.out.println("");
        }

    }
//
//    @FXML
//    void initialize() {
//        assert Health != null : "fx:id=\"Health\" was not injected: check your FXML file 'Scorecard Builder.fxml'.";
//
//    }

    @FXML
    public void initialize() {

    }

    }


