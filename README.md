"# **quickApp**" 

**Describe**:The project apply quick development app .

**1. Project profile**
  * Language: java
  * Framework: spring-boot
  * Build tool: gradle <a href="https://gradle.org/">Quick start</a>
  * Deploy:docker <a href="https://www.docker.com/">Quick start</a>
  
**2. Quick start**

  * Build source
  * `git clone https://github.com/sky233/quickApp.git `
  * `cd quickApp` 
  * `gradle build`
  * `gradle singleApp:bootRun`
  * view: <a href="http://localhost:8080">http://localhost:8080</a>
  * If you use docker : 
  * `docker pull sky233/single-app`
  * `docker run -d --name server_singleApp -p 8080:8080 sky233/single-app`
  * view: `http://YOU_IP:8080`