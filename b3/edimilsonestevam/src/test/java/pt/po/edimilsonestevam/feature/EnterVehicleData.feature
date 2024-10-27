Feature: Enter Vehicle Data
  I want to register my car in the Enter Vehicle Data

  @scenario-success-car-registered
  Scenario Outline: Car Registered Success
    Given I want to register my car in the Enter Vehicle Data <url>
    When I fill all fields <carName>, <carModel>, <cylinderCapacity>, <enginePerformance>, <dateManufacture>, <listPrice>, <seatsNumber>, <fuelType>, <licensePlateNumber>, <annualMileage>
    And I confirm action
    Then the system will show the success message <successMessage>

    Examples: 
      | url                                       | carName | carModel | cylinderCapacity | enginePerformance | dateManufacture | listPrice | seatsNumber | fuelType | licensePlateNumber | annualMileage | successMessage |
      | "www.sampleapp.tricentis.com/101/app.php" | "audi"  | "moped"  | 700              | 300               | 10262024        | 40000     | 6           | "petrol" | "BOND-007"         | 0             | ""             |
        