1. Run the SQL Scripts
 - Execute the SQL scripts in resources/sql (create_table.sql and insert.sql) on your MS SQL database to create the necessary tables and insert sample data.
 
2. Update Datasource Credentials
 - Open the application.properties file located in src/main/resources.
 - Update the datasource credentials to match your MS SQL database configuration.
  
3. Build and Run the Project
 - Build the project using Gralde: ./gradlew build
 - Run the project: ./gradlew bootRun
 
4. Access the API
 - The application will start on http://localhost:8080.
 - You can use tools like Postman or cURL to interact with the API endpoints.
 - Additionally, you can access the Swagger UI at http://localhost:8080/swagger-ui.html to view and test the API endpoints interactively.
