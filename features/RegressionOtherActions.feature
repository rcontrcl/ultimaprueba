Feature: RegressionOtherActions
    
    @UpdateFileScen
    Scenario: UpdateFileScen
    Given Navegar a la pagina tus.io
    When Subir un fichero
    Then Comprobar los distintos asserions
    
    
    @ChangeDriverScen
    Scenario: ChangeDriverScen
    Given Abrir un nuevo navegador a la pagina JIRAITO
    And Comprobar que estamos en la pagina JIRAITO
    When Abrir un nuevo navegador a la pagina Gmail
    And Abrir la pestaña para realizar el inicio de sesion
    And Comprobar que podemos realizar el inicio de sesion
    When Volver a la pestaña de Gmail
    And Comprobar que estamos en la pagina Gmail
    Then Volver a la pagina CAD
    And Comprobar que estamos en la pagina CAD
    
    