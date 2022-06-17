# simpleorder
## Test Controller (TestController.java)
- penggunaan path variabel dan path parameter 
curl http://localhost:8080/api/test/satu/hello?param1=your%20name
- penggunaan form-url-encoded
curl --location --request POST 'localhost:8080/api/test/tiga' --header 'Content-Type: application/x-www-form-urlencoded' --data-urlencode 'name=ali akbar' --data-urlencode 'dateBirth=1987-08-04'
- penggunaan request body json
curl --location --request POST 'localhost:8080/api/test/empat' --header 'Content-Type: application/json' --data-raw '{"name":"ali akbar","dateBirth":"1987-08-04"}'