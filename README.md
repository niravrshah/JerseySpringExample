Welcome to JerseySpringExample!
===================

This project demonstrate the simple implementation of provisioning your **REST** based Web Service infrastructure using the best breeds of libraries.

What's Included
-------------

 1. ***[Jersey](https://jersey.java.net/)*** - The reference implementation of the JAX-RS from Oracle.
    Provides a very rich, and robust API for implementing RESTful
    Services, including a client Library
 2. Utilize the [***Faster-XML***](http://wiki.fasterxml.com/JacksonHome) and [***Hibernate object mapper***](https://github.com/FasterXML/jackson-datatype-hibernate) to remove the  **[JSON circular dependencies issue](https://github.com/niravrshah/JerseySpringExample/blob/master/src/main/java/com/shah/java/reference/service/ws/client/ReferenceEntityServiceClient.java)**
 3. Demonstrate different reference examples regarding building different CRUD based entity service (*[BaseService](https://github.com/niravrshah/JerseySpringExample/blob/master/src/main/java/com/shah/java/service/ws/BaseService.java)*, *[BaseCrudEntityService](https://github.com/niravrshah/JerseySpringExample/blob/master/src/main/java/com/shah/java/service/ws/entity/BaseCrudEntityService.java)* etc..)
 4. **[*Jersey Client utility*](https://github.com/niravrshah/JerseySpringExample/blob/master/src/main/java/com/shah/java/util/JerseyUtil.java)** with [***sample code***](https://github.com/niravrshah/JerseySpringExample/blob/master/src/main/java/com/shah/java/reference/service/ws/client/ReferenceEntityServiceClient.java) which could help to **make a system to system call to REST resources**
 4. Provide **Jersey Jackson + Spring integration**
 5. Demonstrate an examples to build the **REST based CRUD services**
 7. **Web Service Discovery** using **[WADL](https://en.wikipedia.org/wiki/Web_Application_Description_Language)** implementation
