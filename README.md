# micro-service-eureka

ลำดับการ start
1. start ตัว eureka server ก่อน
2. start ตัว eureka client ที่เหลือ


- client แต่ละตัวจะเป็นอิสระต่อกัน (store, product, order, user, payment)
- จำกัดการเข้าถึงของ network ได้,
    - store ให้เข้าถึงจาก external network ได้,
    - product ให้เข้าถึงได้เฉพาะ internal network เท่านั้น,
    - ระหว่าง store กับ product จะสือสารกันเฉพาะ internal network

client product
- เรียกผ่าน restapi get /products

    `$ curl --request GET --url http://localhost:9092/products`

client store
- เรียกผ่าน restapi get /stores/products

    `$ curl --request GET --url http://localhost:9091/stores/products`

- ข้างหลังจะเรียกไป client product อีกที ผ่านทาง consumer product


