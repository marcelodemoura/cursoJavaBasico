module com.cursojava.cursojavall {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cursojava.cursojavall to javafx.fxml;
//    exports com.cursojava.cursojavall;
    exports com.cursojava.cursojavall.exercicios;
    opens com.cursojava.cursojavall.exercicios to javafx.fxml;
}