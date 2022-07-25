# Automated testing of the site "Applied Technologies"

## :page_with_curl:         Content

➠ [Covered functionality](#globe_with_meridians-covered-functionality)

➠ [Technology stack](#computer-technology-stack)

➠ [Running tests from the terminal](#technologist-running-tests-from-the-terminal)

➠ [Remote Test Run](#удаленный-Remote-Test-Run)

➠ [Build in Jenkins](#-Главная-Build-in-Jenkins)

➠ [Test results report in Allure Report](#-Test-results-report-in-allure-report)

➠ [Test results report in Allure TestOps](#-Test-results-report-in-allure-TestOps)

➠ [Telegram notifications using a bot](#-Telegram-notifications-using-a-bot)

➠ [An example of running a test in Selenoid](#-An-example-of-running-a-test-in-Selenoid)
## <a name="globe_with_meridians-covered-functionality"></a>:globe_with_meridians: Covered functionality

### UI

- [x] Open main page when press on title
- [x] Page console log should not have errors
- [x] Check content of Partners Page
- [x] Change Language to English
- [x] Open Feedback page from drop-down list 'About company'
- [x] Send request to company
- [x] Check content of Project Page
- [x] Check content of Career Page

## :computer:  Technology stack

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Allure Report" src="images/logo/alluretestops.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

```mermaid        
    stateDiagram-v2
        State1: START
        State2: Java & IntelliJ IDEA
        State3: Selenide & JUnit5
        State4: Gradle
        State5: GitHub
        State6: Jenkins
        State7: Selenoid
        State8: Allure Report and Allure TestOps
        State9: Telegram
        State10: STOP
        State1 --> State2
        State2 --> State3
        State3 --> State4
        State4 --> State5
        State5 --> State6
        State6 --> State7
        State7 --> State8
        State8 --> State9
        State9 --> State10
        note right of State2 : Working with code
        note left of State3 : Frameworks
        note right of State4 : Project build
        note left of State5 : Version control system and project hosting
        note right of State6 : Parameterization and run build
        note left of State7 : Containerization
        note right of State8 : Reporting
        note left of State9 : Notifications
```

## :technologist: Running tests from the terminal

### Local test run:

```
gradle clean test
```

### Remote test run:

```
clean
test
 -Dbrowser=${BROWSER}
 -DbrowserSize=${BROWSER_SIZE}
```

### Build Options

> <code>BROWSER</code> – the browser in which the tests will be run (_default - <code>chrome</code>_).
>
> <code>BROWSER_SIZE</code> – size of the browser window in which tests will be executed (_default - <code>1920x1080</code>_).
>





## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Jenkins Build Main Page

<p align="center">
  <img src="images/screenshots/Screenshot_1_main_jenkins.jpg">
</p>

## <img width="4%" title="Allure Report" src="images/logo/Allure_Report.svg"> Test results report in Allure Report

### :pushpin: Main page of the Allure report

<p align="center">
<img title="Allure Overview" src="images/screenshots/Screenshot_2_allure_report.jpg">
</p>

### :pushpin: Page with tests


<p align="center">
<img title="Allure Behaviors" src="images/screenshots/Screenshot_3_tests.jpg">
</p>

### :pushpin: Window with charts

<p align="center">
<img width="30%"  title="Allure Overview Dashboard" src="images/screenshots/Screenshot_4_dashboard.jpg">
</p>



## <img width="4%" title="Allure Report" src="images/logo/Allure_Report.svg"> Integration with AllureTestOps

### :pushpin: Test cases with launch history

<p align="center">
<img title="Allure Overview" src="images/screenshots/Screenshot_2_allure_report.jpg">
</p>

### :pushpin: Dashboard


<p align="center">
<img title="Allure Behaviors" src="images/screenshots/Screenshot_3_tests.jpg">
</p>



## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Telegram notifications using a bot

> After the build is completed, the bot created in <code>Telegram</code> automatically processes and sends a message with a report.
<p align="center">
<img width="30%"  title="Telegram Notifications" src="images/screenshots/Screenshot_5_telegram_bot.jpg">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> An example of running a test in Selenoid

> A video is attached to each test in the report. One of these videos is shown below. Test case for checking the sending of an application to the company
<p align="center">
  <img title="Selenoid Video" src="images/gif/26ab0f72fd334309.gif">
</p>

:blue_heart: <a target="_blank" href="https://t.me/YuriyMqa">t.me/dmitrishin13</a>