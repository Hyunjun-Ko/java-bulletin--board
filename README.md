# java-bulletin-board

> Bulletin board for sharing ideas

</br>

## 1. Development Timeline & Team Members

- 03/01/2024 ~ 03/30/2024
- personal project

</br>

## 2. Technologies Used

#### `Back-end`

- Java 17
- Spring Boot 3.1.0
- Gradle
- Spring Data JPA
- H2

#### `Front-end`

- thymeleaf
- mustache
- bootstrap v5.0.2

</br>

## 3. ERD Design (Entity-Relationship Diagram)

![erd](uploads/erd.png)

## 4. Core Features

![mainpage](uploads/mainpage.png)

Users can freely write new articles and add comments to articles with nicknames of their choice anonymously.

On the main page, articles are displayed with its unique id, title and content of the article.

![newarticle](uploads/newarticle.png)

When users click **New Article**, they can add new articles to the bulletin board.

![editarticle](uploads/editarticle.png)

And, articles can be edited and deleted as well as the comments on them when they are clicked on the main page.

<details> 
<summary><b>Expand Core Feature Description</b></summary> 
<div markdown="1">

### 4.1. Overall Flow

UML diagram
![erd](uploads/uml.png)

### 4.2. User Request

Users can make couple of requests such as CRUDs of comments and articles.

### 4.3. Controller

ArticleController
![articlecontroller1](uploads/articlecontroller1.png)

![articlecontroller2](uploads/articlecontroller2.png)

ArticleController utillizes ArticleService and CommentService to serve user requests at designated endpoints.

### 4.4. Service

ArticleService
![articleservice1](uploads/articleservice1.png)

![articleservice2](uploads/articleservice2.png)

CommentService
![commentservice1](uploads/commentservice1.png)

![commentservice2](uploads/commentservice2.png)

services provide crud operations of entities via repositories.

### 4.5. Repository

ArticleRepository
![articlerepository1](uploads/articlerepository1.png)

CommentRepository
![commentrepository1](uploads/commentrepository1.png)

</div>
</details>

</br>

## 5. Key Troubleshooting Issues

</br>

## 6. Additional Troubleshooting Issues

</br>

## 7. Reflection / Insights
