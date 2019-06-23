# springboot-exception-handling
springboot-exception-handling

Default excption thrown by Spring boot

{	
	"timestamp":"2019-06-23T04:03:52.398+0000",
	"status":500,
	"error":"Internal Server Error",
	"message":"...",
	"path":"/path"
}

Request 1:

GET : http://localhost:8080/books/5
resopnse :
{
    "timestamp": "2019/06/23 12:05:54",
    "status": 404,
    "error": "Not Found",
    "message": "Book id not found : 5",
    "path": "/books/5",
    "version": "1.2"
}

Request 2 :

GET http://localhost:8080/kk

resopnse :

{
    "timestamp": "2019/06/23 12:06:39",
    "status": 404,
    "error": "Not Found",
    "message": "No message available",
    "path": "/kk",
    "version": "1.2"
}

Request 3:

POST http://localhost:8080/books

request body 
{
    "name": "Spring Exceptions",
    "author": "Rama ",
    "price": 33
}

resopnse :

{
    "timestamp": "2019-06-23T06:40:02.377+0000",
    "status": 400,
    "errors": [
        "Author is not allowed."
    ]
}