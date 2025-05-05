# Library
Spring Boot Library project with minimal Web UI
# Description
This is a project based on the Spring Boot framework, the Maven project builder and the Thymeleaf template engine, the minimum version of the **library**.
## Functions
### People
The app contains the functions of interacting with users at <ins>**localhost:8080/people**</ins>. Here you can do actions such as viewing a **list** of users, **adding**, **changing**, and **deleting** a **user**, as well as viewing a specific person with a **list of books** they have borrowed.
### Books
The <ins>**localhost:8080/books**</ins> address contains the functionality for interacting with **books**: viewing, adding, changing, deleting, and assigning an owner.
At <ins>**localhost:8080/books/search**</ins>, you can **search** for a book by the **beginning** of the title (you need to make a request in the address bar, the UI is not yet provided).
### Features
For the last 2 queries, there are **parameters** for pagination and sorting.:
1. page - integer, page number
2. books_per_page is an integer, the number of books per page.
3. sort_by_year - sort by ascending year of book release
## Data
All data during the operation of the application is stored in a **Postgres** database consisting of tables **person** and book, related to 1 to many.
Interaction with the database takes place using the **Spring Boot Data JPA** framework.
There is also a **validation** of the length of the entered **book title** and **author**, the ***user's name** and his **year of birth**, which must be at least 1931.
# Launch
To launch the application, download the archive, go to the Library folder and run the **docker-compose up -d** command from the terminal.
To turn it off, run **docker-compose stop**
To delete containers run **docker-compose down**
