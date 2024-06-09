## `How to run?`

### A. Running normal test cases:

#### 1- Use direct command as below:

        mvn test

#### 2- To specify specific tags:

        mvn test -Dcucumber.filter.tags="@sanity and @FERegression"

### C. Generating/ Opening Allure report:

#### 1- Generate the report:

        allure generate ${allure-results-path} -o ${allure-report-path} --clean

#### 2- Open the report:

        allure open ${allure-results-path}

