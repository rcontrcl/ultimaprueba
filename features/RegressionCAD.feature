Feature: RegressionCAD
    Background: Background_newProject
    Given Acceder a la HomePage
    And Realizar el Login
    
    
    @ImportFeatureScen
    Scenario: ImportFeatureScen
    Given Crear un proyecto nuevo
    And Acceder al modulo de Requirements
    When Importar un fichero Feature
    When Acceder al modulo de Testing1
    And Añadir el TestingContext
    And Generar la prueba mediante los Requeriments
    Then Exportar el modelo
    And Generar el proyecto con Cucumber
    
    
    @CreateModelScen
    Scenario: CreateModelScen
    Given Comprobar que se ha realizado el Login correctamente
    And Crear un proyecto nuevo.
    When Acceder al modulo de Testing
    When Añadir la caja TestingContext
    And Añadimos la configuracion
    Then Añadimos una Suite
    When Añadimos un TestCase
    And Añadimos Steps en el Before
    And Añadimos Steps en el Execute
    And Añadimos Steps en el After
    When Añadimos un BeforeEach
    And Añadir los Steps
    Then Generar el proyecto con Main
    
    