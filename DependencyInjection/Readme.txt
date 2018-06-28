Spring - Dependency Injection

1) Constructor based dependency injection

In this approach, the @Autowired annotation is applied on a bean constructor to inject Employee object.

@Component annotation indicates that an annotated class is a "component". 
Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.

2) Setter based dependency injection

In this approach, the @Autowired annotation is applied on a bean's setter method to inject the Department object as follows.
