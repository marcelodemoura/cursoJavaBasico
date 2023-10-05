module com.cursojava.cursojavall {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cursojava.cursojavall to javafx.fxml;
    exports com.cursojava.cursojavall;
}