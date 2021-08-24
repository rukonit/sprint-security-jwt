# Java-Spring-JWT-Authentication

This application is an back-end implmentation of Spring Security module with JWT token based authentication.


Repository: https://github.com/rukonit/sprint-security-jwt

## Technologies used

- Java
- Spring Web
- Spring Security
- Spring Boot
- JWT Web Token

## Features
Send a post request to http://localhost:8080/authenticate with json object in request body 
- Secure user authentication with JWT web token.


-Request body: {
                  "username": "demo",
                  "password": "demo"
              }
              
-Retrive the returned token and send a get request to http://localhost:8080/hello with header Authorization: Bearer Token.

## Future improvements
- Integrate this core module with other application to provide secure authentication


## Contribution

Please feel free to contribute to the project, and if any bug is found, please contact me at *rukon-it@live.com*.

## License

Copyright 2021 Rukon Khan

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.