# Backbase QA Test Assignment

Cover the CRUD operation plus the edge cases for herokuapp site

## Detailed explanation on Automation Framework

```
###Architecture Name:-  Hybrid POM flavored with Cucumber
```


###Project Structure:-

```
Helpers package:-
1. Config File - Used to store properties such as URL and browser name on which test suite to be executed.
2. DataGenerator - Used to generate random string to create Computer Name prefixed with SJTest
3. DateGenerator - Used to create random dates in the format of yyyy-mm-dd between 1900 - 2000 year. This random date data is used to fill date fields.
4. Log4J - To log output in console whenever needed
5. TimeOutUtil - Utility to place Timeouts
```

```
Modules:-
This will have keyword driven framework details aka. action driven classes
```

```
pageObjects:-
Locators of objects involved in pages of website.
```

```
step_definitions:-
This package has all step definitions and hooks class as well as Cucumber Runner class (where we can set options)
```

```
features:-
This package has all .feature files which represents different test scenarios written in plain english.
```

```
log4j properties:-
This package has settings to define log level and to set logging type
```


### Prerequisites

```
Import all dependencies mentioned in POM.
Editor Used:-  IntellijIDea
```

## Running the tests

```
Every feature file can be run individually. On feature file - just do right click and select Run feature file.
Or to run complete suite , right click on features folder.

```

## Report

```
Report can be found out at backbase-qa\target\cucumber-report-html\cucumber-html-reports\feature-overview.html
```

