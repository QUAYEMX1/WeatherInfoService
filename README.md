# Weather Information Service

## Overview

**The Weather Information Service** is a Spring Boot application that retrieves current weather information for a specified city using the OpenWeatherMap API. This service provides a RESTful API endpoint that accepts a city name and an API key, returning the weather data in JSON format.

## Features

- **Fetch Current Weather Data**: Retrieve weather information for a specified city.
- **Easy Integration**: Seamlessly connects with the OpenWeatherMap API.
- **RESTful API Design**: Simple and intuitive API for easy access to weather data.

## Project Structure

### Backend

- **Framework**: Spring Boot
- **Language**: Java
- **Development Environment**: IntelliJ IDEA

#### Controller Class

The `WeatherController` class handles API requests for retrieving weather information. The endpoints are as follows:

- **GET** `localhost:8080/api/weatherService/GetWeatherInfo?city={city}&apiKey={apiKey}`: Fetch the current weather information for the specified city.

## Technologies Used

### Backend

- **Java Spring Boot**

### Development Tools

- **IntelliJ IDEA** (Backend)
-**Postman** (Testing Purpose)

## Getting Started

### Prerequisites

Before begin, you have the following installed:

- **Java 17 or higher**
- **Maven**
- **An IDE** (e.g., IntelliJ IDEA)
- **An OpenWeatherMap API key** (sign up at [OpenWeatherMap](https://openweathermap.org/api) to get an API key).
- i have Provided the my API Key in Application.Properties, you can use the same to run the Application
  **Application.Properties=**Here You will get my API Key

### Installation

1. **Clone the Repository**:

    ```bash
    git clone: https://github.com/QUAYEMX1/WeatherInfoService.git
    cd WeatherInformationService
    ```

2. **Set Up the Backend**:
   - Open the backend project in IntelliJ IDEA.
   - Configure your application properties for the OpenWeatherMap API key.

3. **Run the Application**:
   - Start the backend server using the command:
     ```bash
     mvn spring-boot:run
     ```

### API Usage

- To retrieve the current weather information for a city, send a GET request to:
  http://localhost:8080/api/weatherService/GetWeatherInfo?city={city}&apiKey={apiKey}

  
## Troubleshooting

- **Ensure we have the correct Java version**: This application is compatible with Java 17 or higher(21).
- **Check your API key**: Make sure OpenWeatherMap API key is valid and has the necessary permissions.
- **Port conflicts**: If port 8080 is already in use,we can change the port in `application.properties` by adding `server.port=8081` (or any other available port).

## Conclusion

The **Weather Information Service** provides a simple and efficient way to access current weather data for any city, enhancing the user's ability to stay informed about weather conditions.
