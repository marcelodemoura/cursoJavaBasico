module com.cursojava.cursojavall {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens com.cursojava.cursojava to javafx.fxml;
//    exports com.cursojava.cursojavall;
    exports com.cursojava.cursojava.leonardoLeitao.clinica.exercicios;
    opens com.cursojava.cursojava.leonardoLeitao.clinica.exercicios to javafx.fxml;
    exports com.cursojava.cursojava.leonardoLeitao.clinica.exercicios.fundamentos;
    opens com.cursojava.cursojava.leonardoLeitao.clinica.exercicios.fundamentos to javafx.fxml;
}