$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Forgotten.feature");
formatter.feature({
  "name": "",
  "description": "\t To validate the forgotten pwd functionality of instagram",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@forgot"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": " \tTo check with valid email and invalid passward",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@forgot"
    },
    {
      "name": "@data"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To pass the email and passward",
  "rows": [
    {
      "cells": [
        "email",
        "pwd"
      ]
    },
    {
      "cells": [
        "alvin@gmail.com",
        "12345"
      ]
    },
    {
      "cells": [
        "abcd@gmail.com",
        "efg"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.toPassTheEmailAndPassward(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});