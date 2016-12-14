<h1>Fiegn Client for Spring Boot and Twitter Typeahead </h1>

The following example is a Feign client making an external call to a REST service
through Spring Boot and then allows Auto completion of the returned result set
with Twitter typeahead JS library.

Inspired by twitter.com's autocomplete search functionality, typeahead.js is a flexible 
JavaScript library that provides a strong foundation for building robust typeaheads.

![alt tag](https://dl.dropboxusercontent.com/u/15829935/platform-demos/images/piv-springboot-typeahead.png)

<h2> Push to Pivotal Cloud Foundry </h2>

- Clone project

```
$ got clone https://github.com/papicella/FeignClientExternalSpringBoot.git
```

- package it up

```
$ mvn package
```

- cf push using a manifest as follows

```
applications:
- name: springboot-typeahead 
  memory: 512M
  instances: 1
  random-route: true
  path: target/demo-0.0.1-SNAPSHOT.jar
```

<hr />
Pas Apicella [papicella at pivotal.io] is a Senior Platform Architect at Pivotal Australia 
