<div align="center">
  <h1 align="center">ESGalpha Dashboard</h1>
  <p align="center">
    A full-stack web application for modeling the impact of ESG & macroeconomic data on global markets.
    <br />
  </p>
</div>

<div align="center">
  <a href="#"><img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"></a>
  <a href="#"><img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot"></a>
  <a href="#"><img src="https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB" alt="React"></a>
  <a href="#"><img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white" alt="Jenkins"></a>
  <a href="#"><img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker"></a>
</div>

---

## About The Project

**ESGalpha** is an advanced data analytics platform designed to explore the intricate relationship between Environmental, Social, and Governance (ESG) factors, macroeconomic indicators, and long-term investment behavior. In an era where sustainable investing is paramount, this tool empowers users to run scenario models by visualizing how changes in ESG scores and economic signals can influence market performance.

The application fetches real-time ESG data from **Refinitiv** and comprehensive macroeconomic data from the **World Bank API**. It provides an intuitive and interactive dashboard for users to analyze trends, understand correlations, and model future investment scenarios.

<br>

## Key Features

* **Interactive Dashboard:** A rich, responsive UI built with React for visualizing complex financial and ESG data.
* **ESG Scenario Modeling:** Tools to model how ESG signals influence long-term investment behavior across global markets.
* **Dual Data Integration:** Seamlessly serves data from both Refinitiv (for company-specific ESG scores) and the World Bank (for country-level macroeconomic signals).
* **Robust Backend:** A scalable backend built with Java & Spring Boot, providing structured data through REST APIs.
* **Containerized & Automated:** Fully containerized with Docker and features an automated CI/CD pipeline using Jenkins for reliable testing and deployment.

<br>

## Tech Stack

This project leverages a modern, full-stack architecture.

| Component    | Technologies                                                                                                                                                                                           |
| ------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| **Frontend** | `React` `JavaScript` `Axios` `Recharts` `HTML5` `CSS3`                                                                                                                                                   |
| **Backend** | `Java` `Spring Boot` `Spring Web` `Maven`                                                                                                                                                                |
| **DevOps** | `Git` `GitHub` `Docker` `Jenkins`                                                                                                                                                                        |
| **Data Sources** | `Refinitiv ESG API` `World Bank Open Data API`                                                                                                                                                       |

<br>

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

* **Git:** [https://git-scm.com/downloads](https://git-scm.com/downloads)
* **JDK 17+:** We recommend a distribution like Amazon Corretto or Eclipse Temurin.
* **Node.js & npm:** [https://nodejs.org/](https://nodejs.org/)
* **Docker:** [https://www.docker.com/products/docker-desktop/](https://www.docker.com/products/docker-desktop/)

### Installation & Setup

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/YourUsername/ESGalpha-Dashboard.git](https://github.com/YourUsername/ESGalpha-Dashboard.git)
    cd ESGalpha-Dashboard
    ```
    *Replace `YourUsername` and `ESGalpha-Dashboard` with your actual GitHub details.*

2.  **Run the Backend Server:**
    * Open the project in IntelliJ IDEA.
    * Navigate to the `Run` tool window.
    * Select `BackendApplication` and click the "Run" button.
    * The server will start on `http://localhost:8080`.

3.  **Run the Frontend Client:**
    * Open a new terminal in IntelliJ.
    * Navigate to the frontend directory: `cd frontend`
    * Install NPM packages: `npm install`
    * Start the development server: `npm start`
    * Your browser will open to `http://localhost:3000`.

<br>

## License

Distributed under the MIT License. See `LICENSE` for more information.

<br>

## Contact

Devansh Chaudhary - [devansh-codes](https://github.com/devansh-codes) Project Link: [https://github.com/devansh-codes/fullstack-ESG](https://github.com/devansh-codes/fullstack-ESG) ```
---

### Step 2: Remove the `assets` Folder and Push the Changes

Now, let's delete the unused image folder and commit our final `README.md` changes. We'll do this from the terminal.

1.  **Open the Terminal** in IntelliJ (make sure you're in the `esgalpha-backend` root folder).

2.  **Remove the folder:**
    * On Mac/Linux: `rm -rf assets`
    * On Windows: `rd /s /q assets`

3.  **Add all changes to Git:** (This will stage the README update and the folder deletion)
    ```bash
    git add .
    ```

4.  **Commit the changes:**
    ```bash
    git commit -m "Finalize README and remove image assets"
    ```

5.  **Push to GitHub:**
    ```bash
    git push origin main
    ```

Now, when you refresh your GitHub page, you will see a clean, professional, text-based README that loads instantly, and the unused `assets` folder will be gone.
