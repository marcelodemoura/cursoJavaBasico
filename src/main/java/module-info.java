module com.cursojava.cursojavall {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cursojava.cursojavall to javafx.fxml;
    exports com.cursojava.cursojavall;
    exports com.cursojava.cursojavall.fundamentos;
    opens com.cursojava.cursojavall.fundamentos to javafx.fxml;
}