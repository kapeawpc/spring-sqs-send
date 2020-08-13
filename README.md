# spring-aws-sqs
Sample code spring boot send message queue for Amazon-SQS

---
Example postman collections:

 `curl --location --request POST 'http://localhost:8080/sqs/quotes' \
  --header 'Content-Type: application/json' \
  --data-raw '{
      "home": {
          "get": {
              "data": [
                  {
                      "id": 1,
                      "name": "Steve"
                  }
              ]
          },
          "post": {
              "data": [
                  {
                      "id": 1,
                      "name": "Steve French"
                  }
              ]
          }
      },
      "/test/:id": {
          "get": {
              "data": [
                  {
                      "id": 1,
                      "name": "Steve"
                  }
              ]
          },
          "post": {
              "data": [
                  {
                      "id": 1,
                      "name": "Steve French"
                  }
              ]
          }
      }
  }'`