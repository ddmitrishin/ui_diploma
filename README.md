# Automated testing of the site "Applied Technologies"

## :page_with_curl:         Content

➠ [Covered functionality](#globe_with_meridians-covered-functionality)

➠ [Technology stack](#computer-technology-stack)

➠ [Running tests from the terminal](#technologist-running-tests-from-the-terminal)

➠ [Remote Test Run](#удаленный-Remote-Test-Run)

➠ [Build in Jenkins](#-Главная-Build-in-Jenkins)

➠ [Test results report in Allure Report](#-Test-results-report-in-allure-report)

➠ [Test results report in Allure Report](#-Test-results-report-in-allure-report)

➠ [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)

➠ [An example of running a test in Selenoid](#-An-example-of-running-a-test-in-Selenoid)
## <a name="globe_with_meridians-covered-functionality"></a>:globe_with_meridians: Covered functionality

### UI

- [x] Проверка открытия страницы по тексту в заголовке
- [x] Проверка на ошибки в консоль логах страницы
- [x] Проверка перехода на страницу партнеров
- [x] Проверка на смену языка
- [x] Проверка перехода на страницу отзывов через выпадающий список

## :computer: Технологический стек

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
        State7: Allure TestOps
        State8: Selenoid
        State9: Allure Report
        State10: Telegram
        State11: STOP
        State1 --> State2
        State2 --> State3
        State3 --> State4
        State4 --> State5
        State5 --> State6
        State6 --> State7
        State6 --> State8
        State7 --> State8
        State8 --> State9
        State9 --> State10
        note right of State2 : Работа с кодом
        note left of State3 : Фреймворки
        note right of State4 : Сборка проекта
        note left of State5 : Система контроля версий и хостинг проекта
        note right of State6 : Параметризация и запуск сборки
        note left of State7 : Контейнеризация
        note right of State8 : Отчётность
        note left of State9 : Уведомления
```
## :technologist: Запуск тестов из терминала

### Локальный запуск тестов

```
gradle clean test
```

### Удаленный запуск тестов

```
clean test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteDriverUrl=https://${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### Параметры сборки

> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).
>
> <code>BROWSER_VERSION</code> – версия браузера (_по умолчанию - <code>99</code>_).
>
> <code>REMOTE_DRIVER_URL</code> – url селеноида.
>
> <code>THREADS</code> – кол-во потоков для параллельного запуска.
>





## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Главная страница сборки Jenkins

<p align="center">
  <img src="images/screenshots/Screenshot_1_main_jenkins.jpg">
</p>

## <img width="4%" title="Allure Report" src="images/logo/Allure_Report.svg"> Отчет о результатах тестирования в Allure Report

### :pushpin: Главная страница Allure-отчета

<p align="center">
<img title="Allure Overview" src="images/screenshots/Screenshot_2_allure_report.jpg">
</p>

### :pushpin: Страница с тестами


<p align="center">
<img title="Allure Behaviors" src="images/screenshots/Screenshot_3_tests.jpg">
</p>

### :pushpin: Основной дашборд

<p align="center">
<img width="30%"  title="Allure Overview Dashboard" src="images/screenshots/Screenshot_4_dashboard.jpg">
</p>

## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом.
<p align="center">
<img width="30%"  title="Telegram Notifications" src="images/screenshots/Screenshot_5_telegram_bot.jpg">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> Пример запуска теста в Selenoid

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже. Тест кейс на проверку перехода на страницу отзывов через выпадающий список
<p align="center">
  <img title="Selenoid Video" src="images/gif/26ab0f72fd334309.gif">
</p>

:blue_heart: <a target="_blank" href="https://t.me/YuriyMqa">t.me/dmitrishin13</a>