Feature: Enter Vehicle Data
  I want to register my car in the Enter Vehicle Data

  @scenario-success-car-registered
  Scenario Outline: Car Registered Success
    Given I want to register my car in the Enter Vehicle Data <url>
    When I fill all fields <carName>, <model>, <cylinderCapacity>, <enginePerformance>, <dateManufacture>, <mumberSeats>, <rightHandDrive>, <numberSeatsMotor>, <fuelType>, <payload>, <totalWeight>, <listPrice>, <licensePlateNumber>, <annualMileage>
    And I confirm action
    Then the system will show <tabName> tab

    Examples: 
      | url                                   | carName | model    | cylinderCapacity | enginePerformance | dateManufacture | mumberSeats | rightHandDrive | numberSeatsMotor | fuelType | payload | totalWeight | listPrice | licensePlateNumber | annualMileage | tabName                  |
      | "sampleapp.tricentis.com/101/app.php" | "Audi"  | "moped"  | "700"            | 300               | 10262024        | 6           | "yes"          | 3                | "petrol" | 500     | 600         | 4000      | "BOND-007"         | 100           | "Enter Insurant Data[7]" |