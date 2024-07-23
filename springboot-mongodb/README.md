## Run MongoDB on docker using follwoing command:

```shell
docker run -d --name mongodb -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_PASSWORD=password -p 27017:27017 mongo
```

## Access Swagger-ui documentation
```
http://localhost:8080/swagger-ui/index.html
```