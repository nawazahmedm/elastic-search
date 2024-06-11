# elastic-search

First Download the Elastic Search Server from the below URL

https://www.elastic.co/

Open command prompt elasticsearch-7.17.21\bin and run elasticsearch.bat to start the elastic search server.

Open Postman and access http://localhost:9200/products

Elastic Server should be up before you test the End point APIs

1) GET http://localhost:8080/product/findAllProducts

2) Post http://localhost:8080/product/insertProduct
Request:
{
  "id": 1,
  "name": "Sample Product",
  "description": "This is a sample product description.",
  "quantity": 10,
  "price": 29.99
}

3) Post http://localhost:8080/product/updateProduct
Request:
{
  "id": 1,
  "name": "Sample Product",
  "description": "This is a sample product description.",
  "quantity": 10,
  "price": 20.99
}

4) Delete localhost:8080/product/deleteProduct?id=1



