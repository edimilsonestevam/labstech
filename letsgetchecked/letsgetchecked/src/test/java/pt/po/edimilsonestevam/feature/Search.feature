Feature: Search City
  I want to search a city in the Google Maps

  @scenario-search-city
  Scenario Outline: User wants to search a city
    Given i am Google Maps page <url>
    When i type name city <cityName> in the search field
    Then Google Maps will show city wanted <cityWanted>

    Examples: 
      | url                   | cityName | cityWanted |
      | "www.google.com/maps" | "Dublin" | "Dublin"   |