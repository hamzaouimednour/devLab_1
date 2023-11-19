# devLab_1

## Back-End (Spring Boot)
- Create a Spring Boot Project at (https://start.spring.io/) with the following dependencies:
  - Spring Web
  - Spring Data JPA
  - H2 Database (for simplicity, replace with your preferred database in a real-world scenario)
  - Spring Boot DevTools

## Front-End (Angular)
```bash
# Install Angular CLI
npm install -g @angular/cli

ng new webapp
cd webapp
ng generate environments
ng generate c UserList
ng generate c UserDetails
ng generate s services/user
ng generate s services/http-error-handler
# ...

# serve webapp
ng build
# ng build --configuration=production  # or using ( --prod )
ng serve
```

# Proxy setup
1. Create file `src/proxy.conf.json`
2. Add this content ( based on burpSuite config ;) ):
  ```json
  {
    "/api": {
      "target": "http://localhost:8080",
      "secure": false
    }
  }
  ```
3. Add `proxyConfig` option under `serve` entry in `angular.json` :
```json
…
  "architect": {
    "serve": {
      "builder": "@angular-devkit/build-angular:dev-server",
      "options": {
        "browserTarget": "your-application-name:build",
        "proxyConfig": "src/proxy.conf.json"
      },
…
```