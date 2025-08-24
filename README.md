# 🚀 Selenium Automation Framework – OrangeHRM  

A robust **automation testing framework** built using **Java, Selenium WebDriver, TestNG, and Extent Reports** to perform **end-to-end UI testing** on the [OrangeHRM](https://opensource-demo.orangehrmlive.com/) application.  

This project ensures reliability, scalability, and maintainability of test scripts with structured design patterns and detailed reporting. 

---

## ✨ Overview  

This project automates **critical user journeys** on OrangeHRM such as login, employee management, and user interactions.  

It is designed with:  
✔️ **Reusability** – Write once, use across multiple test cases.  
✔️ **Scalability** – Easy to add new tests without breaking existing ones.  
✔️ **Maintainability** – Clean, modular, and structured code.  

---

## 🔑 Features  

- ✅ **End-to-End UI Testing** – Covers essential OrangeHRM workflows.  
- ✅ **Page Object Model (POM)** – Enhances test readability and reusability.  
- ✅ **Cross-Browser Testing** – Supports Chrome, Edge, and Firefox.  
- ✅ **TestNG Integration** – Provides flexible test execution and reporting.  
- ✅ **Extent Reports** – Beautiful, interactive HTML reports with screenshots.  

---

## 🛠️ Tech Stack  

- **Language** → Java  
- **Automation Tool** → Selenium WebDriver  
- **Testing Framework** → TestNG  
- **Build Tool** → Apache Maven  
- **Reporting** → Extent Reports  

---

## ⚙️ Setup & Installation  

1️⃣ **Clone the repository**  
```bash
git clone https://github.com/jangra1270/OrangeHRM-Automation_Testing.git
cd OrangeHRM-Automation_Testing
```

2️⃣ **Install dependencies**  
- Install **JDK (Java Development Kit)**  
- Install **Apache Maven**  

Run Maven to install required dependencies:  
```bash
mvn clean install
```

---

## ▶️ Running Tests  

Run all tests using:  
```bash
mvn test
```  

- The test suite is defined in **`testng.xml`**.  
- Selenium WebDriver will launch the browser, execute tests, and generate results.  

---

## 📊 Reporting  

After execution, detailed reports are generated:  

1. Navigate to the **`test-output`** folder.  
2. Open **`ExtentReports.html`** in a browser.  

✨ The report includes:  
- Test steps & execution logs  
- Pass/Fail status  
- Screenshots of failed steps  
- Interactive graphs  

