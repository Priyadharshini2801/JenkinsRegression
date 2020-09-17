$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/TypesOfRooms.feature");
formatter.feature({
  "name": "Verifying the adactin functionalities with types of rooms",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying adactin login functionalities with types of rooms",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepLoginH.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "priyadharshiniM",
        "priyasuji"
      ]
    },
    {
      "cells": [
        "priyadharshiniM",
        "priyasuji"
      ]
    },
    {
      "cells": [
        "priyadharshiniM",
        "priyasuji"
      ]
    },
    {
      "cells": [
        "priyadharshiniM",
        "priyasuji"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepLoginH.user_should_enter(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepLoginH.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the location as",
  "rows": [
    {
      "cells": [
        "location",
        "hotels",
        "roomType",
        "numberOfRooms",
        "adultsPerRoom",
        "childrenPerRoom"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Deluxe",
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Deluxe",
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Deluxe",
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Deluxe",
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepLoginH.user_should_select_the_location_as(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepLoginH.user_should_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click  the radio button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepLoginH.user_should_click_the_radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepLoginH.user_should_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the values as",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Address",
        "CardNo",
        "CardType",
        "Month",
        "Year",
        "Cvv"
      ]
    },
    {
      "cells": [
        "priya",
        "dhasrhini",
        "chennai",
        "7485000236510000",
        "VISA",
        "March",
        "2022",
        "120"
      ]
    },
    {
      "cells": [
        "priya",
        "dhasrhini",
        "chennai",
        "7485125631977451",
        "VISA",
        "March",
        "2022",
        "120"
      ]
    },
    {
      "cells": [
        "priya",
        "dhasrhini",
        "chennai",
        "7485125631977451",
        "VISA",
        "March",
        "2022",
        "120"
      ]
    },
    {
      "cells": [
        "priya",
        "dhasrhini",
        "chennai",
        "7485125631977451",
        "VISA",
        "March",
        "2022",
        "120"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepLoginH.user_should_enter_the_values_as(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click Book Now",
  "keyword": "And "
});
formatter.match({
  "location": "StepLoginH.user_should_click_Book_Now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should print the order id",
  "keyword": "Then "
});
formatter.match({
  "location": "StepLoginH.user_should_print_the_order_id()"
});
formatter.result({
  "status": "passed"
});
});