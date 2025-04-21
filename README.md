Real-Time Chat Application
A real-time chat application built using Spring Boot, WebSocket, and STOMP for seamless, interactive messaging. This application allows users to send and receive messages instantly with a simple, user-friendly interface powered by Bootstrap.

Features:
Real-time communication: Messages are instantly broadcast to all connected clients using WebSocket and STOMP.

User-friendly Interface: Simple and responsive design for smooth interaction.

Message broadcasting: Messages sent by any user are broadcast to all connected users in real-time.

Seamless connection: Automatically connects users and establishes WebSocket communication with the backend.

Bootstrap styling: The UI is styled with Bootstrap for a clean, modern look.

Tech Stack:
Frontend: HTML, JavaScript, Bootstrap

Backend: Spring Boot, Spring WebSocket, STOMP

Message Broker: Simple Message Broker for real-time messaging.

How to Run:
Clone this repository.

Build and run the application using Maven:

bash
Copy code
mvn clean install
mvn spring-boot:run
Open your browser and navigate to http://localhost:8080/chat to start chatting.

Dependencies:
Spring Boot 3.x

Spring WebSocket

STOMP

SockJS

Bootstrap


