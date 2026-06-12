WIPRO SDET BATCH-1 JAVA WITH SELENIUM DAILY TRAINING ASSIGNMENTS

# 🚀 Wipro SDET Training & Automation Engineering Repository

[![Java Version](https://img.shields.io/badge/Java-21%20%2F%2017-orange?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-WebDriver%204.x-green?style=for-the-badge&logo=selenium)](https://www.selenium.dev/)
[![Framework](https://img.shields.io/badge/Framework-TestNG%20%26%20Cucumber-blue?style=for-the-badge&logo=cucumber)](https://testng.org/)
[![Build Tool](https://img.shields.io/badge/Build%20Tool-Maven-red?style=for-the-badge&logo=apachemaven)](https://maven.apache.org/)
[![CI/CD](https://img.shields.io/badge/CI%2FCD-Jenkins%20Pipeline-blueviolet?style=for-the-badge&logo=jenkins)](https://www.jenkins.io/)

This repository serves as a centralized, production-grade archive of hands-on technical solutions, programmatic challenges, modular automation engineering architectures, and daily milestones completed during the **Wipro Software Development Engineer in Test (SDET) NGA Training Program**. 

The codebases contained herein transition systematically from foundational programming structures to enterprise-level Behavior-Driven Development (BDD) and Data-Driven test automation frameworks, containerized infrastructure testing, and modern continuous integration workflows.

---

## 🛠️ Corporate Stack & Technical Competencies

| Technology Domain | Tools & Ecosystem Components | Strategic Core Focus |
| :--- | :--- | :--- |
| **Core Languages** | `Java Standard Edition (17/21)`, `Groovy (Jenkinsfile)` | OOPs, Collections Engine, Exception Architecture |
| **Automation Engine** | `Selenium WebDriver 4.x` | Dynamic DOM Interrogation, Advanced Interaction Actions |
| **Test Orchestration**| `TestNG`, `JUnit 5` | Multi-threaded Execution, Parameterization Matrix, Assertions |
| **BDD Specification** | `Gherkin`, `Cucumber JVM` | Declarative Feature Mapping, State Sharing (`DI`) |
| **Dependency Engine** | `Apache Maven` | Automated Build Lifecycle Management, Plugin Binding |
| **Database Systems** | `Oracle SQL` / `MySQL` | Data Validation, Complex Relational Matrix Joins, Subqueries |
| **Virtualization** | `Docker`, `Docker-Compose` | Isolated Test Executions, Grid Scaling, Container Hubs |
| **CI/CD Orchestration**| `Jenkins (Declarative Pipelines)` | Infrastructure-as-Code Pipeline configurations, Automated Triggers |

---

## 📂 Structural Directory Topology

The file ecosystem is organized cleanly into domain-specific modules and chronologically structured daily practice labs to keep functional isolation high:

```text
Wipro-SDET_CapstoneProject/
├── .github/                       # GitHub workflow actions and platform settings
├── BDD_Cucumber/                  # Behavior-Driven Development suites (Feature files & Steps)
├── Docker/                        # Containerization configs, Dockerfiles, and Compose environments
├── Selenium_Maven_TestNG/         # Core TestNG automation test engines & XML test suites
├── SQL/                           # Advanced relational database verification scripts & query labs
├── day28/                         # Focused lab milestone: Target elements, dynamic alerts & windows
├── day37/                         # Focused lab milestone: Advanced TestNG execution data structures
├── src/                           # Source directory containing framework core components
│   ├── main/                      # Business logic, page objects, utility wrappers, and helpers
│   └── test/                      # Functional, Regression, Integration, and BDD step tests
├── testcases/                     # Independent executable test scripts and playground verifications
├── Jenkinsfile                    # Jenkins Infrastructure-as-Code pipeline execution configuration
└── pom.xml                        # Master Maven Project Object Model configuration file

```

---

## 📖 In-Depth Curricular Framework Focus

* **DOM Locators Architecture:** Industry-best practices using dynamic, optimized XPath axis mechanics (`following-sibling`, `ancestor`, `parent::`), and CSS selector strategies.
* **Synchronization Management:** Elimination of flaky tests by explicitly avoiding hardcoded Thread sleeps; implementation of robust `WebDriverWait` paired with `ExpectedConditions` and polling intervals using `FluentWait`.
* **Dynamic Web Component Traversal:** Robust automation handlers built for dynamic multi-layered frames, explicit security alert windows, user auth pop-ups, nested iframe environments, and complex dropdown selectors.
* **Advanced Interactions Native API:** Programmatic implementation of drag-and-drop actions, continuous mouse hovers, multi-key actions, element context-clicking, and automated horizontal/vertical canvas scrolling using the `Actions` class and JavaScript execution wrappers.

* **Execution Matrix Control:** Granular control over lifecycle execution hooks using structured annotations (`@BeforeSuite`, `@BeforeClass`, `@BeforeMethod`, `@Test`, and corresponding breakdown teardowns).
* **Enterprise Parameterization:** Implementation of external decoupling techniques using standard `testng.xml` parameters and complex runtime multi-dimensional arrays generated via `@DataProvider` matrices.
* **Advanced Control Flow Hooks:** Use of Custom Execution Listeners (`ITestListener`, `IRetryAnalyzer`) to automatically capture failure events, take screenshots, and auto-retry failed execution loops.
* **Scale Execution Optimization:** Designing parallel multi-threaded test runner layers for safe, simultaneous multi-browser cross-platform verification campaigns.

* **Expressive Gherkin Parsing:** Expressing business constraints and expected application behaviors through clearly documented `Feature Files` utilizing precise `Given-When-Then` structured directives.
* **Highly Parametric Scenarios:** Transforming distinct scripts into data-driven templates through `Scenario Outlines` backed by detailed iterative `Examples` data grids.
* **Data Structure Scoping:** Direct transformation of inline Gherkin data arrays into robust Java collections and explicit POJO models using advanced Step Data Tables.
* **State Injection & Custom Life Hooks:** Ensuring independent execution setups and targeted reporting via Scenario Tagging, global `@Before` / `@After` hooks, and context injection.

* **Dependency Pipeline Control:** Isolated compilation dependencies, test engine bindings, and artifact storage controls managed completely within the master `pom.xml`.
* **Build Phase Execution Overrides:** Binding specific plug-ins like `maven-compiler-plugin` to check JDK compliance, and linking `maven-surefire-plugin` directly to parallel test execution XML matrices.
* **Infrastructure-as-Code Pipelines:** Fully integrated, scalable declarative `Jenkinsfile` definitions providing seamless test orchestration. Features automated multi-branch checkout layers, global platform agent assignment, dynamic tool resolution mapping (`JDK21`, `Maven3`), explicit test evaluation blocks, and dynamic post-execution pipeline report archival.

* **Relational Database Interrogation:** Validating platform data changes using complex multi-table structure combinations (`INNER`, `LEFT`, `RIGHT`, `FULL OUTER JOIN`).
* **Complex Backend Data Processing:** Tracking system metrics via advanced database grouping commands (`GROUP BY`, `HAVING`) paired with analytical inner subqueries.
* **Isolated Environment Virtualization:** Containerizing runtime testing resources using strict `Dockerfiles` to provision stable, isolated dependencies instantly.
* **Distributed Selenium Grid Scaling:** Scaling up parallel executions on demand across ephemeral container browsers utilizing unified `docker-compose.yml` grids.

---

## 🚀 Locally Spin Up and Run the Suites

### System Requirements & Environmental Checklist

* Ensure Java Development Kit (**JDK 17 or JDK 21**) is installed and mapped properly to your local user system variables (`JAVA_HOME`).
* Apache Maven build system configured locally with executable paths mapped cleanly to system environment definitions (`M2_HOME`).
* Any contemporary Integrated Development Environment (IDE) such as **Eclipse IDE for Enterprise Java Developers** or **IntelliJ IDEA**.

### 1. Fetching the Project Source Code

Download the repository to your workspace by running this command in your local machine's terminal prompt:

```bash
git clone [https://github.com/thejolly911/Wipro-SDET_CapstoneProject.git](https://github.com/thejolly911/Wipro-SDET_CapstoneProject.git)
cd Wipro-SDET_CapstoneProject

```

### 2. Launching Execution Blocks via Terminal Command Line

To run your test suites outside of an IDE, execute these common standard Maven build commands directly from the project root directory:

```bash
# Run the complete test suite execution profile
mvn clean test

# Execute compilation only to verify dependency health
mvn compile

# Force dependency tree updates while launching automated tests
mvn clean test -U

---

## 🎯 Educational Goals & Core Philosophy

This infrastructure functions primarily as a progressive architectural archive of knowledge captured across the SDET career trajectory. Every layout and script inside this workspace maps out fundamental industry practices, showcasing how to build clean automation code, write reusable utilities, eliminate framework maintenance overhead, and build stable pipelines that support modern fast-paced delivery environments.

---

## ✒️ Author Profile & Contact

* **Engineer Name:** Arya Kumar Dash
* **Professional Track:** Software Development Engineer in Test (SDET)
* **Training Program:** Wipro Next-Gen Academic (NGA) Technical Track


